/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class Jurnal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n1=1,n2=1,n3,i;    
        int hasil=n1+n2;
        System.out.println("Masukkan Inputan : ");
        int count=sc.nextInt();
       
       for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
        {    
            n3=n1+n2;    
            hasil+=n3;    
            n1=n2;    
            n2=n3;    
        }   
         System.out.print(hasil);
    }
    
}
