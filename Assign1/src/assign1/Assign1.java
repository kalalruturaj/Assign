/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

/**
 *
 * @author Ruturaj
 */
public class Assign1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(stringPower("Java", 4));
    }
    public static String stringPower(String str ,int i){
        String str2 ="";
        
             if(str==""){
            System.out.println("Empty String");
            str2 = str;
        } 
        
             if(i<1){
            str2= null;
        }  
            if(i==1){
            return str;
           
        }
             
        for(int j=0;j<i;j++){
            
           str2=str2.concat(str);
            
        }
         
         return str2;
    }
    
}
