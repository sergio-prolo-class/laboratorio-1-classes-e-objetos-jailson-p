[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/L04k_9nU)
# Jailson Pedro 
# Dúvidas:
-[x] diretório .github, pra que serve e se é estritamente necessário
- Resposta do Prof. Sergio: Sim, é pertinenten à estatística e dados educacionais do Github

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
### 1.4 Tasks Update 
- Altere a classe de forma tal que:  
  -[x] Lâmpadas possam ser criadas com seu estado definido ou com um estado padrão desligado  
  -[x] Conte o número total de lâmpadas criadas
  
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
  -[x] regra para nome vazio na geração da instância, uma solução para isto
    -seria try-cath para intervir na tentativa de gerar esse erro, isso serve também para a idade no momento de gerar a instância.
    -Iniciei a String nome com "____" 
### 2.4 Task Update
  - Altere a classe de forma tal que:  
  -[x] Pessoas tenham um CPF no formato “xxx.xxx.xxx-xx” constante a ser informado na criação.  
    #### Importante:  
    -[x] Se o CPF informado for vazio, atribua um valor padrão (“123.456.789-00”).  
    -[x] Se o informado não for vazio, assuma que ele está certo (não implemente uma validação de CPF na classe Pessoa, pessoas não validam CPFs)  
    -[x] Pessoas possam ser criadas de três maneiras diferentes: apenas CPF, CPF e nome, ou com os três argumentos

## 3. Retângulo   
- Modele um retângulo em plano cartesiano bidimensional, que possua formas de calcular sua
área e perímetro. Inclua:  
### 3.1 Atributos:
- [x] (float) largura  
- [x] (float) altura  
### 3.2 Métodos:  
- [x] (void) setLargura(float largura)  
- [x] (void) setAltura(float altura)  
- [x] (float) getArea()   
- [x] (float) getPerimetro()  

### 3.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
- [x] (a) Crie um retângulo com 5 de largura e 4 de altura  
- [x] (b) Sua área é 20? Seu perímetro é 18?  
- [x] (c) Crie um vetor de 10 retângulos gerados aleatoriamente  
- [x] (d) Imprima a maior razão área sobre perímetro da lista
### 3.3 Tasks Update
- Altere a classe de forma tal que:  
  -[x] Nenhum retângulo possa ser criado sem largura e altura definida. Se valores não positivos forem informados, devem ser iniciados com 1  
  -[x] Exista um registro do retângulo de maior área já criado  
  -[x] Exista um registro do retângulo de menor perímetro já criado

## 4. Relógio  
- Modele um relógio que apresenta os valores de hora, minuto e segundo (formato HH:MM:SS). Inclua:  
### 4.1 Atributos:  
- [x] (byte) hora  
- [x] (byte) minuto
- [x] (byte) segundo  

### 4.2 Métodos:
- [x] (void) ajustaHora(byte hora, byte minuto, byte segundo)  
- [x] (String) getHora()  
- [x] (void) avancaHora()  
- [x] (void) avancaMinuto()  
- [x] (void) avancaSegundo()  

### 4.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:
- [x] (a) Crie um relógio que marca 14:58:32  
- [x] (b) Avance dois minutos. Qual valor ele marca agora? --> 15:0:32   
- [x] (c) Altere o relógio para marcar 23:59:59  
- [x] (d) Avance um segundo. Qual valor ele marca agora? --> 00:00:00  
- [x] (e) Como eu poderia mudar o formato da marcação de horas? Por exemplo, se eu quiser que o relógio mostre ‘11pm 30m 45s’ ao invés de ‘23:30:45’. Qual(ais) mudança(s) deveria(m) ser feita(s) na classe Relogio?   
   * criei um método para resolver esse impasse com recursão do getHora() para getHora12(bolean h12)  
  ### Tasks Updates
- Altere a classe de forma tal que:
     -[x] Relógios possam ser criados com valores de hora, hora e minuto, ou hora minuto e segundo. Caso qualquer valor seja inválido, o objeto deve ser inicializado com valores zerados
     -[x] Exista um método que sincronize um relógio com outro  
     -[x] Exista um método que retorne a diferença, em segundos, das horas de um relógio para outro  
## 5. Produto  
   Modele um produto que possui nome, preço e uma taxa de desconto. Inclua:
### 5.1 Atributos:  
- [x]   (String) nome  
- [x]   (int) preco  
- [x]   (int) desconto  
### 5.2 Métodos:  
- [x]   (void) setNome(String nome)  
- [x]   (String) getNome()  
- [x]   (void) setPreco(int preco)  
- [x]   (float) getPreco()  
- [x]   (void) setDesconto(int desconto)  
- [x]   (int) getDesconto()  
### 5.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
- [x] (a) Crie dois produtos sem descontos: uma geladeira de 832 reais e um micro-ondas de 499
reais.  
- [x] (b) Deu a louca no gerente! Ajuste a geladeira para ter 6% de desconto, e o micro-ondas para
   ter 12%.  
- [x] (c) Imprima na tela o novo preço de cada produto. A geladeira custa 782,08 reais? O
   micro-ondas custa 439,12 reais? ---> os dois preços corretos  
- [x] (d) Altere a classe Produto para incluir um novo método (String) anuncio(). Ele deve
   retornar um texto no estilo “Geladeira: de R$ 832,00 por APENAS R$ 782,08!"  
- [x] (e) Você acha que a modelagem desse produto é boa? Se não, onde você mudaria algo, e por
   que? Faça um comentário no seu código fonte incluindo essa resposta.  
### 5.4 Task Update  
- Altere a classe de forma tal que:
-[ ] Produtos só possam ser criados com nome e preço válidos e sempre tenham desconto inicial de 0%  
-[x] Tenha um registro do número total de produtos criados  
-[x] Produtos tenham um código identificador do tipo String no formato “CD:xxx-xxx”  
  -[x] Após definido, o código de um produto não deve ser alterado  
  -[x] O código é gerado automaticamente a partir do registro de total  
  -[x] Exemplos: o terceiro produto tem código “CD:000-003”; o milésimo produto tem código  
  “CD:001-000”.  
  -[x] É necessário um método para descobrir o código de qualquer produto (getCodigo)  
-[x] Tenha um registro dos últimos produtos criados.  
  -[x] Assuma que o sistema pode ter, no máximo, 50 registros.  
  -[x] Quando novos produtos são criados, o produto mais antigo é esquecido para dar espaço ao mais novo.  
-[ ] Tenha um método estático para expor o registro de produtos em formato .csv  
    -[ ] Esse método não deve utilizar System.out ou acesso à arquivos  
    -[x] Ele deve retornar um vetor de Strings para a aplicação principal imprimir  
    -[x] A primeira linha deve ser um cabeçalho com os nomes das colunas do .csv  
    -[x] As próximas linhas devem conter os atributos dos produtos registrados    
    -[x] Assuma que o .csv é separado por ‘ ; ’ (para não confundir com o decimal dos números)  
    -[x] Abaixo está um exemplo do conjunto de Strings gerada por esse método  
```     
        1 Código;Nome;Preço;Desconto
        2 CD:000-001;Geladeira;782,08;6
        3 CD:000-002;Micro-ondas;439,12;12
        4 CD:000-003;Fogão 4 bocas Eletrolux KL4003;677,00;0
```

## 6. Livro  
###   6.1 Modele um livro que possui:
   -[x] título,  
   -[x] autor,  
   -[x] até dois gêneros literários,  
   -[x] número total de páginas,  
   -[ ] títulos de cada capítulo e as páginas onde cada capítulo começa. 
### 6.2 Regras
   -[ ] Assuma que o livro pode ter, no máximo, 30 capítulos.
   -[ ] A lista de possíveis gêneros literários é: Fantasia, Aventura, Romance, Mistério, Terror, Auto-ajuda e Pedagógico.  
   -[ ] Inclua todos os atributos e métodos necessários para representar o livro (getter e setter). 
   -[ ] O livro também deve ter métodos para o usuário ler páginas do livro, bem como descobrir quantas
   páginas do livro já foram lidas e qual é o capítulo atual de leitura.

  ### 6.3 Na aplicação principal (App.java), teste sua classe da seguinte forma:  
   -[x] (a) Crie um livro com as seguintes características:  
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
   -[x] (b) Leia 90 páginas do livro  
   -[x] (c) Imprima na tela o capítulo que está lendo. É ‘Uma Conspiração Desmascarada’?  
   -[x] (d) Leia mais 300 páginas do livro  
   -[x] (e) Imprima na tela o capítulo que está lendo. É ‘O Espelho de Galadriel’?  ---->vide em Produto.java linha 42
   -[x] (f) Leia mais 100 páginas do livro. Isso é possível? ---> regra limite executada, não é possível  

## 8. Navio
   Modele uma classe para representar um navio do jogo batalha naval.
   Para cada navio é importante saber o seu tamanho, a sua posição (linha e coluna) no tabuleiro,
   a sua orientação (vertical ou horizontal), a letra que o representa no tabuleiro (e.g. P para
   porta-aviões), quais posições ele já foi atingido e se ele foi afundado ou não.
   Pense em quais atributos e métodos podem ser úteis para a classe e implemente-os. Considere
   que os métodos dessa classe serão invocados por um programa principal que representa o jogo
   batalha naval. Assim, os métodos devem ser úteis para o jogo, como por exemplo, verificar se o
   navio foi atingido, se ele foi afundado, etc.
