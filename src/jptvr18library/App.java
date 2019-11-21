/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jptvr18library;

import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class App {
    public void run(){
        System.out.println("Консольная библиотека");
        
        do{
            System.out.println("0. Выход из программы");
            System.out.println("1. Новая книга");
            System.out.println("2. Список книг");
            System.out.println("3. Зарегистрировать читателя");
            System.out.println("4. Выдать книгу");
            System.out.println("5. Вернуть книгу");
            System.out.println("Выбериите задачу: ");
            Scanner scanner =  new Scanner(System.in);
            int task = scanner.nextInt();
            if(0 == task){
                System.out.println("Закрытие программы");
                break;
            }
            else if (1 == task){
                //new book
            }else if(2 == task){
                //list of books

            }else if(3 == task){
                //register new Reader
            }else if(4 == task){
                //give a book
            }else if(5 == task){
                //return a book
            }else{
                System.out.println("Такой задачи нет!");
            }
        }while(true);
        
        
//        Book book = new Book();
//        book.setName("Travelling Java Coffee");
//        book.setAuthor("JVM");
//        book.setIsbn("542-4635");
//        book.setPublishedyear(1991);
//        System.out.println(book.toString());
//        
//        Reader reader = new Reader();
//        reader.setName("Petja");
//        reader.setPhone("3725350213");
//        reader.setSurname("Ivanov");
//        reader.setDay(5);
//        reader.setMonth(1);
//        reader.setYear(2001);
//        System.out.println(reader.toString());
//        
//        History history = new History(new Date(),null,book,reader);
//        System.out.println(history.toString());
//        history.setReturnOfDate(new Date());
//        System.out.println(history.toString());
        
    }
    
}
