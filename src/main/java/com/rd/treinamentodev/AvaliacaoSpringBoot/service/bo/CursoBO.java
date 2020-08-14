package com.rd.treinamentodev.AvaliacaoSpringBoot.service.bo;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import org.springframework.stereotype.Component;

@Component
public class CursoBO {

    public CursoDTO parseToDTO(CursoEntity entity) {
        CursoDTO dto = new CursoDTO();

        if (entity == null) {
            return dto;

            dto.setNome(entity.getNomeCurso());
            dto.setNome(entity.getNomeCurso());
            dto.setCargaHoraria(entity.getNrCargaHoraria());
        }
        return dto;
    }
}

//Implementar no projeto uma nova api para cadastro de um novo curso (TB_CURSO) *criar uma service e uma controller*

