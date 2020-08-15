package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "TB_CURSO")
@Data
public class CursoEntity<O> extends CursoDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CURSO")
    private Long idCurso;

    @Column(name = "DS_CURSO")
    private String nomeCurso;

    @Column(name = "NR_CARGA_HORARIA")
    private Integer nrCargaHoraria;
}
