package semana02;
import semana01.exercicio02.Funcionario;

public class Gerente extends Funcionario{
        
        private int tamanhoEquipe;
        private String departamento;
        private double metaMensal;

        public Gerente(String nome, String cargo, double salario, int tamanhoEquipe, String departamento, double metaMensal){
            super(nome, cargo, salario);
            this.tamanhoEquipe = tamanhoEquipe;
            this.departamento = departamento;
            this.metaMensal = metaMensal;
        }

        //getters e setters

        public int getTamanhoEquipe(){
            return tamanhoEquipe;
        }
        public void setTamanhoEquipe(int tamanhoEquipe){
            this.tamanhoEquipe = tamanhoEquipe;
        }
        public String getDepartamento(){
            return departamento;
        }
        public void setDepartamento(String departamento){
            this.departamento = departamento;
        }
        public double getMetaMensal(){
            return metaMensal;
        }
        public void setMetaMensal(double metaMensal){
            this.metaMensal = metaMensal;
        }
        
        public String toString(){
            return "Gerente [nome=" + getNome() + ", cargo=" + getCargo() + ", salario=" + getSalario() + ", tamanhoEquipe=" + tamanhoEquipe + ", departamento=" + departamento + ", metaMensal=" + metaMensal + "]";
        }

        // sobrescrever metodos

        @Override
        public void seApresentar(){
            super.seApresentar();
            System.out.println("Gerencio uma equipe de " + tamanhoEquipe + " pessoas no departament de " + departamento + ".");

        }

        // metodo especifico

        public void conduzirReuniao(){
            System.out.println(getNome() + " está conduzinho uma reuniao com a equipe de " + departamento + ".");
        }

        public void avaliarEquipe(){
            System.out.println(getNome() + " está avaliando o desemepnho da equipe.");
        }

        public double calcularBonusGerencia(){
            return getSalario() * 0.15 + (tamanhoEquipe * 200); // 15% + R$200 por pessoa
        }

        public boolean verificarMeta(double vendaAtual){
            if (vendaAtual >= metaMensal){
                System.out.println("Meta batida! Vendas: R$ " + vendaAtual + " / Meta: R$ " + metaMensal);
                return true;
            }
            else{
                System.out.println("Meta não batida. Vendas: R$ " + vendaAtual + " / Meta: R$ " + metaMensal);
                return false;
            }

        }
    }

   
class TesteGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente("Maria", "Gerente de Vendas", 8000.0, 
                                5, "Vendas", 50000.0);
        Gerente g2 = new Gerente("João", "Gerente de TI", 9000.0, 
                                8, "Tecnologia", 30000.0);
        
        // Testando métodos
        g1.seApresentar();
        g1.conduzirReuniao();
        g1.avaliarEquipe();
        
        g2.seApresentar();
        g2.conduzirReuniao();
        
        // Testando bônus
        System.out.println("Bônus de " + g1.getNome() + ": R$ " + 
                          g1.calcularBonusGerencia());
        System.out.println("Bônus de " + g2.getNome() + ": R$ " + 
                          g2.calcularBonusGerencia());
        
        // Testando metas
        g1.verificarMeta(55000); // Meta batida
        g1.verificarMeta(45000); // Meta não batida
        g2.verificarMeta(35000); // Meta batida
    }

    }