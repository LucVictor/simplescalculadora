package Funcoes;
import java.util.Scanner;

public class Menu {
    public static double[] perguntas(){
        double a;
        double b;
        Scanner opcao = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        a = opcao.nextDouble();
        System.out.println("Digite o segundo valor: ");
        b = opcao.nextDouble();
        return new double[]{a,b};
    }
    public void menu() {
        boolean opcaovalida = true;
        Funcoes funcoes = new Funcoes();
        Scanner opcao = new Scanner(System.in);
        while(opcaovalida == true) {
            System.out.println("Digite uma opção desejada: \n 1 - Somar \n 2 - Subtrair \n 3 - Multiplicar \n 4 - Dividir");
            switch (opcao.nextInt()) {
                case 1:
                    double[] soma = perguntas();
                    System.out.println("Resultado é "+ funcoes.somar(soma[0],soma[1]));
                    return;
                case 2:
                    double[] subtrair = perguntas();
                    System.out.println("Resultado é "+ funcoes.subtrair(subtrair[0],subtrair[1]));
                    return;
                case 3:
                    double[] multiplicar = perguntas();
                    System.out.println("Resultado é "+ funcoes.multiplicar(multiplicar[0],multiplicar[1]));
                    return;
                case 4:
                    double[] dividir = perguntas();
                    System.out.println("Resultado é "+ funcoes.dividir(dividir[0],dividir[1]));
                    return;
                default:
                    System.out.print("Opçao invalida;");
                    break;
            }
        }
    }
}
