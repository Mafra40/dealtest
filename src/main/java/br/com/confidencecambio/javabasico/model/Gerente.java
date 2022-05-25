package br.com.confidencecambio.javabasico.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "gerente")
public class Gerente extends ModelEntity {

}
