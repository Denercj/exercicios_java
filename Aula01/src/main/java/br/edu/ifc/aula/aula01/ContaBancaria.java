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
public class ContaBancaria {
    
    
    public static void main(String [] args){
    
    double saldo =0,valor;
    
    JOptionPane.showMessageDialog(null, "Seu saldo é: "+saldo);
    valor = Double.parseDouble(JOptionPane.showInputDialog("Você deseja depositar quanto na sua conta: "));
    
    saldo +=valor;
    JOptionPane.showMessageDialog(null, "Seu saldo é: "+saldo);
    
    valor = Double.parseDouble(JOptionPane.showInputDialog("Você deseja Retirar quanto de sua conta?: "));
    
    saldo -= valor;
    
    JOptionPane.showMessageDialog(null, "Seu saldo é: "+saldo);
    
    }
    
}
