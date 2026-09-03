package controlefluxo;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("1. Soma");
        System.out.println("2. Subtração");
        System.out.println("3. Multiplicação");
        System.out.println("4. Divisão");

        System.out.println("Escolha um operador: ");
        int operador = input.nextInt();

        switch (operador){
            case 1:
                System.out.println("Soma +");
                break;
            case 2:
                System.out.println("Subtração -");
                break;
            case 3:
                System.out.println("Multiplicação *");
                break;
            case 4:
                System.out.println("Divisão /");
                break;
            default:
                System.out.println("Valor Inválido");
                break;

        }
    }
}
