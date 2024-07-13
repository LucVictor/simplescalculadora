package Funcoes;

public class Funcoes {

    public double somar(double a, double b) {
        return a + b;
    }

    public double subtrair(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        if(a == 0 | b == 0){
            return 0;
        }
        return a * b;
    }

    public double dividir(double a, double b) {
        if(a == 0 | b == 0){
            return 0;
        }
        return a / b;
    }


}
