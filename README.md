# ✊✋✌️ Jokenpo Java

Um simulador simples e eficiente do clássico jogo **Pedra, Papel e Tesoura**, desenvolvido em **Java**. Este projeto foi criado para exercitar conceitos fundamentais de lógica de programação, manipulação de entradas do usuário e geração de dados aleatórios.

---

## 🚀 Funcionalidades

* **Interação via Terminal:** Escolha sua jogada diretamente no console.
* **Oponente Aleatório:** O computador realiza escolhas aleatórias utilizando a classe `Random`.
* **Validação de Resultado:** O sistema compara as jogadas e determina o vencedor ou empate instantaneamente.
* **Fluxo Contínuo:** Opção para jogar múltiplas rodadas sem a necessidade de reiniciar a aplicação.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (JDK 17+)
* **Entrada de Dados:** `java.util.Scanner`
* **Geração de Números:** `java.util.Random`

## 📖 Como Executar

Certifique-se de ter o Java instalado em sua máquina antes de seguir os passos abaixo:

1.  **Clone o repositório:**
    ```bash
    git clone [https://github.com/Riandedeus/Jokenpo-Java.git](https://github.com/Riandedeus/Jokenpo-Java.git)
    ```

2.  **Acesse o diretório do projeto:**
    ```bash
    cd Jokenpo-Java
    ```

3.  **Compile o código fonte:**
    ```bash
    javac Main.java
    ```

4.  **Inicie o jogo:**
    ```bash
    java Main
    ```

## 🎮 Regras do Sistema

O jogo segue a lógica clássica:
* **Pedra** quebra **Tesoura**.
* **Tesoura** corta **Papel**.
* **Papel** embrulha **Pedra**.

## 📂 Estrutura de Arquivos

* `Main.java`: Contém a classe principal e toda a lógica de execução do jogo.
* `.gitignore`: Arquivo para evitar o versionamento de arquivos binários compilados (`.class`).

---
Desenvolvido por [Rian de Deus](https://github.com/Riandedeus) 🚀
