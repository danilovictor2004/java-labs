import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.*;

public class Principal {

    public static void main(String[] args) {
		var funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(new Funcionario("João", new BigDecimal("19000"), true));
		funcionarios.add(new Funcionario("Maria", new BigDecimal("5000"), true));
		funcionarios.add(new Funcionario("Manoel", new BigDecimal("13000"), true));
		funcionarios.add(new Funcionario("Sebastião", new BigDecimal("12000"), false));

		// TODO remover funcionários inativos
//		Predicate<Funcionario> funcionario = funcionario1 -> funcionario1.isInativo();
//		funcionarios.removeIf(funcionario);

		Predicate<Funcionario> predicate = Funcionario::isInativo;
		funcionarios.removeIf(predicate);

		// TODO ordenar funcionários pelo valor do salário
//		ToDoubleFunction<Funcionario> salarioFunction = funcionario -> funcionario.getSalario().doubleValue();
//		funcionarios.sort(Comparator.comparingDouble(salarioFunction).reversed());

//		Function<Funcionario, BigDecimal> function = funcionario -> funcionario.getSalario();
//		funcionarios.sort(Comparator.comparing(function).reversed());

		Function<Funcionario, BigDecimal> function = Funcionario::getSalario;
		funcionarios.sort(Comparator.comparing(function).reversed());

		// TODO iterar e imprimir funcionários usando o método estático imprimir

//		for (var funcionario : funcionarios) {
//			imprimir(funcionario);
//		}

//		Consumer<Funcionario> consumer = funcionario -> imprimir(funcionario);
//		funcionarios.forEach(consumer);

		Consumer<Funcionario> consumer = Principal::imprimir;
		funcionarios.forEach(consumer);

	}

	private static void imprimir(Funcionario funcionario) {
		// TODO implementar a impressão do nome, salário e impostos (20%)
		System.out.printf("Nome: %s%n", funcionario.getNome());
		System.out.printf("Salário: %.2f%n", funcionario.getSalario());
		System.out.printf("Imposto: %.2f%n", funcionario.getSalario().multiply(new BigDecimal("0.20")));
		System.out.println("----");
	}

}