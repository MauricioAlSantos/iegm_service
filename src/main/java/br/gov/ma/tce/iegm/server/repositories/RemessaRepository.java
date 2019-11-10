package br.gov.ma.tce.iegm.server.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.ma.tce.iegm.server.beans.remessa.Remessa;

@Repository(RemessaRepository.REMESSA_REPOSITORY)
public interface RemessaRepository
       extends JpaRepository<Remessa, Integer> {
    public static final String REMESSA_REPOSITORY = "RemessaRepository";
    Remessa findRemessaByNomeEnte(String nomeEnte);
    List<Remessa> findAllByAno(Integer ano);
    Optional<Remessa> findById(Integer id);
    List<Remessa> findAllByAnoAndEnvioNotNull(Integer ano);
    List<Remessa> findAllByAnoAndValidadoTrue(Integer ano);
}

