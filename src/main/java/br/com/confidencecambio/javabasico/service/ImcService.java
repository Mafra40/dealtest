package br.com.confidencecambio.javabasico.service;


import org.springframework.stereotype.Service;

@Service
public class ImcService {

    /**
     * Criar um serviço REST que recebe como parametros peso e altura, retornando o IMC que pode ser calculado pela formula abaixo:
     *
     * imc = Peso/Altura²
     * @return imc
     */
    public double calcularImc(double peso, double altura){
        return peso / ( Math.pow(altura, 2)) ;
    }
}
