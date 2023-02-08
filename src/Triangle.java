/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author acha.marie
 */
public class Triangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int row = 10;
        
        System.out.println("Triangle Printing Program\n");
        
        //to print the first triangle
        System.out.println("(a)");
        for(int i = 0; i < row; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //to print the second triangle (b)
        System.out.println("(b)");
        for(int i = row - 1; i >= 0; i--){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //to print the third triangle (c)
        System.out.println("(c)");
        for(int i = row; i >= 1; i--){
            for(int j = row; j > i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        //to print the fourth triangle (d)
        System.out.println("(d)");
        for(int i = 0; i < row; i++){
            for(int j= 1 * (row - i); j > 0; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
