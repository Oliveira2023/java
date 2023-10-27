/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package portifolio.appbanco.gerenciabanco;

import java.util.Scanner;

/**
 *
 * @author lucia
 */


public class Main {
    
    public static void main(String[] args) {
        
        /*GerenciaBanco gerencia = new GerenciaBanco("Luciano","Oliveira","97340332634",0.0f);*/
        Cliente gerencia = new Cliente();
        
        
        String entrada;
        boolean saida = false;
        System.out.println(gerencia.consultaSaldo());
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite seu nome:");
        entrada = scanner.next();
        gerencia.setName(entrada);


        System.out.println("Digite seu sobrenome:");
        entrada = scanner.next();
        gerencia.setSobrenome(entrada);
        System.out.println(gerencia.getNome() + " " + gerencia.getSobrenome());

        System.out.println("Digite seu CPF:");
        entrada = scanner.next();
        gerencia.setCPF(entrada);
        System.out.println(gerencia.getCPF());
        
        do{
            System.out.println("Digite a opção desejada:");
            System.out.println("\t1-Consultar saldo.");
            System.out.println("\t2-Realizar um deposito.");
            System.out.println("\t3-Realizar um saque.");
            System.out.println("\t4-Sair do sistema.");
            
            entrada = scanner.next();
            switch (entrada){
                case "1" -> System.out.println("Seu saldo é: " + gerencia.getSaldo() +"\n");
                case "2" -> {
                    System.out.println("Digite o valor a depositar:");
                    entrada = scanner.next();
                    try{
                    gerencia.deposito(Float.parseFloat(entrada));
                    }catch(NumberFormatException ex){
                        System.out.println("Não foi possivel efetuar o deposito");
                        System.out.println("Exception: " + ex);
                    }
                }
                case "3" -> {
                    System.out.println("Digite o valor do saque:");
                    entrada = scanner.next();
                    float saque = Float.parseFloat(entrada);
                    float saldo = gerencia.consultaSaldo();
                    try {
                        gerencia.saque(saque);
                        System.out.println("Seu saldo atual é R$ " + gerencia.getSaldo());
                    }catch(Exception ex){
                        System.out.println("Não foi possivel efetuar o saque.");
                        System.out.println(ex);
                    }
                }
                case "4" -> {
                    System.out.println("Obrigado por utilizar nossos serviços!");
                    saida = true;
                }
            }       

        }while (!saida);
        
    }
    
}
