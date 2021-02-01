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
        
        int numLeer;
        int cont=0;
        int numBuscar;
        int encontrado;
        
        do{
        System.out.println("Introduce cuantos numeros desea leer: ");
        numLeer=sc.nextInt();
        if(numLeer>10){
            System.out.println("No pueden ser mas de 10 numeros");}
        }while(numLeer>10);
        
        int numeros[]= new int[numLeer];
        
        
        for (int i = 0; i < numeros.length && cont<10; i++) {
            
                System.out.println("Anota un numero en la casilla " + (i+1));
                numeros[i]=sc.nextInt();
                cont++;
             
             for (int j = 0; j < i; j++) {
                 if(numeros[i]==numeros[j]){
                 System.out.println("Numero repetido, no valido");
                 i--;}
            }  
        }
        
        System.out.println("Introduce el numero que quiere buscar");
        numBuscar=sc.nextInt();
        encontrado=buscarNumero(numeros,numBuscar);
        if(encontrado==-1){
            System.out.println("Numero no encontrado");
        }
        else
            System.out.println("Numero " +numBuscar+ " encontrado en la casilla " +(encontrado+1));
          
        System.out.println("Los numeros leidos de menor a mayor son: ");
        Arrays.sort(numeros);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
            
        }
    }
    public static int buscarNumero(int n[], int numBuscar){
        for (int i = 0; i < n.length; i++) {
            if(n[i]==numBuscar){
            return i;
            }
            
        }
        return -1;
    }
    
    
      
    
    } 
    

