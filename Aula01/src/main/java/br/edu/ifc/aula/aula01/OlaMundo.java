package br.edu.ifc.aula.aula01;

import javax.swing.JOptionPane;

/**
 * <b>Primeira classe criada</b>
 *
 * @author Dener // posso colocar essa expressão @deprecated para sinalzar que
 * essa classe não esta amis sendo usada
 */
public class OlaMundo {

    public static void main(String args[]) {
        String nome;
        double nota1, nota2, nota3, trabalho, media;
try{
        nome = JOptionPane.showInputDialog("Informe seu nome: ");

        nota1 = Double.parseDouble(
                JOptionPane.showInputDialog("Primeira Nota: "));

        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Segunda Nota"));

        trabalho = Double.parseDouble(JOptionPane.showInputDialog("Nota Do Trabalho: "));

        media = (nota1 + nota2 + trabalho) / 3;
        JOptionPane.showMessageDialog(null, "A média do aluno " + nome + " é: " + media);

    }
    catch (NumberFormatException ex) {
    
    JOptionPane.showMessageDialog(null,"Houve um erro na conversão dos números", "Informe apenas números",TrayIcon.MessageType.WARNING
    
}finally {
 System.out.println("Saindo...");
        System.exit(0);
        }

}

}
