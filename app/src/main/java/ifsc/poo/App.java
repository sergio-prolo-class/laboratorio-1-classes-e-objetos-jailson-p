package ifsc.poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Vector;

public class App {

    public static void main(String[] args){
//        //Item 1 Lampada
//        System.out.println();
//        //item 1.3(a) - Readme.md - criar duas instâncias de Lampada
//        Lampada led = new Lampada(false);
//        Lampada alogenica = new Lampada(false);
//        //itens 1.3(b)e(c) - Readme.md - ligar uma instância e desligar a outra e imprimir o estado
//        led.ligar();
//        System.out.println("Lampada de led está : " + ((led.verEstado())? "Ligada":"Desligada"));
//        alogenica.desligar();
//        System.out.println("Lampada Alogênica está: " + ((alogenica.verEstado())? "Ligada":"Desligada"));
//        System.out.println("Foram criada(s) " + Lampada.getQuantidadeLampadas() + " lâmpada(s).");
//        System.out.println("=".repeat(70));
//
//        //Item 2 Pessoa
//        //Item 2.3(a) - Readme.md. Criar duas pessoas, nessas condições
//        Pessoa alice = new Pessoa("", "Alice", 22);
//        Pessoa bruno = new Pessoa("124.897.666-77", "Bruno",25);
//        System.out.println();
//        //Item 2.3(b) - Readme.md. Comemorar 3x felicidades ao Bruno
//        bruno.addIdade();
//        bruno.addIdade();
//        bruno.addIdade();
//        //Item 2.3(c) - Readme.md. Imprimir a idade das duas pessoas
//        System.out.println(alice.getNome() + " tem " + alice.getIdade() + " anos.");
//        System.out.println(bruno.getNome() + " tem " + bruno.getIdade() + " anos.\n");
//        //Item 2.3(d) - Readme.md. Teste de regra para idade < 0
//        alice.setIdade(-44);
//        System.out.println("Após tentar mudar a idade para -44 de Alice\nAlice ainda tem " + alice.getIdade() + " anos");
//        //Item 2.3(e) - Readme.md Teste set de nome vazio
//        bruno.setNome("");
//        System.out.println("Após tentar mudar nome de Bruno para String(\"\")\nBruno ficou com nome: " + bruno.getNome());
//        System.out.println(bruno.toString() + alice +"=".repeat(70));
//
//        //Item 3 Retangulo
//        //Item 3.3(a) - Readme.me - criar um retângulo com 5 largura e 4 altura
//        Retangulo quadrilatero = new Retangulo(5,4);
//        //Item 3.3(b) - Readme.me - comprova que 5x4 tem área 20 e perimetro 18
//        System.out.println(quadrilatero);
//        //Item 3.3(c) - Readme.md - criar um vetor com 10 'Retangulo's aleatórios
//        Vector<Retangulo> vetRet = new Vector<>();
//        for (int i = 0; i < 10; i++) {
//            Random rand = new Random();
//            float largura = rand.nextFloat(-20,20);
//            float altura  = rand.nextFloat(-20,20);
//            vetRet.add(new Retangulo(largura, altura));
//            //System.out.println(vetRet.get(i));
//        }
//        //Item 3.3(d) - Readme.md - Imprimir a maior razão A/P deste vetor,,,, nessa eu me superei
//        System.out.println("Retângulo com maior area:" + Retangulo.getMaiorArea());
//        System.out.println("Retângulo com menor perímetro:" + Retangulo.getMenorPerimetro());
//        System.out.println("Retângulo com maior Razao A/P:" + Retangulo.getMaiorAreaPorPerimetro());
//        System.out.println("=".repeat(70));

        //Item 4 Relogio
        //Item 4.3 - Readme.md
//        Relogio casio = new Relogio((byte) 127);
//        //Item 4.3(a) - Readme.md - ajustar para 14:58:32
//        casio.ajustaHora((byte) 14,(byte) 58,(byte) 32);
//        //Item 4.3(b) - Readme.md - avançar 2 min
//        casio.avancaMinuto();
//        casio.avancaMinuto();
//        System.out.println("Após 2 min adicionados são : " + casio.getHora());
//        //Item 4.3(c) - Readme.me - alterar para 23:59:59
//        casio.ajustaHora((byte) 23,(byte) 59,(byte) 59);
//        //Item 4.3(e) - Readme.me - Demonstração da Resolução para os formatos XXpm XXm XXs
//        System.out.println(casio.getHora12(true));
//        //Item 4.3(d) - Readme.me - avançar um segundo de 23:59:59
//        casio.avancaSegundo();
//        System.out.println("Após 1 seg adicionados são : " + casio.getHora()+ " ou : " + casio.getHora12(true));
//        Relogio gshock = new Relogio((byte) 10,(byte) 10,(byte) 10);
//        Relogio suico = new Relogio((byte) 5 ,(byte)40,(byte)5);
//        System.out.println(gshock.emSegundos() + "s , Gshock");
//        System.out.println(suico.emSegundos() + "s , Suiço");
//        System.out.println(gshock.diferencaSeg(suico) + "s ,Gshock - Suiço");
//        System.out.println("=".repeat(70));

        //Item 5 Produto
        //Item 5.3(a) - Readme.md - Criar 2 produtos
        char char0 = (char) 65;
        char char1 = (char) 65;
        char char2 = (char) 65;
          StringBuffer prd = new StringBuffer();
          prd.append(char2).append(char1).append(char0);
          int val = 00;
          int desc= 0;

          for(int i = 1 ; i <= 300; i++){
            if(char0 == (char) 122){char1++;char0 = (char) 64;}
            if(char1 == (char) 122){char2++;char1 = (char) 64;}
            char0++;
            val++;
            StringBuffer alpha = new StringBuffer();
            alpha.append(char2).append(char1).append(char0);
            Produto produto = new Produto(alpha.toString(),val);
          }
          for(String produto: Produto.listaUltimos50()){
            System.out.println(produto);
          }

//        Produto produto1 = new Produto("geladeira",832);
//        Produto produto2 = new Produto("micro-ondas", 499);
//        //Item 5.3(b) - Readme.md - set desconto 6 e 12 respectivamente
//        System.out.println(produto1.getCodigo());
//        System.out.println(produto2.getCodigo());
//        produto1.setDesconto(6);
//        produto2.setDesconto(12);
//        //Item 5.3(c) - Readme.md - Saída com o valor dos descontos;
//        System.out.println("Desconto produto1 + 6% :"  + (produto1.getPreco()-(produto1.getPreco()*produto1.getDesconto()/100.00f)));
//        System.out.println("Desconto produto2 + 12%:" + (produto2.getPreco()-(produto2.getPreco()*produto2.getDesconto()/100.00f)));
//        //Item 5.3(d) - Readme.md - Saída com o valor dos descontos por um Método anuncio();
//        System.out.println(produto1.anuncio());//tenho dúvidas de boa conduta nesse método, deveria ser feito no App ou no Produto?
        System.out.println("=".repeat(70));

//        //Item 6 Livro
//        //Item 6.3(a) - Readme.md - Instanciar um Livro;
//        String  tituloESubTitulo = "O Senhor dos Anéis - A Sociedade do Anel",
//                autor = "J. R. R. Tolkien";
//        //constroí Livro myPrecious
//        Livro myPrecious = new Livro(tituloESubTitulo,autor, Livro.Generos.Fantasia,Livro.Generos.Aventura, 464);
//
//        //Adiciona os capítulos
//        App.addCapLivro(myPrecious);
//
//        App.lerPaginas(0,myPrecious);
//        //Ler silenciosamente até a pag 90
//        App.lerPaginas(90,myPrecious);
//        //Ler silenciosamente da pag 90 à 390, avançando 300 pags.
//        App.lerPaginas(300,myPrecious);
//        //Testando o limite de leitura
//        App.lerPaginas(100,myPrecious);
//        System.out.println("====================================================================");

    }
    //todo médodos auxiliares como static e de mensagens no App.java
    //Método auxiliares para classe Livro, faz a leitura e localiza em qual capítulo se encontra
    public static  void lerPaginas(int paginas, Livro livro){
        for(int i = 1 ; i <= paginas ; i++){
            if(!livro.avancarPagina()){
                System.out.println("Não é possível avançar.");
                break;
            }
        }
        System.out.println("Pagina atual:" + livro.getPaginaAtual() + "\nCAP:" + livro.getCapAtual());
    }
    //adiciona todos os capítulos
    public static void addCapLivro(Livro livro){
        livro.addCapitulo("1 Uma Festa Muito Esperada",    "1");
        livro.addCapitulo("2 A Sombra do Passado ",        "23");
        livro.addCapitulo("3 Três é Demais",               "44");
        livro.addCapitulo("4 Um Atalho para Cogumelos" ,   "66");
        livro.addCapitulo("5 Uma Conspiração Desmascarada", "89");
        livro.addCapitulo("6 A Floresta Velha",            "  110");
        livro.addCapitulo("7 Em Casa de Tom Bombadil",     "131");
        livro.addCapitulo("8 Névoa nas Colinas dos Túmulos"," 154");
        livro.addCapitulo("9 No Pônei Empinado",           "176");
        livro.addCapitulo("10 Passolargo",                 " 197");
        livro.addCapitulo("11 Um Faca na Noite",           " 219");
        livro.addCapitulo("12 Voo para o Vau",             " 240");
        livro.addCapitulo("13 Muitos Encontros",           "261 ");
        livro.addCapitulo("14 O Conselho de Elrond",       " 282");
        livro.addCapitulo("15 O Anel Vai para o Sul",      " 301");
        livro.addCapitulo("16 Uma Jornada no Escuro",      " 320");
        livro.addCapitulo("17 A Ponte de Khazad-dûm",      " 341");
        livro.addCapitulo("18 Lothlórien",                 " 361");
        livro.addCapitulo("19 O Espelho de Galadriel",     " 383");
        livro.addCapitulo("20 Adeus a Lórien",             " 403");
        livro.addCapitulo("21 O Grande Rio",               " 423");
        livro.addCapitulo("22 A Partida da Sociedade",     " 446");
    }
}