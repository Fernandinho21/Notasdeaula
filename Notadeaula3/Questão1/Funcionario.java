package Notadeaula3.Questão1;

public class Funcionario {
    private String nome;
    private String nasc; 
    private double salario;
    private String tipo; 
    private String projeto; 
    private String linguagem; 

    public Funcionario(String nome, String nasc, double salario, String tipo) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
        this.tipo = tipo;
    }

    public void informarSalario() {
        System.out.println("Salário de " + nome + ": R$ " + salario);
    }

    public void calcularIdade() {
        int anoAtual = 2024; 
        String[] partesData = nasc.split("/");
        int anoNascimento = Integer.parseInt(partesData[2]);
        int idade = anoAtual - anoNascimento;
        System.out.println("Idade de " + nome + ": " + idade + " anos");
    }

    public void setProjeto(String projeto) {
        this.projeto = projeto;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public void exibirInformacoes() {
        informarSalario();
        calcularIdade();
        if (tipo.equals("Gerente")) {
            System.out.println("Projeto do gerente " + nome + ": " + projeto);
        } else if (tipo.equals("Programador")) {
            System.out.println("Linguagem do programador " + nome + ": " + linguagem);
        }
    }
}

