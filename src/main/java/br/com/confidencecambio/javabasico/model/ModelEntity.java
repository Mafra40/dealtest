package br.com.confidencecambio.javabasico.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
public class ModelEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long id;

    @NotNull(message = "Nome não pode ser nulo")
    @NotEmpty(message = "Nome não pode ser vazio")
    @NotBlank(message = "Não pode iniciar com espaços em branco")
    @Pattern(regexp = "[^\\s]+[a-zA-Z ]*[^\\s]$", message = "Não pode conter espaços em branco no início e fim do nome")

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public String getFirstName(){
        String[] split = this.nome.trim().split(" ");
        return split[0];
    }

    public String getLastName(){
        String[] split = this.nome.trim().split(" ");
        if (split.length > 2 ) {
            return split[split.length - 2] +" "+split[split.length - 1];
        }else{
            return split[split.length - 1];
        }
    }

    public String getUperCase(){
        return this.nome.trim().toUpperCase();
    }


    public String getNomeAbreviado(){
        String[] split = this.nome.trim().split(" ");
        String retorno = "";
        for (int i = 0; i < split.length; i++) {
            if ( !split[i].equals("")) {
                if (i != 0 && i != split.length - 1) {
                    retorno += split[i].substring(0, 1).toUpperCase() + ". ";
                } else {
                    retorno += split[i] + " ";
                }
            }
        }
        return retorno.trim();
    }
}