/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author Victor Olave
 */
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        //Numeros para ordenar
        int numeros [] = {10,9,8,7,6,5,4,3,2,1};
        
        //Llamada Metodo de Ordenamiento QuickSort
        Quicksort(numeros, 0, numeros.length -1);
        
        //Metodo para imprimir Vector Ordenado
         ImprimirVector(numeros);
    }
    
    //Metodo de Ordenamiento QuickSort
    public static void Quicksort(int numeros[], int izq, int der)
    {
            /*Este metodo recibe un arreglo de numero, y dos enteros que referencian el primer valor
            Y el ultimo*/
        
            //Se toma como pivote el primer valor
            int pivote = numeros[izq];
            
            //Se definen los dos lados y un auxiliar
            int i = izq; 
            int j = der; 
            int aux;
           
            while(i<j)
            {
               while (numeros[i] <= pivote && i < j) 
                  i++;

               while (numeros[j] > pivote) 
                  j--;   

               if (i<j) 
               {                                     
                   aux = numeros[i];                  
                   numeros[i]= numeros[j];
                   numeros[j]=aux;
               }
            }

             numeros[izq] = numeros[j]; 
             numeros[j] = pivote;

             if (izq < j-1)
                Quicksort(numeros,izq,j-1);

             if (j+1 < der)
                Quicksort(numeros,j+1,der);
      }
    
    public static void ImprimirVector(int arreglo[])
    {
        for(int i = 0; i < arreglo.length; i++)
        {
            System.out.println(arreglo[i]);
        }
    }
            
}
