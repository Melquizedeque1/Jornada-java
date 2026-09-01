package fundamentos.operadores;

public class CalculadoraImc {

    public static void main(String[] args){

        double peso = 92.20;
        double altura = 1.72;
        double imc = peso / (altura * altura);
        String imcArredondado = String.format("%.2f", imc); // Método que formata e arredonda as casas décimais.

        IO.println("Seu IMC é " + imcArredondado);
    }
}
