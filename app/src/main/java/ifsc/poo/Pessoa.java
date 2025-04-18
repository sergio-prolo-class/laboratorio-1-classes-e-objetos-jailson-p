package ifsc.poo;

public class Pessoa {

    //Item 2.1 - Readme.md
    private String nome ;
    private int idade ;
    private final String cpf;

    //construtores
    public Pessoa(String cpf){
        this(cpf,"",0);
    }
    public Pessoa(String cpf, String nome){
        this(cpf,"",0);
    }
    public Pessoa(String cpf, String nome, int idade) {
        setNome(nome);
        setIdade(idade);
        if(cpf.isEmpty()){this.cpf = "123.456.789-00";}
        else{this.cpf = cpf;}
    }

    //Item 2.2 - Readme.md -
    public void setNome(String nome) {
        if(nome.isEmpty() && this.nome == null) {
            this.nome = "____";
        return;
        }
         else if (nome.isEmpty() && !this.nome.isEmpty()) {return ;    }
         this.nome = nome;
    }

    //Item 2.2 - Readme.md - fornecedor do nome
    public String getNome() {
        return this.nome;
    }

    //Item 2.2 - Readme.md - mudei para boolean para que quem chamou resolva o retorno false
    public boolean setIdade(int idade) {
        if (idade < 0) {
            return false;
        }
        this.idade = idade;
        return true;
    }

    //Item 2.2 - Readme.md - fornecedor da idade
    public int getIdade() {
        return this.idade;
    }

    public String getCpf(){return this.cpf;}

    public void addIdade(){
        this.idade++;
        felizAniversario();
    }

    //Item 2.2 - Readme.md
    public void felizAniversario(){
        System.out.println(this.nome + ", feliz aniversário!");
    }
    @Override
    public String toString() {return "Nome: " + this.nome+"\t\tIdade: " + this.idade + "\t\tCPF: " + this.cpf + "\n";}
}