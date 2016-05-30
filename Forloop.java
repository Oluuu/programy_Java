/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forloop;

/**
 *
 * @author Rader-CFC
 */
public class Forloop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] array = new int[10];
for(int i=0; i < array.length; i++){
    array[i] = (i+1)*10;
}
for(int number: array){
    System.out.print(number + ";");
}   // TODO code application logic here
    }
    
}
