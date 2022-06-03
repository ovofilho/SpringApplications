/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.spring.primeirospassos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 *
 * @author orland0_s400ca
 */

@Component
public class MyApp implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
        float resultado;
        resultado = calculadora.calcular(5,7,"soma");
        System.out.println("O resultado é " + resultado);
        resultado = calculadora.calcular(5,7,"Subtrai");
        System.out.println("O resultado é " + resultado);
        resultado = calculadora.calcular(5,7,"MULTIPLICA");
        System.out.println("O resultado é " + resultado);
        resultado = calculadora.calcular(5,7,"dIvide");
        System.out.println("O resultado é " + resultado);
        resultado = calculadora.calcular(5,7,"fatora");
        System.out.println("O resultado é " + resultado);
        
    }
    
    
}
