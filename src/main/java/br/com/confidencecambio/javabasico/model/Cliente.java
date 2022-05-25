package br.com.confidencecambio.javabasico.model;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cliente")
public class Cliente  extends ModelEntity {



}
