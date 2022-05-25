package br.com.confidencecambio.javabasico.controller;

import br.com.confidencecambio.javabasico.model.Cliente;
import br.com.confidencecambio.javabasico.repository.ClienterRepository;
import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("imc")
public class ImcController {


    @Autowired
    ImcService imcService;

    /**
     * Criar um serviço REST que recebe como parametros peso e altura, retornando o IMC que pode ser calculado pela formula abaixo:
     *
     * imc = Peso/Altura²
     * @return imc
     */
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/{peso}/{altura}")
    public String getImc(@PathVariable double peso, @PathVariable double altura){

      List<Cliente> lista =  clienterRepository.findAll();

      Cliente novoCliente = new Cliente();
        clienterRepository.save(novoCliente);

      return "O IMC é: " + imcService.calcularImc(peso , altura);
    }

    @Autowired
    ClienterRepository clienterRepository;



}
