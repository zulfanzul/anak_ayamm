/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anakayam;

import java.util.Scanner;

/**
 *
 * @author LABKOM1-RPL22
 */
public class Anakayam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
         System.out.println("Masukan Anak Ayam");
         a=sc.nextInt();
         
         for(b=a;b>=2;b--){
             c=b-1; 
             System.out.println("anak ayam turun"+b);
             System.out.println("mati 1");
                
             System.out.println("tinggal "+c);
         }
         System.out.println("anak ayam turun 1");
         System.out.println("mati 1");
         System.out.println("tinggal induknya");
    }
    
}
