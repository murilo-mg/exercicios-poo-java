# Exercícios de Programação Orientada a Objetos em Java

Repositório com exercícios e laboratórios desenvolvidos durante a disciplina de **Programação Orientada a Objetos**, organizados conforme o avanço dos conteúdos estudados em Java.

## Estrutura do repositório

### Primeira_lista — Fundamentos de Java

Exercícios introdutórios envolvendo:

- entrada e saída de dados;
- `Scanner`;
- operações aritméticas;
- estruturas condicionais;
- estruturas de repetição.

Principais arquivos:

- `HelloUfam.java`
- `FolhaPagamento.java`
- `PinturaMuro.java`
- `TipoTriangulo.java`
- `SomaColecoes.java`
- `AsciiArt.java`

---

### Segunda_lista — Lógica de programação

Lista composta por diversos exercícios independentes para praticar a linguagem Java.

Entre os conteúdos trabalhados estão:

- estruturas de controle;
- estruturas de repetição;
- vetores e coleções;
- `ArrayList`;
- manipulação de `String`;
- cálculos matemáticos;
- geometria;
- aproximações numéricas;
- algoritmos.

---

### Terceira_lista — Classes e composição

Arquivos:

- `Processador.java`
- `Memoria.java`
- `Disco.java`
- `Computador.java`
- `ComputadorMain.java`

Conteúdos trabalhados:

- classes e objetos;
- atributos e métodos;
- construtores;
- encadeamento de construtores;
- associação e composição entre objetos.

---

### Quarta_lista — Objetos e coleções

Sistema de treinamento Jedi composto por:

- `IniciadoJedi.java`
- `TreinadorJedi.java`
- `SessaoJedi.java`
- `SessaoJediMain.java`

Conteúdos trabalhados:

- relacionamento entre objetos;
- construtores;
- `ArrayList`;
- busca em coleções;
- agregação de objetos.

---

### Quinta_lista — Sistema de ensalamento

Sistema para alocação de turmas em salas.

Arquivos:

- `Sala.java`
- `Turma.java`
- `TurmaEmSala.java`
- `Ensalamento.java`
- `EnsalamentoMain.java`

A alocação considera capacidade das salas, acessibilidade e conflitos de horário.

Conteúdos trabalhados:

- Java Collections Framework;
- `ArrayList`;
- associação entre classes;
- sobrecarga de métodos;
- regras de negócio;
- geração de relatórios.

---

### Sexta_lista — Herança e polimorfismo

Laboratório baseado em formas geométricas.

Arquivos:

- `FormaGeometrica.java`
- `Circulo.java`
- `Retangulo.java`
- `Quadrado.java`
- `FormasMain.java`

Conteúdos trabalhados:

- herança;
- classes abstratas;
- sobrescrita de métodos;
- polimorfismo.

---

### Setima_lista — Encapsulamento e interfaces

Laboratório baseado em objetos capazes de fornecer uma localização geográfica.

Arquivos:

- `Posicao.java`
- `Localizavel.java`
- `Celular.java`
- `Carro.java`
- `CarroLuxuoso.java`
- `GISMain.java`

Conteúdos trabalhados:

- encapsulamento;
- atributos `private` e `protected`;
- getters e setters;
- interfaces;
- `implements`;
- herança;
- polimorfismo.

---

## Como executar

É necessário possuir o **JDK** instalado.

Para verificar:

```bash
java -version
javac -version

```

Nas listas sem declaração de `package`, entre na pasta desejada e compile normalmente.

Exemplo:

```bash
cd Primeira_lista
javac HelloUfam.java
java HelloUfam
```

Para listas com várias classes:

```bash
cd Terceira_lista
javac *.java
java ComputadorMain
```

## Observação sobre as listas 6 e 7

As listas 6 e 7 preservam os `package` utilizados nos laboratórios da disciplina.

Neste repositório, os arquivos estão agrupados diretamente por lista para facilitar a organização e a consulta, em vez de seguirem toda a estrutura de diretórios correspondente aos packages.

Por esse motivo, algumas IDEs ou extensões Java, como a extensão Java do VS Code, podem apresentar avisos de estrutura de pacote ao abrir diretamente esses arquivos.

Os códigos podem ser compilados normalmente pelo terminal utilizando um diretório de saída.

### Sexta lista

```bash
rm -rf /tmp/sexta_lista_build
mkdir -p /tmp/sexta_lista_build

javac -encoding UTF-8 -d /tmp/sexta_lista_build Sexta_lista/*.java

java -cp /tmp/sexta_lista_build br.edu.icomp.ufam.lab_heranca.FormasMain
```

### Sétima lista

```bash
rm -rf /tmp/setima_lista_build
mkdir -p /tmp/setima_lista_build

javac -encoding UTF-8 -d /tmp/setima_lista_build Setima_lista/*.java

java -cp /tmp/setima_lista_build br.edu.ufam.icomp.lab_encapsulamento.GISMain
```

## Conteúdos estudados

Ao longo das listas foram praticados:

- fundamentos da linguagem Java;
- entrada e saída de dados;
- condicionais e estruturas de repetição;
- vetores e coleções;
- classes e objetos;
- atributos e métodos;
- construtores;
- associação, agregação e composição;
- Java Collections Framework;
- herança;
- classes abstratas;
- sobrescrita;
- polimorfismo;
- encapsulamento;
- modificadores de acesso;
- interfaces.