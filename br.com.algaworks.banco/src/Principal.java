public class Principal {

    public static void main(String[] args) {

        Conta conta = new Conta();
        conta.setTitular(new Titular("João da Silva", "12345678900"));
        conta.setAgencia(1234);
        conta.setNumero(999999);
        conta.imprimirDemonstrativo();

        conta.depositar(100);
        conta.imprimirDemonstrativo();

        conta.sacar(27.50);
        conta.imprimirDemonstrativo();

    }

}
