package com.cars.api.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Cars {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 150, nullable = false)
  private String modelo;

  @Column(nullable = false)
  private String fabricante;

  @Column(nullable = false)
  private String dataFabricacao;

  @Column(nullable = false)
  private double valor;

  @Column(nullable = false)
  private int anoModelo;
}
