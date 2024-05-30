package com.devsuperior.desafio_two.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tb_participante")
public class Participante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    @Column(unique = true)
    private String email;

    @OneToMany(mappedBy = "id.participante")
    private Set<AtividadeParticipante> atividadeParticipantes = new HashSet<>();

    public Participante(){
    }

    public Participante(Long id, String nome, String email, Set<AtividadeParticipante> items) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.atividadeParticipantes = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
