package com.rd.treinamentodev.AvaliacaoSpringBoot.repository;

import com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto.CursoDTO;
import com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity.CursoEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.validation.beanvalidation.SpringValidatorAdapter;

import java.util.ArrayList;
import java.util.List;

@Repository

public interface CursoRepository extends JpaRepository<CursoEntity, Long> {

    List<CursoEntity> findByNome(Long nome);

    CursoEntity getOne(String nome);
}

//    Implementar na classe de CursoRepository um método de busca por nome do curso que retorne uma lista de cursos.
//        Não é necessário implementar as camadas de Service e Controller.
