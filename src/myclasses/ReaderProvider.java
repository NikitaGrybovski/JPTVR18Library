/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Reader;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ReaderProvider {
    public Reader createReader(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("----Регистрация пользователя----");
        System.out.println("Имя ");
        String name = scanner.nextLine();
        System.out.println("Фамилия");
        String surname = scanner.nextLine();
        System.out.println("День");
        int day = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Месяц");
        int month = scanner.nextInt();
        scanner.nextLine();
        System.out.println("год");
        int year = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Телефон");
        String phone = scanner.nextLine();
        
        Reader reader = new Reader(name, surname, day, month, year, phone);
        
        return reader;
    
    }
}
