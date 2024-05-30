package com.devsuperior.desafio_two.entities;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "tb_atividade_participante")
public class AtividadeParticipante {

    @EmbeddedId
    private AtividadeParticipantePK id =  new AtividadeParticipantePK();

    public AtividadeParticipante(){
    }


    public Atividade getAtividade(){
        return id.getAtividade();
    }

    public void setAtividade(Atividade atividade){
        id.setAtividade(atividade);
    }

    public Participante getParticipante(){
        return id.getParticipante();
    }

    public void setParticipante(Participante participante){
        id.setParticipante(participante);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AtividadeParticipante that = (AtividadeParticipante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
