package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cliente")
public class ClienteController {

    @Autowired
    ClienteService clienteService;

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente){
       return clienteService.save(cliente);
    }

    @GetMapping
    public List<Cliente> findAll(){
        return clienteService.findAll();
    }
}
