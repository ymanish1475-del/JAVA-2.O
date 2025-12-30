package IfElse;

import java.util.Scanner;

public class EqGreLess {

    
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
        // System.out.println("enter x = ");
        int x = sc.nextInt();
        //  System.out.println("enter y = ");
        int y = sc.nextInt();

        if(x==y){
            System.out.println("ye  number  equal  hea ");
        }if (x>y){
            System.out.println(" x bada hea ");
        

         }if(y>x){
            System.out.println("y bada hea");
         }
        //  else{
        //     System.out.println("y bada hea");
        //  }
    
}
}
