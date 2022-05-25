package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.model.Robo;
import br.com.confidencecambio.javabasico.repository.RoboRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoboService {

    @Autowired
    RoboRepository roboRepository;

    public Robo save(Robo robo){
        return roboRepository.save(robo);
    }

    public List<Robo> findAll(){
        return roboRepository.findAll();
    }
}
