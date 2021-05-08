package com.projectmanagementreact.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Worklist {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false,unique = true)
    private Long id;

    private String giris;
    private String cikis;
    private double totalHour;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date date;



    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;

}
