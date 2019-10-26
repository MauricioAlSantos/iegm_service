package com.example.demo.repositories;

import java.util.List;

import com.example.demo.models.Remessa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("remessaRepository")
public interface RemessaRepository 
       extends JpaRepository<Remessa, Long> {
    Remessa findRemessaByNomeEnte(String nomeEnte);
    List<Remessa> findAllByAno(Integer ano);
}

