package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty
  @Size (min= 3, max= 50,message ="'${valitedValue}' Necessário que esteja entre {min} e {max} caracteres." )
  private String nome;

  @NotEmpty
  @CPF(message = " '${validatedValue}' não é valido . ")
  private String cpf;

  @NotEmpty
  @Size(min = 3, max = 50, message = " '${validatedValue}' Necessário que esteja entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull
  @Past(message = "Data '${validatedValue}' é inválida ")
  private LocalDate dataDeNascimento;
}
