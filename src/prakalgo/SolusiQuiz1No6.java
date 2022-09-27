/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prakalgo;

/**
 *
 * @author Cent
 */
public class SolusiQuiz1No6 {
    public static void main(String[] args) {
        int number = 9;
        char ch = '*';
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number; j++) {
                System.out.print(ch);
                if(ch == '*'){
                    ch = ' ';
                }else{
                    ch = '*';
                }
            }
            System.out.println("");
        }
    }
}
