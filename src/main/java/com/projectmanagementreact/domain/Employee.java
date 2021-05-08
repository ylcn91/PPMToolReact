package com.projectmanagementreact.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    private String username;

    @NotBlank(message = "ERP number cannot be empty.")
    private String erpNo;

    @NotBlank(message = "name and surname cannot be null.")
    private String nameSurname;

    @NotBlank(message = "mail cannot be null.")
    @Email(message = "please correct your email adress.")
    private String mail;

    private String position;
    private String department;
    private String hospital;
    private String manager;
    private int status;
    private int hospitalCode;

    @OneToMany(fetch = FetchType.EAGER,
            cascade = CascadeType.ALL,orphanRemoval = true)
    @JoinColumn(name = "employee_id")
    private List<Worklist> work = new ArrayList<>();

    @Column(updatable = false)
    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date created_At;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date updated_At;


    @PrePersist
    protected void onCreate() {
        this.created_At = new Date();
    }

    @PreUpdate
    protected void onUpdate() {
        this.updated_At = new Date();
    }

}
