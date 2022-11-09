import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //TODO: Imprima se os valores numéricos passados são iguais ou não.

        Scanner number = new Scanner(System.in);
        int X = number.nextInt();
        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};
        System.out.println(buscarNumero(elementos,X));
    }

    public static String buscarNumero(int[] elementos, int X){
        for (int i=0;i<elementos.length;i++){
            if(elementos[i] == X){
                return "Achei "+elementos[i]+" na posicao " +i;
            }
        }
        return "Numero "+X+" nao encontrado!";
    }
}