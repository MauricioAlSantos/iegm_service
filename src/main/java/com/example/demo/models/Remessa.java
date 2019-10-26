package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(schema = "iegm",name= "remessa")
public class Remessa {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="remessa_id")
    private Long id;

    @Column(name="nome_ente")
    private String nomeEnte;

    @Column(name="ano")
    private Integer ano;
}