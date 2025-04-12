[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/L04k_9nU)
# Jailson Pedro 
# Dúvidas:
-[ ] diretório .github, pra que serve e se é estritamente necessário  

# Exercícios de Laboratório  
## 1. Lâmpada  
- Modele uma lâmpada que pode ser ligada ou desligada  
### 1.1 Atributos:  
-[x] (boolean) ligada  
### 1.2 Métodos:  
-[x] (void) ligar()  
-[x] (void) desligar()  
-[x] (boolean) verEstado()  
### 1.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
-[x] (a) Crie dois objetos do tipo Lampada  
-[x] (b) Ligue um e desligue o outro  
-[x] (c) Imprima na tela o estado de cada uma  
  
## 2. Pessoa  
- Modele uma pessoa que possui nome. idade. e pode fazer aniversário . Inclua:  
### 2.1 Atributos:  
-[x] (String) nome  
-[x] (int) idade  
### 2.2 Métodos:  
-[x] (void) setNome(String nome)  
-[x] (String) getNome()  
-[x] (void) setIdade(int idade)  
-[x] (int) getIdade()  
-[x] (void) felizAniversario()  
### 2.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
-[x] (a) Crie duas pessoas: Alice de 22 anos, e Bruno de 25 anos  
-[x] (b) Comemore o aniversário do Bruno três vezes  
-[x] (c) Imprima na tela a idade das duas pessoas  
-[x] (d) Você consegue ajustar a idade da Alice para -44? Isso é desejado? 
  -[x] regra adicionada 'idade < 0' deve ser recusada
-[x] (e) Você consegue ajustar o nome do Bruno para uma String vazia? Isso faz sentido?  
  -[x] regra para nome setNome com string vazia quando já existe um nome preenchido
  -[ ] regra para nome vazio na geração da instância, uma solução para isto
    -seria try-cath para intervir na tentativa de gerar esse erro, isso serve também para a idade no momento de gerar a instância.  
## 3. Retângulo   
- Modele um retângulo em plano cartesiano bidimensional, que possua formas de calcular sua
área e perímetro. Inclua:  
### 3.1 Atributos:
- [ ] (float) largura  
- [ ] (float) altura  
### 3.2 Métodos:  
- [ ] (void) setLargura(float largura)  
- [ ] (void) setAltura(float altura)  
- [ ] (float) getArea()   
- [ ] (float) getPerimetro()  

### 3.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
- [ ] (a) Crie um retângulo com 5 de largura e 4 de altura  
- [ ] (b) Sua área é 20? Seu perímetro é 18?  
- [ ] (c) Crie um vetor de 10 retângulos gerados aleatoriamente  
- [ ] (d) Imprima a maior razão área sobre perímetro da lista  

## 4. Relógio  
- Modele um relógio que apresenta os valores de hora, minuto e segundo (formato HH:MM:SS). Inclua:  
### 4.1 Atributos:  
- [ ] (byte) hora  
- [ ] (byte) minuto
- [ ] (byte) segundo  

### 4.2 Métodos:
- [ ] (void) ajustaHora(byte hora, byte minuto, byte segundo)  
- [ ] (String) getHora()  
- [ ] (void) avancaHora()  
- [ ] (void) avancaMinuto()  
- [ ] (void) avancaSegundo()  
### 4.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:
- [ ] (a) Crie um relógio que marca 14:58:32  
- [ ] (b) Avance dois minutos. Qual valor ele marca agora?  
- [ ] (c) Altere o relógio para marcar 23:59:59  
- [ ] (d) Avance um segundo. Qual valor ele marca agora?  
- [ ] (e) Como eu poderia mudar o formato da marcação de horas? Por exemplo, se eu quiser que    o relógio mostre ‘11pm 30m 45s’ ao invés de ‘23:30:45’. Qual(ais) mudança(s) deveria(m) ser feita(s) na classe Relogio?  
## 5. Produto  
   Modele um produto que possui nome, preço e uma taxa de desconto. Inclua:
### 5.1 Atributos:  
- [ ]   (String) nome  
- [ ]   (int) preco  
- [ ]   (int) desconto  
### 5.2 Métodos:  
- [ ]   (void) setNome(String nome)  
- [ ]   (String) getNome()  
- [ ]   (void) setPreco(int preco)  
- [ ]   (float) getPreco()  
- [ ]   (void) setDesconto(int desconto)  
- [ ]   (int) getDesconto()  
### 5.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
- [ ] (a) Crie dois produtos sem descontos: uma geladeira de 832 reais e um micro-ondas de 499
reais.  
- [ ] (b) Deu a louca no gerente! Ajuste a geladeira para ter 6% de desconto, e o micro-ondas para
   ter 12%.  
- [ ] (c) Imprima na tela o novo preço de cada produto. A geladeira custa 782,08 reais? O
   micro-ondas custa 439,12 reais?  
- [ ] (d) Altere a classe Produto para incluir um novo método (String) anuncio(). Ele deve
   retornar um texto no estilo “Geladeira: de R$ 832,00 por APENAS R$ 782,08!"  
- [ ] (e) Você acha que a modelagem desse produto é boa? Se não, onde você mudaria algo, e por
   que? Faça um comentário no seu código fonte incluindo essa resposta.  
## 6. Livro  
   Modele um livro que possui título, autor, até dois gêneros literários, o número total de páginas,
   os títulos de cada capítulo e as páginas onde cada capítulo começa. Assuma que o livro pode
   ter, no máximo, 30 capítulos. A lista de possíveis gêneros literários é: Fantasia, Aventura,
   Romance, Mistério, Terror, Auto-ajuda e Pedagógico.  
   Inclua todos os atributos e métodos necessários para representar o livro (getter e setter). O
   livro também deve ter métodos para o usuário ler páginas do livro, bem como descobrir quantas
   páginas do livro já foram lidas e qual é o capítulo atual de leitura.  
   Na aplicação principal (App.java), teste sua classe da seguinte forma:  
   (a) Crie um livro com as seguintes características:  
   • Título: O Senhor dos Anéis - A Sociedade do Anel  
   • Autor: J. R. R. Tolkien  
   • Gêneros: Fantasia, Aventura  
   • Páginas: 464  
   • Capítulos:  
   Capítulo Nome Página  
   1 Uma Festa Muito Esperada 1  
   2 A Sombra do Passado 23  
   3 Três é Demais 44  
   4 Um Atalho para Cogumelos 66  
   5 Uma Conspiração Desmascarada 89  
   6 A Floresta Velha 110  
   7 Em Casa de Tom Bombadil 131  
   8 Névoa nas Colinas dos Túmulos 154  
   9 No Pônei Empinado 176  
   10 Passolargo 197  
   11 Um Faca na Noite 219  
   12 Voo para o Vau 240  
   13 Muitos Encontros 261  
   14 O Conselho de Elrond 282  
   15 O Anel Vai para o Sul 301  
   16 Uma Jornada no Escuro 320  
   17 A Ponte de Khazad-dûm 341  
   18 Lothlórien 361  
   19 O Espelho de Galadriel 383  
   20 Adeus a Lórien 403  
   21 O Grande Rio 423  
   22 A Partida da Sociedade 446  
   (b) Leia 90 páginas do livro  
   (c) Imprima na tela o capítulo que está lendo. É ‘Uma Conspiração Desmascarada’?  
   (d) Leia mais 300 páginas do livro  
   (e) Imprima na tela o capítulo que está lendo. É ‘O Espelho de Galadriel’?  
   (f) Leia mais 100 páginas do livro. Isso é possível?  