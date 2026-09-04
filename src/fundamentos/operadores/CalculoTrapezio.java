package fundamentos.operadores;

import java.util.Scanner;

public class CalculoTrapezio {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        double area;

        IO.println("Calcule a aréa do Trapézio");
        IO.println("    --------");
        IO.println("   /        \\");
        IO.println("  /          \\");
        IO.println(" /____________\\");

        IO.println("Digite a Base maior:  ");
        double B = input.nextDouble();
        IO.println("Digite a base menor:" );
        double b = input.nextDouble();
        IO.println("Digite a altura: ");
        double h = input.nextDouble();

        area = (B + b) / 2 * h;

        IO.println("Resultado: " + area);

        input.close();
    }
}

