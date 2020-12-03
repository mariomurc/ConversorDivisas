/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package conversordivisas;

import java.util.Scanner;

/**
 *
 * @author Jozzelu
 */
public class ConversorDivisas {
    
    public static float convertirLibras(float euros){
        float libras=1.2F;
        libras=(euros*libras);
        return libras;
    }
    
    public static float convertirDolares(float euros){
        float dolares=1.3F;
        dolares=(euros*dolares);
        return dolares;
    }
    
    public static float convertirYenes(float euros){
        float yenes=0.89F;
        yenes=(euros*yenes);
        return yenes;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String divisa="";
        float euros=0F;
        String libras="libras";
        String dolares="dolares";
        String yenes="yenes";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número de euros");
        euros = teclado.nextFloat();
        System.out.println("Introduce la divisa a la que quieres hacer la conversión (libras, dolares o yenes)");
        divisa=teclado.next();
        divisa=divisa.toLowerCase();        
        
        if(divisa.equals(libras)){
            System.out.println("El cambio de "+euros+"€ a libras es de "+convertirLibras(euros)+"£");}
        else if(divisa.equals(dolares)){
            System.out.println("El cambio de "+euros+"€ a dolares es de "+convertirDolares(euros)+"$");}
        else if(divisa.equals(yenes)){
            System.out.println("El cambio de "+euros+"€ a yenes es de "+convertirYenes(euros)+"¥");}
        else {
            System.out.println("Lo siento, pero este programa no hace ese tipo de cambio");
        }
    }
}
