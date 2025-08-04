package semana01.exercicio01;

public class ClassePessoa {
    public static void main(String[] args) {
        Pessoa funcionario = new ClassePessoa().new Pessoa();
        funcionario.nome = "Guilherme";
        funcionario.idade = 28;
        funcionario.seApresentar();


    }

    class Pessoa {
        String nome;
        int idade;

        void seApresentar(){
            System.out.println("Olá, eu sou " + nome + " e tenho " + idade + " anos.");
        }
    
    }
    
}
