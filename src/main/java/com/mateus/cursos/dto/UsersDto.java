package com.mateus.cursos.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UsersDto {

    private Long id;

    @NotBlank(message = "Campo name não pode ser nulo  ou vazio")
    @Size(min = 5, message = " Deve ter tamanho mínimo de 6 caracteres")
    private String name;

    @Email(message = "Inválido")
    private String email;

    @Size(min = 11, message = " Deve ter tamanho mínimo de 9 dígitos")
    private String phone;

    @CPF(message = "Inválido")
    @Size(min = 11, max = 11, message = " Deve ter tamanho de 11 dígitos")
    private String cpf;

    private LocalDate dtSubscription = LocalDate.now();

    private LocalDate dtExpiration = LocalDate.now();

    @NotNull
    private Long userTypeId;

    private Long subscriptionTypeId;
}
