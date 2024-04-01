package crm.entidade;

import java.time.LocalDate;

public record Cliente(Long codigo, String nome, LocalDate dataNascimento) {

}