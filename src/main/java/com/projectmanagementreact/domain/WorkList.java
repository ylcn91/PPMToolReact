package com.projectmanagementreact.domain;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class WorkList {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(unique = true, nullable = false)
    private Long id;

    private String in;
    private String out;
    private double totalHour;

    @JsonFormat(pattern = "yyyy-mm-dd")
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY)
    private Employee employee;

}
