import Model.Carro;
import Model.Proprietario;

public class Principal {

    public static void main(String[] args) {

        Proprietario maria = new Proprietario("Maria", "11111111111");
        Proprietario ana = new Proprietario("Ana", "22222222222");
        Proprietario jose = new Proprietario("José", "33333333333");
        Proprietario joao = new Proprietario("João", "44444444444");

        Carro bmw = new Carro("ALG1A23", "BMW X3");
        Carro honda = new Carro("WOR9K87", "Honda HR-V");
        Carro ford = new Carro("JAV5A67", "Ford Ka");
        Carro porsche = new Carro("EJA0V44", "Porsche 911");

    }

}
