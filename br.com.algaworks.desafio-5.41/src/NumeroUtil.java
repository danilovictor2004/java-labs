public class NumeroUtil {

    static int maiorNumero(int a, int b) {
        return a > b ? a : b;
    }

    static int maiorNumero(int a, int b, int c) {
        return maiorNumero(maiorNumero(a, b), c);
    }

    static double maiorNumero(double a, double b) {
        return a > b ? a : b;
    }

    static double maiorNumero(double a, double b, double c) {
        return maiorNumero(maiorNumero(a, b), c);
    }

}
