package br.gov.ma.tce.iegm.server.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.ma.tce.iegm.server.beans.remessa.Remessa;
import br.gov.ma.tce.iegm.server.repositories.RemessaRepository;

@Service
public class RemessaService {
   @Autowired
   private RemessaRepository remessaRepository;

   public Remessa findRemessaByNomeEnte(String nomeEnte) {
       return remessaRepository.findRemessaByNomeEnte(nomeEnte);
   }

   public List<Remessa> getAllRemessasByAno(Integer ano){
       return remessaRepository.findAllByAno(ano);
   }

   public List<Remessa> getAllRemessas() {
       return remessaRepository.findAll();
   }

   public Remessa saveRemessa(Remessa remessa) {
       return remessaRepository.save(remessa);
   }

   public Remessa updateRemessa(Remessa remessa, Integer id) {
     Remessa updateremessa = remessaRepository.findById(id).orElse(null);
     if(updateremessa!=null){
        return remessaRepository.save(remessa);
     }
     return null;
   }

   public Boolean deleteRemessa (Integer id) {
      Remessa delremessa  = remessaRepository.findById(id).orElse(null);
      if(delremessa != null) {
          remessaRepository.delete(delremessa);
          return true;
      }
      return false;
   }

public Optional<Remessa> getRemessaById(Integer id) {
	return remessaRepository.findById(id);
}
}