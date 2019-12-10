/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author pupil
 */
public class SaverToBase implements Saveble {
    private EntityManager em;
    private EntityTransaction tx;
    
    public SaverToBase() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPTVR18LibraryPU");
         this.em = emf.createEntityManager();
         this.tx = em.getTransaction();
         
        
    }
    
    @Override
    public void saveBooks(ArrayList<Book> books) {
        tx.begin();
        for (int i = 0; i < books.size(); i++) {
            
            Book book = books.get(i);
            if(book.getId() == null){
                em.persist(book);
            }
            
            
            
            
        }
        tx.commit();
    }
    @Override
    public Collection<? extends Book> loadBooks(){
        return null;
    }
    @Override
    public void saveReaders(ArrayList<Reader> readers){
    
    }
    @Override
    public Collection<? extends Reader> loadReaders(){
        return null;
    }
    @Override
    public void saveHistories(ArrayList<History> histories) {
    
    }
    @Override
    public Collection<? extends History> loadHistories(){
        return null;
    }
    
}
