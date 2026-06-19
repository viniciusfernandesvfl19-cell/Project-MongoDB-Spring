# Workshop MongoDB Spring Boot

Este repositório contém o projeto desenvolvido como parte dos meus estudos focados em **Spring Boot** e **MongoDB**. O objetivo principal foi compreender a integração entre uma aplicação Java e um banco de dados NoSQL orientado a documentos, aplicando boas práticas de arquitetura REST.

---

## 🚀 Sobre o Projeto
Este é um projeto de estudo que simula um sistema de rede social simples, onde usuários podem criar posts e adicionar comentários. O foco foi explorar as particularidades do MongoDB em relação a bancos relacionais (como o uso de `@DBRef` e denormalização de dados).

## 🛠 Tecnologias e Ferramentas
* **Java 25**
* **Spring Boot 4+**
* **Spring Data MongoDB**
* **MongoDB (Compass como ferramenta de visualização)**
* **Postman** (para testes de API)
* **Maven** (gerenciamento de dependências)

## 💡 O que foi aprendido
Durante o desenvolvimento, solidifiquei conhecimentos essenciais como:

* **Arquitetura em Camadas:** Divisão clara entre `Resource` (Controller), `Service` e `Repository`.
* **MongoDB & Spring Data:**
    * Configuração do banco de dados e inicialização de dados (`CommandLineRunner`).
    * Uso de `@Document`, `@Id` e `@DBRef` para gerenciar relacionamentos.
    * Criação de `Query Methods` para buscas inteligentes (ex: `ContainingIgnoreCase`).
    * Uso da anotação `@Query` para consultas personalizadas complexas (utilizando `$and`, `$or` e `$regex`).
* **Manipulação de Dados:**
    * Padronização de formatos de Data e TimeZone (GMT).
    * Tratamento de parâmetros de URL (`URLDecoder`).
    * Padrão "Busca-Atualiza-Salva" para operações de Update.
* **Boas Práticas:**
    * Uso de **DTOs** (Data Transfer Objects) para proteger a camada de domínio.
    * Tratamento de exceções personalizadas (`ObjectNotFoundException`).
    * Boas práticas de nomenclatura (convenções Java, uso do `this` no construtor).

---

## 🔗 Referências
Projeto desenvolvido com base em práticas de mercado para integração de back-end Java com bancos de dados não relacionais.

* *Este projeto é um repositório de estudo e aprendizado.*
