package ifsc.poo;

public class Pessoa {

    //Item 2.1 - Readme.md
    private String nome ;
    private int idade ;

    //construtor
    public Pessoa(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }

    //Item 2.2 - Readme.mdc
    public void setNome(String nome) {
        if(!nome.isEmpty()) this.nome = nome;
        else System.out.println("Nome do " + this.nome +" não pode estar vazio para alteração e continua o mesmo.");
    }

    //Item 2.2 - Readme.md - fornecedor do nome
    public String getNome() {
        return this.nome;
    }

    //Item 2.2 - Readme.md - configurador da idade
    public void setIdade(int idade) {
        if (idade < 0) {
            System.out.println("Ajustar a idade de " + idade + " é incoerente para " + this.nome + " continuando com: " + this.getIdade() + " anos.");
            return;
        }
        this.idade = idade;
    }

    //Item 2.2 - Readme.md - fornecedor da idade
    public int getIdade() {
        return this.idade;
    }

    //Item 2.2 - Readme.md
    //todo perguntar sobre esse tipo de método na classe, é coerente ou impoertinente?
    public void felizAniversario(){System.out.println(this);}
    @Override
    public String toString() {return this.nome + ", feliz aniversário! " ;}
}