package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O Id do aluno precisa ser positivo")
  private Long alunoId;

  @NotNull(message = "Campo com informação invalida")
  @Positive(message = " '${ValidatedValue}' precisa ser positivo")
  private double peso;

  @NotNull(message = "Campo com informação invalida")
  @Positive(message = " '${ValidatedValue}' precisa ser positivo")
  @DecimalMin(value = "150", message = "'${ValidatedValue}', precisa ser no minimo {value}. ")
  private double altura;

}
