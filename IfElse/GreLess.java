package IfElse;

import java.util.Scanner;

public class GreLess {

    
    public static void main(String args[]){

        Scanner sc =new Scanner(System.in);
      
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
    
      

        if(x==y && y==z){
            System.out.println("ye  number  equal  hea ");

        }if (x>y && x>z){
            System.out.println("   x bada hea ");

         }if(y>x && y>z){
            System.out.println("y bada hea");
         }if( z>x&& z>y){
            System.out.println("z bada hea");
         }
         else{
            System.out.println("kuchh to gad bad hea");
         }
        
    
}
}