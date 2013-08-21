package org.j4m0.fibonacci;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Serie Fibonacci
 * @author J4M0
 *
 */
public class Fibonacci {
    
    public static BufferedReader ent = new BufferedReader(new InputStreamReader(System.in));
    
    public int iterativo(int n, int arr[]){
        for(int i = 0; i < n; i++){
            if(i < 2){
                arr[i] = 1;
            } else {
               arr[i] = arr[i-1] + arr[i-2]; 
            }
        }
        return arr[n-1];
    }
    
    public int recursivo(int n){
         if(n < 2){
             return 1;
         } else {
             return recursivo(n-1) + recursivo(n-2);
         }
    }
    
    public static void main(String args[]) throws IOException{
        Fibonacci fibonacci = new Fibonacci();
        System.out.println("Dame el numero interacciones");
        int n = Integer.parseInt(ent.readLine());
        int arr[] = new int [n];
        System.out.println("Iterativo es:");
        long inicioIterativo, finIterativo;
        inicioIterativo = System.currentTimeMillis();
        System.out.println("F(" + n + ")=" + fibonacci.iterativo(n, arr));
        finIterativo = System.currentTimeMillis();
        System.out.println("Tiempo Iterativo es:  "+ ( finIterativo - inicioIterativo ) +" milliseconds");                
        System.out.println("Recursivo es:");              
        long inicioRecursivo, finRecursivo;
        inicioRecursivo = System.currentTimeMillis();
        System.out.println("F(" + n + ")=" + fibonacci.recursivo(n-1));
        finRecursivo = System.currentTimeMillis();
        System.out.println("Tiempo Recursivo es:  "+ ( finRecursivo - inicioRecursivo ) +" milliseconds");
    }
}