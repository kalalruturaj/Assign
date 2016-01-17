/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ruturaj
 */
public class Assign1Test {
    
    public Assign1Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
     @Test 
     public void testLessThanOneShouldReturnNull(){
         System.out.println("testLessThanOneShouldReturnNull");
       String s = "";
        int i = 0;
        if(i<1){
           
        String expResult = null;
        String result = Assign1.stringPower(s, i);
       
        assertEquals(expResult, result);
         
        } 
     }
         @Test
        public void testEmptyStringShouldReturnEmptyString() {
        System.out.println("testEmptyStringShouldReturnEmptyString");
        String str = "";
        int i = 2;
        String expResult = "";
        String result = Assign1.stringPower(str, i);
        assertEquals(expResult, result);
    }
        @Test
       public void testStringAndTwoShouldReturnStringDoubled(){
            System.out.println("testStringAndTwoShouldReturnStringDoubled");
        String str = "bob";
        int i = 2;
        String expResult = "bobbob";
        String result = Assign1.stringPower(str, i);
        assertEquals(expResult, result);
       } 
       
       @Test 
       public void testStringAndOneShouldReturnString(){
           System.out.println("testStringAndOneShouldReturnString");
        String str = "bob";
        int i = 1;
        String expResult = "bob";
        String result = Assign1.stringPower(str, i);
        assertEquals(expResult, result);
       }
      @Test
      public void findRandom(){
           System.out.println("findRandom");
           int i = 5;
           int arr[]={1,2,3,4,5,6,7,8,9,0};
           for(int j=0;j<arr.length;j++){
               if(arr[j]==i){
                    String str = "bob";
                    String expResult = "bobbobbobbobbob";
                    String result = Assign1.stringPower(str, i);
                    assertEquals(expResult, result);
                    System.out.println("Select from random number: \n"+result);
               }
           }
       
      }

}
