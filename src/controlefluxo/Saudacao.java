package controlefluxo;

import java.util.Scanner;

public class Saudacao {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        IO.println("Digite um horário (número inteiro): ");
        int hora = input.nextInt();

        if(hora <= 11){
            IO.println("Bom dia!!");
        }
        else if(hora <= 17){
            IO.println("Boa tarde!!");
        }
        else{
            IO.println("Boa noite!!");
        }

        }
    }
