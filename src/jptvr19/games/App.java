/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr19.games;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run (){
        System.out.println("Привет.");
        System.out.println("Программа загадала число, угадай: ");
        Random random = new Random();
        int myNumber = random.nextInt(5-0 + 1) + 0;
        Scanner scanner = new Scanner (System.in);
        int gameNumber = scanner.nextInt();
        if (myNumber == gameNumber){
            System.out.println("Ты выиграл");}
        else{
            System.out.println("Ты проиграл!"+ myNumber);}
        
    
    
    
    }
    
}
