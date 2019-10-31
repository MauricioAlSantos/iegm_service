package com.example.demo.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.example.demo.models.Remessa;
import com.example.demo.services.RemessaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class RemessaController {
  @Autowired
  private RemessaService remessaService;

  @GetMapping("/remessas")
  public List<Remessa> all() {
     return remessaService.getAllRemessas();
  }
  @GetMapping("/remessa")
  public Remessa getRemessaById(@Valid @RequestParam Long id) {
     return remessaService.getRemessaById(id).get();
  }
  @GetMapping("/remessasAno")
  public List<Remessa> getAllRemessasByAno(@Valid @RequestParam Integer ano){
     return remessaService.getAllRemessasByAno(ano);
  }
  @GetMapping("/remessas/{ano}")
  public List<Remessa> getAllRemessasByAnoPath(@PathVariable Integer ano){
     return remessaService.getAllRemessasByAno(ano);
  }

  @PostMapping("/remessas")
  public ResponseEntity<Remessa> createRemessa (@Valid @RequestBody Remessa remessa) {
      return ResponseEntity.ok(remessaService.saveRemessa(remessa));
  }

  @PutMapping("/remessas/{id}")
  public ResponseEntity<Remessa> updateRemessa(@Valid @RequestBody Remessa remessa,
    @PathVariable(value= "id") Long id) {
        return ResponseEntity.ok(remessaService.updateRemessa(remessa, id));
    }

  @DeleteMapping("/remessa/{id}")
  public ResponseEntity<?> deleteRemessa(@PathVariable Long id) {
    Map<String,String> response = new HashMap<String,String>();
    if(remessaService.deleteRemessa(id)) {
      response.put("status", "success");
      response.put("message", "remessa deleted successfully");
       return ResponseEntity.ok(response);
    } else {
      response.put("status", "error");
      response.put("message", "Somthing went wrong when delete the remessa");
      return ResponseEntity.status(500).body(response);
    }
  }
}