package semana02;

import semana01.exercicio02.Funcionario;

public class TesteFuncionarios {
    public static void main(String[] args) {
        System.out.println("=== TESTE DE FUNCIONÁRIOS ===");
        
        // Criando um funcionário básico
        Funcionario funcionario = new Funcionario("João", "Analista", 5000.0);
        funcionario.seApresentar();
        
        System.out.println("\n=== TESTE DE DESENVOLVEDOR ===");
        
        // Criando um desenvolvedor
        Desenvolvedor dev = new Desenvolvedor("Maria", "Desenvolvedora", 7000.0, "Java", 3.5);
        dev.seApresentar();
        dev.programar();
        System.out.println("Bônus por experiência: R$ " + dev.calcularBonusExperiencia());
        
        System.out.println("\n=== TESTE DE GERENTE ===");
        
        // Criando um gerente
        Gerente gerente = new Gerente("Carlos", "Gerente de TI", 12000.0, 8, "Tecnologia", 50000.0);
        gerente.seApresentar();
        gerente.conduzirReuniao();
        gerente.avaliarEquipe();
        
        // Testando verificação de meta
        boolean metaAtingida = gerente.verificarMeta(55000.0);
        System.out.println("Meta atingida: " + (metaAtingida ? "Sim" : "Não"));
        
        System.out.println("Bônus de gerência: R$ " + gerente.calcularBonusGerencia());
    }
}