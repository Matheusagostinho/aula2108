/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author IFNMG
 */
public class TestaPessoa {
    public static void main(String[] args){
        Pessoa ps1 = new Pessoa();
        
        ps1.nome = "Matheus";
        ps1.peso = 90.0;
        ps1.altura = 1.81;
        
        System.out.println("O IMC de " +ps1.nome+ " é " + ps1.calcularIMC());
        
    }
    
}
