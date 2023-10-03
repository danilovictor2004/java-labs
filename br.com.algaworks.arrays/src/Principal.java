import java.util.Arrays;
import java.util.Comparator;

public class Principal {
    public static void main(String[] args) {

        //Criar um array de quatro notas e calcular a média
        Double[] notas = new Double[] { 5.5, 6.0, 8.0, 7.5 };
        double media = Aluno.calcularMedia(notas);
        System.out.println("A média é: " + media);

        // Ordenar a lista de forma crescente
        Arrays.sort(notas);
        System.out.println(Arrays.toString(notas));

        // Order a lista de forma decrescente
        Arrays.sort(notas, Comparator.reverseOrder());
        System.out.println(Arrays.toString(notas));

    }
}
