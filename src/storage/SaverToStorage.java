/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import entity.Book;
import entity.Reader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pupil
 */
public class SaverToStorage {
    public void saveBooks(ArrayList<Book> books){
       FileOutputStream  fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("books.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(books);
            objectOutputStream.flush();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нет файла books", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "ошибка записи", ex);
        }finally{
            if(objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибки освобождения ресурса", ex);
                }
            }
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       
    }

    public Collection<? extends Book> loadBooks() {
        ArrayList<Book> books = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("books.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            books = (ArrayList<Book>) objectInputStream.readObject();
            
            
                  
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нет такого файла", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        
        return books;
    }
    
    
    
    public void saveReaders(ArrayList<Reader> readers){
        FileOutputStream fileOutputStream = null;
        ObjectOutputStream objectOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("reader.txt");
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "не существует такой файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка записи", ex);
        }finally{
            if(fileOutputStream != null){
                try {
                    fileOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (objectOutputStream != null){
                try {
                    objectOutputStream.close();
                } catch (IOException ex) {
                    Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        
    }
    
    public Collection<? extends Reader> loadReaders() {
        ArrayList<Reader> readers = new ArrayList<>();
        FileInputStream fileInputStream = null;
        ObjectInputStream objectInputStream = null;
        try {
            fileInputStream = new FileInputStream("reader.txt");
            objectInputStream = new ObjectInputStream(fileInputStream);
            readers = (ArrayList<Reader>) objectInputStream.readObject();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Не существует файл", ex);
        } catch (IOException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Ошибка чтения", ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaverToStorage.class.getName()).log(Level.SEVERE, "Нет такого класса", ex);
        }
        
        
        
        
        return readers; 
    }
}
