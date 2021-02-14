/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GarbageCollector;
import java.util.*;
/**
 *
 * @author jatin
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        
       Runtime r = Runtime.getRuntime();
                long bytes = r.totalMemory();
                double kb = bytes/1024;
                double mb = kb/1024;
                double gb = mb/1024;
                 System.out.println(kb+"kb");
                 System.out.println(mb+"mb");
                 System.out.println(gb+"gb");

               System.out.println(r.totalMemory()/1024*1024);

        System.out.println(getSize(r.totalMemory()));
        
                       System.out.println("Free memory "+r.freeMemory());
                       for(int i=0;i<1000;i++){
                           Date d = new Date();
                           //d=null;
                       }
                        System.out.println("Free memory "+r.freeMemory());

    }
    public static String getSize(long size) {
        long n = 1024;
        String s = "";
        double kb = size / n;
        double mb = kb / n;
        double gb = mb / n;
        double tb = gb / n;
        if(size < n) {
            s = size + " Bytes";
        } else if(size >= n && size < (n * n)) {
            s =  String.format("%.2f", kb) + " KB";
        } else if(size >= (n * n) && size < (n * n * n)) {
            s = String.format("%.2f", mb) + " MB";
        } else if(size >= (n * n * n) && size < (n * n * n * n)) {
            s = String.format("%.2f", gb) + " GB";
        } else if(size >= (n * n * n * n)) {
            s = String.format("%.2f", tb) + " TB";
        }
        return s;
    }
}
