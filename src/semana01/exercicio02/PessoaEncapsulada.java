package semana01.exercicio02;

public class PessoaEncapsulada {
    private String nome;
    private int idade;
    private String email;
    
    // Construtor
    public PessoaEncapsulada(String nome, int idade, String email) {
        this.nome = nome;
        setIdade(idade); // Usando setter para validação
        this.email = email;
    }
    
    // Getters e Setters com validação
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Nome não pode ser vazio!");
        }
    }
    
    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade deve estar entre 0 e 150 anos!");
        }
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Email deve conter @!");
        }
    }
    
    public void seApresentar() {
        System.out.println("Olá! Eu sou " + nome + ", tenho " + idade + " anos e meu email é " + email);
    }
    
    @Override
    public String toString() {
        return "PessoaEncapsulada [nome=" + nome + ", idade=" + idade + ", email=" + email + "]";
    }
}