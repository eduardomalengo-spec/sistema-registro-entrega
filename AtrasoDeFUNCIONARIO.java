import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class Funcionario_Cliente {
	String nome;
    double salario;
    
    public Funcionario_Cliente() {};
    
    public Funcionario_Cliente(String nome, double salario) {
    	this.nome = nome;
        this.salario = salario;
    }
}

public class AtrasoDeFUNCIONARIO {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        
        String nome = "";
        double salario = 0;
        
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        
        LocalTime horarioAtual = LocalTime.now();
        System.out.println("| HORAS: " + horarioAtual + " | ");
        
        String horarioMarcado = "16:40";
        LocalTime horarioSolvido = LocalTime.parse(horarioMarcado, formato);
        
        System.out.println("|===============================================|");
        System.out.println("|VERIFICAÇÃO DE CUMPRIMENTO DE HORARIOS MARCADO |");
        System.out.println("|===============================================|");
        
        System.out.println("SEU NOME: ");
        nome = sc.nextLine();
        
        System.out.print("SEU SALARIO: ");
        salario = sc.nextDouble();
        sc.nextLine();
        
        System.out.print("HORARIO DE CHEGADA: ");
        LocalTime chegada1 = LocalTime.parse(sc.nextLine());
        Funcionario_Cliente obj = new Funcionario_Cliente(nome, salario);
        
        if(chegada1.isBefore(horarioSolvido)) {
        	System.out.println(" PERFEITO! ");
            System.out.println("==============================");
            System.out.println("  RELATORIO FINAL DE ANALISE  ");
            System.out.println("==============================");
            System.out.println("NOME: " + obj.nome + " | ");
            System.out.printf("SALARIO + TAXA/SEM TAXA: %.2f", obj.salario, " | ");
        }
        else {
        	System.out.println(" ATRASADO! ");
            System.out.println("DESCONTO DE 20,90% ");
            System.out.println("==============================");
            System.out.println("  RELATORIO FINAL DE ANALISE  ");
            System.out.println("==============================");
            System.out.println("NOME: " + obj.nome + " | ");
            System.out.printf("SALARIO + TAXA/SEM TAXA: %.2f", obj.salario - (20.9), " | ");
        }
       
    }
}