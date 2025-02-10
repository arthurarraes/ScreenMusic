package com.alura.screenMusic.repository;

import com.alura.screenMusic.model.Artista;
import com.alura.screenMusic.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MusicRepository extends JpaRepository<Artista,Long> {
    Optional<Artista> findByNomeContainingIgnoreCase(String nome);
}
