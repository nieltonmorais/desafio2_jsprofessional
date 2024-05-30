package com.devsuperior.desafio_two.entities;


import jakarta.persistence.*;

@Entity
@Table(name = "tb_atividade_participante")
public class AtividadeParticipante {

    @EmbeddedId
    private AtivPartPK id =  new AtivPartPK();

}
