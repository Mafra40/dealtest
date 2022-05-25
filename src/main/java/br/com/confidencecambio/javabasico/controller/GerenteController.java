package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.service.GerenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("gerente")
public class GerenteController {

    @Autowired
    GerenteService gerenteService;

    @PostMapping
    public Gerente save(@RequestBody Gerente gerente){
        return gerenteService.save(gerente);
    }

    @GetMapping
    public List<Gerente> findAll(){
        return gerenteService.findAll();
    }


}
