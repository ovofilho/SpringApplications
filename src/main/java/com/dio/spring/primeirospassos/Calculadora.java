/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dio.spring.primeirospassos;


import java.util.ArrayList;
import org.springframework.stereotype.Component;


/**
 *
 * @author orland0_s400ca
 */

@Component
public class Calculadora {
  
    private final ArrayList<String> operacao = new ArrayList<>();
    
    public float calcular(float num1, float num2, String operacao){
        
        float resultado = -9999;
        int op = this.operacao.indexOf(operacao.toLowerCase());
        switch(op){
            case 0 -> resultado = soma(num1,num2);
            case 1 -> resultado = subtrai(num1,num2);
            case 2 -> resultado = multiplica(num1,num2);
            case 3 -> resultado = divide(num1,num2);
            default -> System.out.println("operação incorreta");
        }
        
        return resultado;
        
            
        
    }
    
    public Calculadora(){
        operacao.add("soma");
        operacao.add("subtrai");
        operacao.add("multiplica");
        operacao.add("divide");

        
    }
    private float soma(float num1, float num2){
        return num1 + num2;
    }
    private float subtrai(float num1, float num2){
        return num1 - num2;
    }
    private float divide(float num1, float num2){
        return num1 / num2;
    }
    private float multiplica(float num1, float num2){
        return num1 * num2;
    }
}
