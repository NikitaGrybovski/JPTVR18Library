/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18library;

import entity.Book;
import java.util.Scanner;
import myclasses.BookProvider;

/**
 *
 * @author pupil
 */
public class App {
private Book book;
    public void run(){
        System.out.println("Консольная библиотека");
        
        OUTER:
        do {
            System.out.println("0. Выход из программы");
            System.out.println("1. Новая книга");
            System.out.println("2. Список книг");
            System.out.println("3. Зарегистрировать читателя");
            System.out.println("4. Выдать книгу");
            System.out.println("5. Вернуть книгу");
            System.out.println("Выбериите задачу: ");
            Scanner scanner =  new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Закрытие программы");
                    break OUTER;
            //new book
                case 1:
                    BookProvider bookProvider = new BookProvider();
                    book = bookProvider.createBook();
                    break;
            //list of books
                case 2:
                    break;
            //register new Reader
                case 3:
                    break;
            //give a book
                case 4:
                    break;
            //return a book
                case 5:
                    break;
                default:
                    System.out.println("Такой задачи нет!");
                    break;
            }
        } while (true);
        
    }
    
}
