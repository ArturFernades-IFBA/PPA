package com.ifba.amparatech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data

public class Vitima {
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private String contatoemergencia;
    
}