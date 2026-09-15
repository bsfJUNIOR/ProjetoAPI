package com.api.estrutura_dados_api.service;

import com.api.estrutura_dados_api.entidades.Cidade;
import com.api.estrutura_dados_api.repository.CidadeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CidadeService {

    private final CidadeRepository cidadeRepository;

    public Cidade buscarPorCodigoIbge(Integer codigoIbge) {
        return cidadeRepository.findByIbge(codigoIbge)
                .orElseThrow(() -> new RuntimeException("Cidade não encontrada!"));
    }

    public List<Cidade> buscarCidadesPorNome(String nome) {
        return cidadeRepository.findFirst10ByNomeContainingIgnoreCase(nome);
    }
}
