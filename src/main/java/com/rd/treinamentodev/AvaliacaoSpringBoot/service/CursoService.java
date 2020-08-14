package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.service.bo.CursoBO;
import com.sun.org.apache.xpath.internal.objects.XNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.sun.tools.doclint.Entity.nu;

@Service
public class CursoService {

    @Autowired
    private CursoRepository repository;

    @Autowired
    private CursoBO cursoBO;

    public void cadastraCurso(CursoDTO dto) throws Exception{
        CursoEntity entity = repository.getOne(dto.getNome());
        if (entity.getIdCurso() != entity.getIdCurso())
            repository.save(entity);
    }
}
