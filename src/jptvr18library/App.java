package jptvr18library;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Scanner;
import myclasses.BookProvider;
import myclasses.HistoryProvider;
import myclasses.ReaderProvider;
import storage.SaverToStorage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Melnikov
 */
public class App {
    
private ArrayList<Book> books = new ArrayList<>();
private ArrayList<Reader> readers = new ArrayList<>();
private ArrayList<History> histories = new ArrayList<>();
SaverToStorage saverToStorage;
    public App() {
        this.saverToStorage = new SaverToStorage();
        this.books.addAll(saverToStorage.loadBooks());
        this.readers.addAll(saverToStorage.loadReaders());
        this.histories.addAll(saverToStorage.loadHistories());
    }

    public void run() {
        System.out.println("Консольная библиотека");
        boolean repeat = true;
        do {
            System.out.println("0. Выход из программы");
            System.out.println("1. Новая книга");
            System.out.println("2. Список книг");
            System.out.println("3. Новый читатель");
            System.out.println("4. Выдать книгу");
            System.out.println("5. Вернуть книгу");
            System.out.println("6. Список выданных книг");
            System.out.println("7. Список читателей");
            System.out.println("Выберите задачу: ");
            repeat = true;
            Scanner scanner = new Scanner(System.in);
            int task = scanner.nextInt();
            switch (task) {
                case 0:
                    System.out.println("Закрытие программы");
                    repeat = false;
                    break;
            //Новая книга
                case 1:
                    BookProvider bookProvider = new BookProvider();
                    books.add(bookProvider.createBook());
                    saverToStorage.saveBooks(books);
                    break;
            //Список книг
                case 2:
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println(books.get(i).toString());
                    }
                    break;
            //Новый читатель
                case 3:
            //Выдать книгу
                    ReaderProvider readerProvider = new ReaderProvider();
                    readers.add(readerProvider.createReader());
                    saverToStorage.saveReaders(readers);
                    break;
                case 4:
                    HistoryProvider historyProvider = new HistoryProvider();
                    histories.add(historyProvider.takeOnBook(books, readers));
                    saverToStorage.saveHistories(histories);
                    break;
            //Вернуть книгу
                case 5:
                    historyProvider = new HistoryProvider();
                    historyProvider.returnBook(histories);
                    saverToStorage.saveHistories(histories);
                    break;
                case 6:
                    History history = null;
                    for (int i = 0; i < histories.size(); i++) {
                        history = histories.get(i);
                        System.out.printf("Читатель %s %s читает %s%n1",
                            history.getReader().getName(),
                            history.getReader().getSurname(),
                            history.getBook().getName()
                            );
                    }
                    break;
                case 7:
                    for (int i = 0; i < readers.size(); i++) {
                        System.out.println(readers.get(i).toString());
                    }
                    break;    
                default:
                    System.out.println("Выберите задачу из списка!");
                    break;
            }
        } while (repeat);
    }
}
