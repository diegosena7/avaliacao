package com.rd.treinamentodev.AvaliacaoSpringBoot.service;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.AlunoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.InstrutorDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.TurmaDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.AlunoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.InstrutorEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.TurmaEntity;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.CursoRepository;
import com.rd.treinamentodev.AvaliacaoSpringBoot.repository.TurmaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

@Service
public class TurmaService {

    @Autowired
    private TurmaRepository turmaRepository;

    @Autowired
    private CursoRepository cursoRepository;



    SimpleDateFormat SDF = new SimpleDateFormat("dd/MM/yyyy");
//Converter Entity para DTO
    public List<TurmaDTO> listar(){
        List<TurmaEntity> listEntity = turmaRepository.findAll();
        List<TurmaDTO> listDTO = new ArrayList<>();

        for (TurmaEntity entity : listEntity){
            TurmaDTO turmaDTO = new TurmaDTO();
           turmaDTO.setAlunos(entity.getAlunos());
           turmaDTO.setCurso(entity.getCurso());
           turmaDTO.setDtInicio(entity.getDtInicio());
           turmaDTO.setDtFim(entity.getDtFinal());
           turmaDTO.setInstrutores(entity.getInstrutores());
           List<>

            CursoEntity cursoEntity = new CursoEntity();
            cursoEntity.setIdCurso(entity.setIdTurma());

        }


        return listDTO;
    }
}
