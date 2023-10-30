public class Principal {

    public static void main(String[] args) {

        Titular titular = new Titular("João da Silva", "12345678900");
        Conta conta = new Conta(titular, 1234, 99999);

        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(27.50);
        conta.imprimirDemonstrativo();

    }

}
