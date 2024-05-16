package com.mateus.cursos.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "subscriptions_type")
public class SubscriptionType implements Serializable {

    @Id
    @Column(name = "subscriptions_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(name = "access_months", nullable = false)
    private Long accessMonths;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "product_key", nullable = false, unique = true)
    private String productKey;

}
