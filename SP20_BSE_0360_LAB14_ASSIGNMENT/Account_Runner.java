/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SP20_BSE_0360_LAB14_ASSIGNMENT;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author Rehman Computer
 */
public class Account_Runner {
   
   public static void main(String[] args) throws FileNotFoundException, IOException {
     Account [] array= new Account[10];
     array[0]= new Account("1234",4000);
     array[0].deposit("1234");
     array[0].withdraw("1234");
     array[0].transfer("1234", array[0]);
     array[0].balanceInquiry("1234");
     array[1]= new Account("123",4000);
     array[1].deposit("123");
     array[1].deposit("123");
     array[1].transfer("123", array[0]);
     

     
     try{
    
         ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream("Account.bin")); 
             file.writeObject(array);
         
     }
     catch(IOException e){
         System.out.println("Error writing the file");
         System.exit(0);
     }
       System.out.println("Array written to the file");
       System.out.println("now let's reopen the file and dsiplay content");
        Account B[]=null;
       try{
         ObjectInputStream inputfile = new ObjectInputStream(new FileInputStream("Account"));
             B=(Account[])inputfile.readObject();
         }
     
     catch(ClassNotFoundException e){
         System.out.println("can not find he file");
         System.exit(0);
     }
       catch(IOException e){
         System.out.println("problem with file input");
         System.exit(0);
     }
       System.out.println("The following reading from file");
       int i;
       for( i=0;i<B.length;i++){
           System.out.println(B[i]);
           System.out.println("end of program");
           
       }
   }
       
   }

     
