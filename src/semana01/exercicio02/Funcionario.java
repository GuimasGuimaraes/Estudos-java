package semana01.exercicio02;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    
    // Construtor
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Método para se apresentar
    public void seApresentar() {
        System.out.println("Olá! Eu sou " + nome + ", trabalho como " + cargo + " e meu salário é R$ " + salario);
    }
    
    // Método toString
    @Override
    public String toString() {
        return "Funcionario [nome=" + nome + ", cargo=" + cargo + ", salario=" + salario + "]";
    }
}