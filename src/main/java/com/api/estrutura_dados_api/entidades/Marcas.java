package com.api.estrutura_dados_api.entidades;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Getter
@Setter

public class Marcas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String Id;
    private String Nome;

}
