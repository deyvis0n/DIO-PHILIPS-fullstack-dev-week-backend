package com.dio_class.devweek.controller;

import com.dio_class.devweek.entity.Regiao;
import com.dio_class.devweek.repository.RegiaoRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerRegiao {

    private final RegiaoRepo reRepository;

    public ControllerRegiao(RegiaoRepo repository) {
        this.reRepository = repository;
    }

    @GetMapping("/regioes")
    public List<Regiao> getRegiao() {
        return reRepository.findAll();
    }

    @GetMapping("/regiao/{id}")
    public ResponseEntity<?> getRegiaoById(@PathVariable Long id) {
        Optional regiaoEscolhidaOptional = reRepository.findById(id);
        if (regiaoEscolhidaOptional.isPresent()) {
            Object regiaoEscolhida = regiaoEscolhidaOptional.get();
            return new ResponseEntity<>(regiaoEscolhida, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/regiao/novo")
    public void putRegiao(@RequestBody Regiao newRegiao) {
        reRepository.save(newRegiao);
    }

    @DeleteMapping("/regiao/delete/{id}")
    public void deleteRegiao(@PathVariable Long id) {
        reRepository.deleteById(id);
    }
}
