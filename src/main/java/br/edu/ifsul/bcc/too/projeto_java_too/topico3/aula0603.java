/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifsul.bcc.too.projeto_java_too.topico3;

/**
 *
 * @author 20221PF.CC0008
 */
public class aula0603 {
    public static void main (String args[]){
        /*double med;
        int num1;
        int num2;*/
        System.out.println("camou a main");
        
    }
   /* public static double media(int n1, int n2){
        double med;
        med = (n1 + n2)/2;
        return (med);
    }*/
    
    public float Media(float n1, float n2){
        
        return (n1 + n2) / 2.0f;
    }
    public float media(float n1, float n2){
        float res = n1 + n2;
        res = res / 2f;
        
        return res;
    }
}
