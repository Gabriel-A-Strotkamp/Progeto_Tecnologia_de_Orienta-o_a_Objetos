/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.projeto_java_too.topico3;

/**
 *
 * @author 20221PF.CC0008
 */
public class Aula0603 {
    
    //método especial:
    // esse método é o construtor de classe tesrte.
    // o nome d o método construtor deverá ser o mesmo da classe
    // é possível ter mais do que um método construtor na mesma classe
    // só com nomes diferentes
    public Aula0603(){
        
    }
    public static void main (String args[]){
   
        //criação da variável nesse caso o tipo da vaiável/objeto a é Aula0603.
        // o objeto a está sendo inicializado com uma nova instância da classe Aula0603.
        Aula0603 a = new Aula0603();
        
        float x = media(10f, 15f);
        
        System.out.println("chamou a main");
        
    }

    
    public static float media(float n1, float n2){
        
        return (n1 + n2) / 2.0f;
    }
    public float media2(float n1, float n2){
        float res = n1 + n2;
        res = res / 2f;
        
        return res;
    }
}
