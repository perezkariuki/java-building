/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package building;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Building {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] bname ={"simba","ndovu","Kiboko","chui","twiga"};
        int[] bfloorn ={3,4,5,8,7};
        int[] broomf ={2,4,3,2,3};
        String[] bcolor ={"pink","green","red","blue","black"};
        
        System.out.println("-----Start of Report---------");
       //print stored details;
       for(int i=0;i<5;i++)
       System.out.println(bname[i]+" is a "+bcolor[i]+" and has "+bfloorn[i]+" rooms ");
       System.out.println("-----End of Report----------");
       
       
        // TODO code application logic here
    }
    
}
