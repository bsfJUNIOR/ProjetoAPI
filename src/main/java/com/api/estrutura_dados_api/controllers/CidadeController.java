package com.api.estrutura_dados_api.controllers;

import com.api.estrutura_dados_api.entidades.Cidade;
import com.api.estrutura_dados_api.service.CidadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cidades")
@RequiredArgsConstructor
public class CidadeController {

    private final CidadeService cidadeService;

    @GetMapping("/buscar-codigo-ibge/{codigoIbge}")
    public Cidade buscarCidadePorCodigoIbge(@PathVariable Integer codigoIbge) {
        return cidadeService.buscarPorCodigoIbge(codigoIbge);
    }

    @GetMapping("/buscar-cidade-por-nome/{nome}")
    public List<Cidade> buscarCidadePorNome(@PathVariable String nome) {
        return cidadeService.buscarCidadesPorNome(nome);
    }
}
