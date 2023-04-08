import java.util.Scanner;
class Main{
public static void main(String[] args){
//Passo1:Mostrar variaveis  
double valorhoras;
double horastrabalhadas;
  double salariobruto;
double ir;
  double inss;
  double sindicato;
  double descontos;
  double salarioliquido;
//Passo2:Entrada de dados
Scanner teclado = new Scanner(System.in);
  System.out.println("Quanto ganha por hora ?");
valorhoras = teclado.nextDouble();
  System.out.println("Número de horas trabalhadas por dia ?");
horastrabalhadas = teclado.nextDouble();
//Passo3:calculos 
  salariobruto = (valorhoras * horastrabalhadas);
  ir = (salariobruto * 0.11);
  inss = (salariobruto * 0.08);
  sindicato = (salariobruto * 0.05);
  descontos = (ir + inss + sindicato);
  salarioliquido = (salariobruto - descontos);
//Passo4:Mostrar resultado  
 System.out.println("Salário Bruto: R$:" + salariobruto);
 System.out.println("Desconto do Imposto de Renda (11%): R$:" + ir);
 System.out.println("Desconto do INSS (8%): R$:" + inss);
 System.out.println("Desconto do Sindicato (5%): R$:" + sindicato);
 System.out.println("Salário Líquido: R$:" + salarioliquido);

}
}
