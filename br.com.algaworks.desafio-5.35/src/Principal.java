public class Principal {

    public static void main(String[] args) {
        double areaQuadrado = FormasGeometricas.calcularAreaQuadrado(5);
        double areaCirculo = FormasGeometricas.calcularAreaCirculo(10);

        System.out.printf("Área do Quadrado: %.2f%n", areaQuadrado);
        System.out.printf("Área do Círculo: %.2f%n", areaCirculo);
    }

}
