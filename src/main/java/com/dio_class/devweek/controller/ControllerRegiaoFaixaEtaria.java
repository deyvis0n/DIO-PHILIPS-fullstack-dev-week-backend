package com.dio_class.devweek.controller;

import com.dio_class.devweek.entity.FaixaEtaria;
import com.dio_class.devweek.repository.FaixaEtariaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerRegiaoFaixaEtaria {

    private FaixaEtariaRepo feRepository;

    public ControllerRegiaoFaixaEtaria(FaixaEtariaRepo fRepository) {
        this.feRepository = fRepository;
    }

    @GetMapping("/faixaetaria")
    public ResponseEntity<?> findAllFaixaEtaria() {
        try {
            List<FaixaEtaria> lista = feRepository.findAll();
            return new ResponseEntity<>(lista, HttpStatus.OK);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/faixaetaria/{id}")
    public ResponseEntity<?> findByIdFaixaEtaria(@PathVariable long id) {
        try {
            Optional<FaixaEtaria> unidOptional = feRepository.findById(id);
            if (unidOptional.isPresent()) {
                FaixaEtaria faixaEtaria = unidOptional.get();
                return new ResponseEntity<>(faixaEtaria, HttpStatus.OK);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/faixaetaria/novo")
    public FaixaEtaria newFaixaEtariaRepo(@RequestBody FaixaEtaria newFaixaEtaria) {
        return feRepository.save(newFaixaEtaria);
    }

    @DeleteMapping("/faixaetaria/remover/{id}")
    public void deleteFaixaEtaria(@PathVariable long id) {
        feRepository.deleteById(id);
    }
}
