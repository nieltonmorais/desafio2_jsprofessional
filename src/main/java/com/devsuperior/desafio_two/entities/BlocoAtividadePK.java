package com.devsuperior.desafio_two.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Embeddable
public class BlocoAtividadePK {

    @ManyToOne
    @JoinColumn(name = "bloco_id")
    private Bloco bloco;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;

    public BlocoAtividadePK(){
    }

    public BlocoAtividadePK(Bloco bloco, Atividade atividade) {
        this.bloco = bloco;
        this.atividade = atividade;
    }

    public Bloco getBloco() {
        return bloco;
    }

    public void setBloco(Bloco bloco) {
        this.bloco = bloco;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
}
