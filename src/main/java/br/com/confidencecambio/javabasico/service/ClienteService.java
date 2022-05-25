package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.repository.ClienterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService  {

    @Autowired
    ClienterRepository clienterRepository;

    public Cliente save(Cliente cliente){
        return clienterRepository.save(cliente);
    }

    public List<Cliente> findAll(){
        return clienterRepository.findAll();
    }

}
