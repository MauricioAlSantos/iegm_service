package com.example.demo.repositories;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Remessa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(RemessaRepository.REMESSA_REPOSITORY)
public interface RemessaRepository
       extends JpaRepository<Remessa, Long> {
    public static final String REMESSA_REPOSITORY = "RemessaRepository";
    Remessa findRemessaByNomeEnte(String nomeEnte);
    List<Remessa> findAllByAno(Integer ano);
    Optional<Remessa> findById(Long id);
}

