package com.devsuperior.desafio_two.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_bloco_atividade")
public class BlocoAtividade {

    @EmbeddedId
    private BlocoAtividadePK id =  new BlocoAtividadePK();

    public BlocoAtividade(){
    }

    public BlocoAtividade(Bloco bloco, Atividade atividade) {
        id.setBloco(bloco);
        id.setAtividade(atividade);
    }

    public BlocoAtividadePK getId() {
        return id;
    }

    public void setId(BlocoAtividadePK id) {
        this.id = id;
    }
}
