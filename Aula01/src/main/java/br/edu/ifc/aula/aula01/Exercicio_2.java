/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercicio_2 {
    
    public static void main(String args[]){
    
    int area, base, altura;
    
    base = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da base do triângulo: "));
    altura = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor da altura do triangulo: "));
    
    //area = (base * altura)/2; // só usar isso se nao for usar o método abaixo
    
    JOptionPane.showMessageDialog(null, "A área do triângulo é: " + calcularAreaTriangulo(base, altura));
    
    
    
    
    }
    //metodo para calcular a area do triangulo
    public static int calcularAreaTriangulo(int base, int altura){//se o metodo for statico ele podera ser visto por outra classe estatica tbm sem a necessidade de instanciar
        
        return base*altura;
    
    }
}
