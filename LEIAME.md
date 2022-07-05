# IMDB Top Movies

Mudar idioma para: [English](./README.md)

## Índice

* [Descrição](#descrição)
* [Tecnologias](#tecnologias)
* [Rodando](#rodando)

<br>

## Descrição

Esse projeto faz parte do desafio [7 days of code de Java](https://7daysofcode.io/matricula/java)

O desafio iniciou como um consumidor da API dos 250 melhores filmes do IMDB. Porém, utilizando polimorfismo, o projeto cresceu para um consumidor generico de API's de conteúdo.

- [x] Dia 1: Consumir a API do IMDB, buscar os top 250 filmes da lista deles e imprimir o JSON correspondente no console.
- [x] Dia 2: Parsear a resposta JSON obtida a partir do IMDB para extrair as suas informações e atributos
- [x] Dia 3: Modelar o código para encapsular os atributos dos filmes
- [x] Dia 4: Criar uma página HTML onde você possa ver as informações sobre o filme, incluindo o pôster e a nota.
- [x] Dia 5: Encapsular a chamada à API e o parseamento do JSON em classes.
- [x] Dia 6: Deixar o código mais genérico, preparado para receber dados de outras APIs, usando o polimorfismo.
- [ ] Dia 7: Ordenar as listas com diferentes atributos

Additional implementations: 

- [x] Criar testes unitários usando JUnit e Mockito
- [x] Consumir outra API (Kitsu Anime Database)


<br/>
<img src="./readme-assets/demo.png" alt="">
<br/>

## Tecnologias

            
<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width=30px/>
  Java
</div>

<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width=30px/>
  Spring
</div>

<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/html5/html5-original.svg" width=30px/>    
  HTML
</div>

<div>
  <img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/bootstrap/bootstrap-original.svg" width=30px/>
  Bootstrap
</div>

<br/>

## Rodando

Antes de rodar você precisa obter uma chave da API do IMDB em [https://imdb-api.com/api](https://imdb-api.com/api) e uma chave da API da Marvel em [https://developer.marvel.com/] (https://developer.marvel.com/) e criar as variáveis de ambiente com estes nomes:

> IMDB_KEY
> MARVEL_KEY