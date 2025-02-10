package com.alura.screenMusic.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "musica")
public class Musica {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String nome;
    @ManyToOne
    private Artista artista;


    public Musica() {
    }

    public Musica(String nome,  Artista artista) {
        this.nome = nome;
        this.artista = artista;
    }

    public Musica(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public Musica setId(Long id) {
        this.id = id;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public Musica setNome(String nome) {
        this.nome = nome;
        return this;
    }


    public Artista getArtista() {
        return artista;
    }

    public Musica setArtista(Artista artista) {
        this.artista = artista;
        return this;
    }

    @Override
    public String toString() {
        return "Musica{" +
                "nome='" + nome + '\'' +
                ", artista=" + artista.getNome() +
                '}';
    }
}
