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
    private Set<AtividadeParticipante> items = new HashSet<>();
}
