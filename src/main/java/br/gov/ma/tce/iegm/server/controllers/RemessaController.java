package br.gov.ma.tce.iegm.server.controllers;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

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

import br.gov.ma.tce.iegm.server.beans.remessa.Remessa;
import br.gov.ma.tce.iegm.server.services.RemessaService;

@RestController
@RequestMapping("/remessa")
public class RemessaController {
  @Autowired
  private RemessaService remessaService;

  @GetMapping("/all")
  public List<Remessa> all() {
     return remessaService.getAllRemessas();
  }
  @GetMapping("/")
  public Remessa getRemessaById(@Valid @RequestParam Integer id) {
     return remessaService.getRemessaById(id).get();
  }
  @GetMapping("/remessasAno")
  public List<Remessa> getAllRemessasByAno(@Valid @RequestParam Integer ano){
    System.out.println("Nº remessas:"+remessaService.getAllRemessasByAno(ano).size()); 
    return remessaService.getAllRemessasByAno(ano);
  }
  @GetMapping("/remessas/{ano}")
  public List<Remessa> getAllRemessasByAnoPath(@PathVariable Integer ano){
    System.out.println("Ano:"+ano); 
    return remessaService.getAllRemessasByAno(ano);
  }

  @PostMapping("/remessas")
  public ResponseEntity<Remessa> createRemessa (@Valid @RequestBody Remessa remessa) {
      return ResponseEntity.ok(remessaService.saveRemessa(remessa));
  }

  @PutMapping("/remessa/{id}")
  public ResponseEntity<Remessa> updateRemessa(@Valid @RequestBody Remessa remessa,
    @PathVariable(value= "id") Integer id) {
        System.out.println(remessa.getNomeEnte());
        return ResponseEntity.ok(remessaService.updateRemessa(remessa, id));
    }

  @DeleteMapping("/remessa/{id}")
  public ResponseEntity<?> deleteRemessa(@PathVariable Integer id) {
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