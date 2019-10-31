package com.example.demo.services;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Remessa;
import com.example.demo.repositories.RemessaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

   public Remessa updateRemessa(Remessa remessa, Long id) {
     Remessa updateremessa = remessaRepository.findById(id).orElse(null);
     final Remessa myremessa = remessaRepository.save(updateremessa);
     return myremessa;
   }

   public Boolean deleteRemessa (Long id) {
      Remessa delremessa  = remessaRepository.findById(id).orElse(null);
      if(delremessa != null) {
          remessaRepository.delete(delremessa);
          return true;
      }
      return false;
   }

public Optional<Remessa> getRemessaById(Long id) {
	return remessaRepository.findById(id);
}
}