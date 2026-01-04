package Array;

import java.util.*;

public class Array {
    public static void main(String args[]){
    //    int[] mark= new int [100];
    // int mark[]=new int[100];
    // int mark[]={98,97,96,89,96,95};

    // mark[0]=97; //phy
    // mark[1]=98; //chem
    // mark[2]=96; ///eng
    Scanner sc = new Scanner(System.in);

    int size =sc.nextInt();

    int number []= new int [size];
    //  input 
    for(int i=0; i<size;i++){
        number[i] = sc.nextInt();
    }
    //  output 

    for(int i=0; i<size; i++){
        System.out.println(number[i]);
    }


    // System.out.println(mark[0]);
    // System.out.println(mark[1]);
    // System.out.println(mark[2]);
       


}
    
}
