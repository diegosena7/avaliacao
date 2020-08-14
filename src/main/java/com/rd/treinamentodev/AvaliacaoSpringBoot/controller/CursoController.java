package com.rd.treinamentodev.AvaliacaoSpringBoot.controller;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CursoController {

    @Autowired
    private CursoService service;

    @PostMapping("/gravacurso")
    public CursoDTO cadastraCurso(@RequestBody CursoDTO cursoDTO) throws Exception {
        service.cadastraCurso(cursoDTO);
        return cursoDTO;
    }
}
