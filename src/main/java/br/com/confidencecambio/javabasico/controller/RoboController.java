package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.Robo;
import br.com.confidencecambio.javabasico.service.RoboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("robo")
public class RoboController {

    @Autowired
    RoboService roboService;

    @PostMapping
    public Robo save(@RequestBody Robo robo){
        return roboService.save(robo);
    }

    @GetMapping
    public List<Robo> findAll(){
        return roboService.findAll();
    }
}
