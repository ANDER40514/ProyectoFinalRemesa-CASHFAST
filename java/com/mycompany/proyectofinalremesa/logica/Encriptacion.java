package com.mycompany.proyectofinalremesa.logica;


public class Encriptacion {
    
   // Encriptacion con Hash MD5
   public String MD5(String md5) {
       
       try {
           java.security.MessageDigest md = java.security.MessageDigest.getInstance("MD5") ;
           
           byte [] array = md.digest(md5.getBytes());
           
           StringBuffer sb = new StringBuffer();
           
           /*
           Explicacion del FOR:
           
           Se recorre el arreglo de bytes y se convierte cada byte a su representación hexadecimal
           utilizando el método Integer.toHexString. Se realiza una operación de máscara con 0xFF 
           para asegurarse de que el byte se interprete como un número positivo y se aplica un OR con 0x100 
           para asegurar que la cadena resultante tenga al menos dos caracteres. Luego, 
           se toma la parte de la cadena desde el segundo carácter hasta el final 
           utilizando substring(1, 3)  
           */
           
           for (int i = 0; i < array.length ; i++) {
               
               // Se concatena cada parte Hexadecimal al StringBuffer
               sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(1,3));
           }
           
           // Retorno de la cadena Encriptada
           return sb.toString();
           
       } catch (Exception e) {
           e.printStackTrace();
       }
      
       
       return null;
   }
    
}
