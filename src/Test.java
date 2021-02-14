/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jatin
 * 
 * 
 * 
 */

import java.io.*;
public class Test {
    
    public static void m1(){
        m2();
    } 
    public static void m2(){
        m1();
    }
    
    
    Test(){
        this(10);
        System.out.println("no - arg");
        
    }
    Test(int i){
        
                System.out.println("int");

    }
    Test(double d){
        
                System.out.println("double");

    }
    
    public static void main(String[] args)throws IOException{
        int i = 010;
        int j=  07;
        System.out.println(i);
                System.out.println(j);

     Test t = new Test();
     Test.m1();
     try(FileReader f = new FileReader("abc.txt") ){
         
     }
     catch(NullPointerException|IOException e){
         
     }
         // Test t1 = new Test(10);

            //   Test t2 = new Test(10.5);

    }
}
