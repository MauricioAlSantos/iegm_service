package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getNomeEnte(){
        return this.nomeEnte;
    }
    public void setNomeEnte(String nomeEnte){
        this.nomeEnte = nomeEnte;
    }
    public void setAno(Integer ano){
        this.ano = ano;
    }
    public Integer getAno(){
        return this.ano;
    }


}