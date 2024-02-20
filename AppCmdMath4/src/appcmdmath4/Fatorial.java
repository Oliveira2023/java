/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcmdmath4;

/**
 *
 * @author lucia
 */
public class Fatorial {
public static long fatorial(int a){
        if (a < 0 ) {
            throw new ValorNegativoException("O valor deve ser maior que 0");
        }
        long fat = 1;
        for (int i = 1; i<= a; i++) {
            System.out.println(fat + "X" + i + "= " +(fat*i));
            fat *= i;
        }
        return fat;
    
    }
}
