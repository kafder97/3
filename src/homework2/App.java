/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;

import java.util.Scanner;

/**
 *
 * @author Jegor Bakunin
 */
class App {
    Scanner input = new Scanner(System.in);
    public void run() {
        input.nextLine();
        System.out.println("Введите трёхзначное число: ");
        int number = input.nextInt();
        int x1 = number / 100;
        int x2 = (number % 100) / 10;
        int x3 = number % 10;
        System.out.println("Сумма числа: " + (x1+x2+x3) + "\nЧисло единиц: " + x3 + "\nЧисло десятков: " + x2);
    }
    
}
