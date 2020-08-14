package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;


import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name = "TB_MODULO")
@Data
public class ModuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id_modulo")
    private Integer idModulo;

    @Column(name = "ds_nome")
    private String dsNome;

    @Column(name = "id_instrutor")
    private BigInteger idInstrutor;

    @OneToOne
    @JoinColumn(name = "ID_INSTRUTOR")

    private InstrutorEntity instrutorID;
}


//Criar uma nova entidade com o nome ModuloEntity (referente a tabela TB_MODULO) e seus atributos.
//Relacionar dentro da entidade ModuloEntity a entidade InstrutorEntity onde para cada módulo poderá existir um instrutor.
//Fazer a regra @OneToOne entre ModuloEntity e InstrutorEntity
//id_modulo
//ds_nome
//id_instrutor