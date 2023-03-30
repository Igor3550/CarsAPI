package com.cars.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarsDTO;

@RestController
@RequestMapping("/")
public class CarsController {
  @PostMapping
  public void create(@RequestBody CarsDTO req) {
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Marca: " + req.fabricante());
    System.out.println("Ano de modelo: " + req.anoModelo());
    System.out.println("Valor: R$" + req.valor());
  }
}
