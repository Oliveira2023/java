/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appcmdmath4;

/**
 *
 * @author lucia
 */
public class ValorNegativoException extends RuntimeException {
    
        public ValorNegativoException(){
           
        }
        public ValorNegativoException(String message) {
            super(message);
        }
        public ValorNegativoException(String msg, Throwable cause) {
            super(msg, cause);
        }
    }

