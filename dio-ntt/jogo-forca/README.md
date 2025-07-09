# Documentação do Jogo Hangman (Forca)

## 📌 Visão Geral

O jogo Hangman (Forca) é uma aplicação de terminal em Java onde o jogador deve adivinhar uma palavra secreta, letra por letra. A cada erro, uma parte do desenho do enforcado é exibida. O jogo termina quando o jogador acerta todas as letras (vitória) ou erra 6 vezes (derrota).

---
- **Funções:**
  - Recebe a palavra secreta.
  - Inicia o jogo.
  - Lê tentativas do jogador.
  - Exibe o progresso.
  - Permite reinício ou finalização do jogo.

---

## 🎮 Funcionamento do Jogo

1. **Palavra secreta**
   - O adversário digita a palavra a ser adivinhada.
   - O terminal é limpo para esconder a palavra do jogador.

2. **Inicialização**
   - O jogo monta o desenho com espaços e traços.

3. **Laço de tentativa**
   - O jogador digita uma letra por vez.
   - Se a letra existir na palavra, todas as ocorrências são reveladas.
   - Se a letra não existir, uma parte do boneco é desenhada.
   - Letras repetidas são ignoradas com aviso.

4. **Finalização**
   - Vitória: quando todas as letras são reveladas.
   - Derrota: após 6 erros.
   - O jogo exibe uma mensagem final e pergunta se deseja jogar novamente.

---

## 📋 Exemplo de Execução

```bash
Digite a palavra a ser adivinhada: dinossauro
Jogo iniciado! Tente adivinhar a palavra.
  -----            
 |     |           
 |     |           
 |                 
 |                 
 |                 
=========----------

Digite uma letra: d
  -----            
 |     |           
 |     |           
 |                 
 |                 
 |                 
=========d---------

Digite uma letra: e
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========d---------
Tentativas[e]
Digite uma letra: i
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========di--------
Tentativas[e]
Digite uma letra: o
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========di-o-----o
Tentativas[e]
Digite uma letra: o
Letra 'o' já foi tentada.
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========di-o-----o
Tentativas[e]
Digite uma letra: n
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========dino-----o
Tentativas[e]
Digite uma letra: a
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========dino--a--o
Tentativas[e]
Digite uma letra: s
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========dinossa--o
Tentativas[e]
Digite uma letra: u
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========dinossau-o
Tentativas[e]
Digite uma letra: r
  -----            
 |     |           
 |     |           
 |    O            
 |                 
 |                 
=========dinossauro
Tentativas[e]
Parabéns! Você ganhou!
Deseja jogar novamente? (s/n): n
Obrigado por jogar!
```
