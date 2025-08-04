package semana01.exercicio01;

class PessoaMelhorada {
    String nome;
    int idade;
    
    // CONSTRUTOR = método especial para criar objetos
    PessoaMelhorada(String nomeInicial, int idadeInicial) {
        nome = nomeInicial;
        idade = idadeInicial;
        System.out.println("Pessoa criada: " + nome);
    }
    
    void seApresentar() {
        System.out.println("Olá! Eu sou " + nome + " e tenho " + idade + " anos.");
    }
}

class Main {
    public static void main(String[] args) {
        // Agora é mais fácil criar pessoas!
        PessoaMelhorada p1 = new PessoaMelhorada("Guilherme", 25);
        PessoaMelhorada p2 = new PessoaMelhorada("Lorena", 30);
        PessoaMelhorada p3 = new PessoaMelhorada("Serena", 1);
        
        p1.seApresentar();
        p2.seApresentar();
        p3.seApresentar();
    }
}