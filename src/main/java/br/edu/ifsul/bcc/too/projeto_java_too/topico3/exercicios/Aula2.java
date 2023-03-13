/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.projeto_java_too.topico3.exercicios;

/**
 *
 * @author 20221PF.CC0008
 */

/*Exercício: alterar essa cotina para que o usuário informe os dois valores.
opção 1: por interface gráfica. (java.swing.J0ptionPane)
opção 2: por lina de comando. (java.util.Scanner)
*/
public class Aula2 {
    public Aula2(){
        
    }
    public static void main(String args[]){
        System.out.println("chamou a main");
        
        Aula2 a = new Aula2();
        
        float res = a.media(14f, 15f);
        
        System.out.println("Média: " + res);
    }
    
    public float media(float n1, float n2){
        return (n1 + n2)/2.0f;
    }
    
}
