package com.alura.screenMusic.principal;

import com.alura.screenMusic.model.Artista;
import com.alura.screenMusic.model.Musica;
import com.alura.screenMusic.repository.MusicRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private MusicRepository repositorio;

    public Principal(MusicRepository repositorio) {
        this.repositorio = repositorio;
    }

    public void exibeMenu(){
        var escolha = -1;
        while(escolha != 0){
            System.out.println("""
                    1- Cadastrar artistas
                                        
                    2- Cadastrar músicas
                                        
                    3- Listar músicas
                                        
                    4- Buscar músicas por artistas
                                        
                    5- Pesquisar dados sobre um artista
                                        
                    9- Sair
                    """);
            escolha = leitura.nextInt();
            leitura.nextLine();
            switch (escolha) {
                case 1:
                    cadastrarArtistas();
                    break;
                case 2:
                    cadastrarMusicas();
                    break;
                case 3:
                    listarMusicas();
                    break;
                case 4:
                    buscarMusicaPorArtista();
                    break;
                case 5:
                    buscarDadosArtista();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }

    private void cadastrarArtistas() {
        var cadastro = "S";
        while (cadastro.equalsIgnoreCase("s")) {
            System.out.println("Informe o nome do artista: ");
            var nome = leitura.nextLine();
            System.out.println("Informe o tipo desse artista (solo, dupla, banda): ");
            var tipo = leitura.nextLine();
            Artista artista = new Artista(nome, tipo);
            repositorio.save(artista);
            System.out.println("Cadastrar outro artista? (S/N)");
            cadastro = leitura.nextLine();
        }
    }

    private void cadastrarMusicas() {
        var cadastro = "S";
        while (cadastro.equalsIgnoreCase("s")) {
            System.out.println("Cadastrar nome de qual artista? ");
            var nome = leitura.nextLine();
            Optional<Artista> artista = repositorio.findByNomeContainingIgnoreCase(nome);
            if (artista.isPresent()){
                System.out.println("Informe o título da música");
                var nomeMusica = leitura.nextLine();
                Musica musica = new Musica(nomeMusica);
                musica.setArtista(artista.get());
                artista.get().getMusicas().add(musica);
                repositorio.save(artista.get());
            } else{
                System.out.println("Artista não encontrado.");
            }
        }
    }

    private void listarMusicas() {
        List<Artista> artistas = repositorio.findAll();
        artistas.forEach(System.out::println);
    }

    private void buscarMusicaPorArtista() {
    }

    private void buscarDadosArtista() {
    }
}
