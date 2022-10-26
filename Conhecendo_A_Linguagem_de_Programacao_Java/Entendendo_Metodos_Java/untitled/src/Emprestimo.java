public class Emprestimo {

    //A taxa (em pocentagme) é aplicada em juros simples sobre o valor inicial do emprestimo
    public static double valorQuitacaoEmprestimo(double valorEmprestado,float taxa, int quantidadeParcela){
        double valorFinal = valorEmprestado*((taxa/100)*quantidadeParcela/10+1);
        return valorFinal;
    }
}