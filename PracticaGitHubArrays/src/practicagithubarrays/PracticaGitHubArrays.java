/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithubarrays;
import java.util.*;
/**
 *
 * @author arik1
 */
public class PracticaGitHubArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc= new Scanner (System.in);
        
        int numeros[]= new int [10];
        boolean posicion;
        int numBuscar=0;
        
        
        for (int i = 0; i < numeros.length; i++) {
            
                System.out.println("Anota un numero en la casilla " + (i+1));
                numeros[i]=sc.nextInt();
             /*   posicion=buscarRepetido(numeros,numBuscar);*/
             
             for (int j = 0; j < i; j++) {
                 if(numeros[i]==numeros[j]){
                 System.out.println("Numero repetido, no valido");
                 i--;}
            }  
        }
               
          
        System.out.println("Los numeros leidos de menor a mayor son: ");
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
    }
    
    
      
    
    } 
    

