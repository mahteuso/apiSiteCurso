package com.mateus.cursos.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionTypeDto {

    private Long id;

    @NotBlank(message = "Campo name não pode ser nulo ou vazio")
    @Size(min=5, max = 30, message = " Deve ter tamanho entre 5 e 30 caracters")
    private String name;

    @Max(value = 12, message = "Campo accessMonths não pode ser maior que 12")
    private Long accessMonths;

    @NotNull(message = "Campo price não pode ser nulo")
    private BigDecimal price;

    @NotBlank(message = "Campo productKey não pode ser nulo ou vazio")
    @Size(min = 5, max = 15, message = " Deve ter tamanho entre 5 e 15 caracters")
    private String productKey;
}
