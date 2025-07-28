# 🚀 Desafio de Bootcamp em Java - DIO

Este projeto é uma simulação de um sistema de gerenciamento de bootcamps, cursos e mentorias, desenvolvido como parte de um desafio de programação em Java pela Digital Innovation One (DIO). Ele demonstra conceitos de Programação Orientada a Objetos (POO) aplicados a um cenário de educação e desenvolvimento.

## ✨ Funcionalidades

  * **Gestão de Bootcamps:** 📚 Criação e administração de bootcamps, que são coleções de cursos e mentorias.
  * **Inscrição de Desenvolvedores:** 🧑‍💻 Desenvolvedores podem se inscrever em um bootcamp, adicionando conteúdos à sua jornada.
  * **Registro de Conteúdos:** 📖 Suporte para dois tipos de conteúdo:
      * **Cursos:** Com carga horária definida.
      * **Mentorias:** Com uma data específica.
  * **Cálculo de XP (Experiência):** 🌟 O sistema calcula a experiência (XP) acumulada por cada desenvolvedor com base nos conteúdos que ele conclui.
  * **Progressão do Desenvolvedor:** ✅ Acompanhamento dos conteúdos inscritos e concluídos por cada desenvolvedor, permitindo visualizar seu progresso.

## 🛠️ Tecnologias Utilizadas

Este projeto foi desenvolvido utilizando os seguintes recursos:

  * **Java:** Linguagem de programação principal, com foco em:
      * **Programação Orientada a Objetos (POO):** Classes, objetos, herança, polimorfismo, encapsulamento e abstração.
      * **Coleções Java (Set, LinkedHashSet):** Para gerenciar os conteúdos inscritos e concluídos de forma eficiente.
      * **API de Data e Hora (java.time.LocalDate):** Para manipulação de datas nas mentorias.

## 📂 Estrutura do Projeto

A estrutura de diretórios do projeto é a seguinte:

```
├── .idea/                      # Arquivos de configuração do IntelliJ IDEA (IDE) ⚙️
├── src/                        # Código-fonte da aplicação 💻
│   ├── Main.java               # Ponto de entrada principal da aplicação para demonstração ▶️
│   └── br/                     # Pacote raiz da aplicação
│       └── com/
│           └── dio/
│               └── desafio/
│                   └── dominio/  # Classes de domínio da aplicação (POO) 🏛️
│                       ├── Bootcamp.java   # Gerencia bootcamps e devs inscritos
│                       ├── Conteudo.java   # Classe abstrata para cursos e mentorias
│                       ├── Curso.java      # Representa um curso com carga horária
│                       ├── Dev.java        # Representa um desenvolvedor e seu progresso
│                       └── Mentoria.java   # Representa uma mentoria com data
└── bootcamp-Dio-JAVA.iml       # Arquivo de módulo do IntelliJ IDEA
```

## 🚀 Como Começar

Para executar este projeto em sua máquina local, siga as instruções abaixo:

### 📋 Pré-requisitos

  * **Java Development Kit (JDK):** Versão 11 ou superior.
  * **IDE Java:** Uma IDE como IntelliJ IDEA, Eclipse ou VS Code com extensões Java.

### ⬇️ Instalação e Execução

1.  **Clone o repositório:**

    ```bash
    git clone <URL_DO_SEU_REPOSITORIO>
    cd java-bootcamp-dio
    ```

2.  **Abra o Projeto na IDE:**
    Importe o projeto para sua IDE Java preferida (ex: "Open" no IntelliJ IDEA e selecione a pasta `java-bootcamp-dio`).

3.  **Compile e Execute:**
    Localize a classe `Main.java` dentro do diretório `src`. Clique com o botão direito na classe `Main` e selecione "Run 'Main.main()'" ou use a opção de execução da sua IDE.

    O console exibirá a simulação da inscrição de desenvolvedores e o cálculo de suas XPs.

## 🤝 Contribuição

Contribuições são bem-vindas\! Sinta-se à vontade para abrir issues ou pull requests para melhorias.

## ⚖️ Licença

Este projeto é de código aberto.
