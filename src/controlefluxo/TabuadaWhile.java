package controlefluxo;

public class Tabuada {

    public static void main(String[] args){

        int numero = 9;
        int contador= 1;

        while(contador <= 10){
            IO.println(numero + " x " + contador + " = " + (numero * contador));
            contador++;
        }
    }
}
