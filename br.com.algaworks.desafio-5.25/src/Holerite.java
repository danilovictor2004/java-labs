public class Holerite {

    Funcionario funcionario;
    double valorTotalHora;
    double valorTotalHoraExtra;
    double valorAdicional;

    double calcularValorTotal() {
        return valorTotalHora + valorTotalHoraExtra + valorAdicional;
    }

    void imprimirHolerite() {
        System.out.println("---- Holerite ----");
        System.out.printf("Funcionário: %s%n", funcionario.nome);
        System.out.printf("Possui filhos: %s%n", funcionario.possuiFilho() ? "Sim" : "Não");
        System.out.printf("Valor Total Hora: R$ %.2f%n*", valorTotalHora);
        System.out.printf("Valor Total Hora Extra: R$ %.2f%n", valorTotalHoraExtra);
        System.out.printf("Valor Adicional: R$ %.2f%n", valorAdicional);
        System.out.printf("Total a Receber: R$ %.2f%n", calcularValorTotal());
    }

}
