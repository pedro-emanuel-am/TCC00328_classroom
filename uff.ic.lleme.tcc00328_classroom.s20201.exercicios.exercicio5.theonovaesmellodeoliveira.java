/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;
import java.util.Scanner;
/**
 *
 * @author theo
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a, b, contador, n;
        a = 0; b = 0; contador = 1;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Este programa calcula o enésimo termo de uma sequencia de fibonacci. \n insira o valor de n: \n");
        n = myObj.nextInt();
        while(contador < n){
            if(contador == 1){
                a = 1;
            }else{
                a +=b;
                b = a-b;
            }
            contador +=1;
        };
        System.out.printf("O %dº termo da sequência é %d\n", n, a);
    }
    
}
