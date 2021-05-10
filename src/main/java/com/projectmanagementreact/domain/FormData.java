package com.projectmanagementreact.domain;


import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class FormData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable=false,unique = true)
    private Long id;

    @Column(length = 3000)
    private String data;
}
