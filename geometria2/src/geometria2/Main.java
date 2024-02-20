/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package geometria2;

/**
 *
 * @author lucia
 */
public class Main {
    public static void main(String[] args) {
        Cubo cubo1 = new Cubo(1);
        Cubo cubo2 = new Cubo(1.25);
        System.out.println(cubo1);
        System.out.println(cubo2);
        if (cubo1.equals(cubo2)) {
            System.out.println("Cubos geometricamente iguais\n");
        }else{
            System.out.println("Cubos geometricamente diferentes\n");
        }
        
        Retangulo rect1 = new Retangulo(4, 25);
        Retangulo rect2 = new Retangulo(4, 26);
        System.out.println(rect1);//invoca o metoo toString
        System.out.println(rect2);//invoca o metoo toString
        if (rect1.equals(rect2)){//invoca o metodo equals
            System.out.println("Figuras Geometricas Iguais");
        }else{
            System.out.println("Figuras Geometricas Diferentes");
        }
    }
}
