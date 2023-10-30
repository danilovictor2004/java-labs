public class Principal {

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("João", 40);
        System.out.println(funcionario);
        Holerite holerite1 = funcionario.gerarHolerite(180, "jul/2022");
        holerite1.imprimir();

        System.out.println();

        Programador programador = new Programador("Murilo", 40);
        programador.setValorBonus(1000);
        System.out.println(programador);
        Holerite holerite2 = programador.gerarHolerite(180, "jul/2022");
        holerite2.imprimir();
    }

}
