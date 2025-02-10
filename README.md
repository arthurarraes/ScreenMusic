# ScreenMusic

## Descrição
ScreenMusic é um projeto desenvolvido durante um desafio proposto no curso da Alura. O objetivo é criar uma aplicação para gerenciar artistas e músicas, permitindo cadastro, listagem e busca por artistas.

## Funcionalidades
- **Cadastrar artistas**: Permite registrar novos artistas com nome e tipo (solo, banda ou dupla).
- **Cadastrar músicas**: Permite adicionar novas músicas associadas a um artista já cadastrado.
- **Listar músicas**: Exibe todas as músicas registradas no banco de dados.
- **Buscar músicas por artista**: Permite buscar músicas com base no nome do artista.

## Estrutura do Menu
```
1- Cadastrar artistas
2- Cadastrar músicas
3- Listar músicas
4- Buscar músicas por artistas
0- Sair
```

## Tecnologias Utilizadas
- **Java**
- **Spring Boot** (para criação da API REST)
- **JPA/Hibernate** (para persistência de dados)
- **Banco de Dados PostgreSQL** (para armazenar os dados durante o desenvolvimento)

## Como Executar o Projeto
1. Clone este repositório:
   ```sh
   git clone https://github.com/arthurarraes/ScreenMusic.git
   ```
2. Navegue até o diretório do projeto:
   ```sh
   cd ScreenMusic
   ```
3. Execute a aplicação usando Maven:
   ```sh
   ./mvnw spring-boot:run
   ```
4. A aplicação estará disponível em `http://localhost:8080`.

Cada artista pode estar associado a múltiplas músicas (relação de um-para-muitos).

## Contribuição
Fique à vontade para contribuir com melhorias! Basta abrir um pull request ou relatar problemas na seção de issues.

## Licença
Este projeto está sob a licença MIT.

