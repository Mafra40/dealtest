package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.model.Gerente;
import br.com.confidencecambio.javabasico.repository.GerenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GerenteService {

    @Autowired
    GerenteRepository gerenteRepository;

    public Gerente save(Gerente gerente){
        return gerenteRepository.save(gerente);
    }

    public List<Gerente> findAll(){
        return gerenteRepository.findAll();
    }
}
