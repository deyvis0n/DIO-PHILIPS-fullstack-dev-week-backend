package com.dio_class.devweek.controller;

import com.dio_class.devweek.entity.Incidencia;
import com.dio_class.devweek.repository.IncidenciaRepo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class ControllerIncidencia {

    private final IncidenciaRepo icRespository;

    public ControllerIncidencia(IncidenciaRepo icRespository) {
        this.icRespository = icRespository;
    }

    @GetMapping("/incidencia")
    public ResponseEntity<List<Incidencia>> findIncidencias() {
        List<Incidencia> listIncidencia = icRespository.findAll();
        if (listIncidencia.isEmpty())
            return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
        return new ResponseEntity<>(listIncidencia, HttpStatus.OK);
    }

    @GetMapping("/incidencia/{id}")
    public ResponseEntity<Incidencia> findIncidenciasById(@PathVariable Long id) {
        Optional<Incidencia> incidenciaOptional = icRespository.findById(id);
        if (incidenciaOptional.isPresent()) {
            Incidencia incidenciaUnid = incidenciaOptional.get();
            return new ResponseEntity<>(incidenciaUnid, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/incidencia/novo")
    public Incidencia newIncidencia(@RequestBody Incidencia newIncidencia) {
        return icRespository.save(newIncidencia);
    }
}
