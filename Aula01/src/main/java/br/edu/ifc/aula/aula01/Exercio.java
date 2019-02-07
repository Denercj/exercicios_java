/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifc.aula.aula01;

import java.awt.TrayIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
public class Exercio {
    
    public static void main(String [] args){
        
        String nome;
        double n1,n2,n3,p1,p2,p3,media;
        try{
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Informe sua primeira nota: "));
        p1 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso para essa nota: "));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua segunda nota: "));
        p2 = Double.parseDouble(JOptionPane.showInputDialog("Informe o peso para essa nota: "));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Informe a sua terceira nota: "));
        p3= Double.parseDouble(JOptionPane.showInputDialog("Informe o peso para essa nota: "));
        
        if (p1+p2+p3== 10){
        media = ((n1*p2 + n2*p2 + n3*p3)/(p1+p2+p3));
         
        if (media >= 7){
        JOptionPane.showMessageDialog(null, nome+ "Você foi Aprovado!!!");
        }else if ((media > 4)&& (media < 7)){
        JOptionPane.showMessageDialog(null, nome+ "Você está  em Exame!!!");
        }else if (media < 4){
        JOptionPane.showMessageDialog(null, nome+ "Você está Reprovado!!!");
        }
        JOptionPane.showMessageDialog(null, nome+ "A média ponderada de suas notas é: "+media);
        
        
        
        }else {
        
            JOptionPane.showMessageDialog(null, "O peso total deve ser igual a 10!!!");
        
        }
        
        
    }catch (NumberFormatException ex) {
    
    JOptionPane.showMessageDialog(null,"Houve um erro na conversão dos números","Informe apenas números",TrayIcon.MessageType.WARNING);
    
}finally {
 System.out.println("Saindo...");
        System.exit(0);
        }
    
}
}
    
