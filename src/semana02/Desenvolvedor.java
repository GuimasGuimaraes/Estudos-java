package semana02;

// Importa a classe pai
import semana01.exercicio02.Funcionario;

public class Desenvolvedor extends Funcionario{
    // atribuytos especificos do desenvolvedor

    private String linguagemPrincipal;
    private double anosExperiencia;

    //construtor
    public Desenvolvedor(String nome, String cargo, double salario, String linguagemPrincipal,
    double anosExperiencia){
        super(nome, cargo, salario);
        this.linguagemPrincipal = linguagemPrincipal;
        this.anosExperiencia = anosExperiencia;
    }

    //Getters e setters

    public String getLinguagemPrincipal(){
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal){
        this.linguagemPrincipal = linguagemPrincipal;
    }
    public double getAnosExperiencia(){
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia){
        this.anosExperiencia = anosExperiencia;
    }
    // Sobrescrever metodo da classe pai (Polimorfismo)
    @Override
    public void seApresentar(){
        super.seApresentar();
        System.out.println("Eu sou um desenvolvedor com " + anosExperiencia + " anos de experiência em " + linguagemPrincipal);
    }

    //Metodo especifico do desenvolvedor

    public void programar(){
        System.out.println(getNome() + " está programando em " + linguagemPrincipal + "...");
    }

    public double calcularBonusExperiencia(){
        return getSalario() * (anosExperiencia * 0.05); // bonus de 5% ao ano
    }


}

class TesteDesenvolvedor{
    public static void main(String[] args) {
        Desenvolvedor dev1 = new Desenvolvedor("Guilherme", "Desenvolvedor",4100, "Java", 1.4);
        Desenvolvedor dev2 = new Desenvolvedor("Lorena", "Desenvolvedor", 4000, "Python", 2.0);
        dev1.seApresentar();
        dev1.programar();
        System.out.println("Bonus de experiência: " + dev1.calcularBonusExperiencia());
        dev2.seApresentar();
        dev2.programar();
        System.out.println("Bonus de experiência: " + dev2.calcularBonusExperiencia());
        System.out.println(dev1.toString());
        System.out.println(dev2.toString());


    }
}
