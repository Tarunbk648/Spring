package com.xworkz.ns200spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="ns_info")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class NsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="model_Id")
    private int modelId;

    @Column(name="user_Name")
    private String userName;

    @Column(name="model_Name")
    private String modelName;

    @Column(name="user_Address")
    private String userAddress;
}
