/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Book;
import entity.History;
import entity.Reader;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author pupil
 */
public class HistoryProvider {
    public History takeOnBook(ArrayList<Book> books,ArrayList<Reader> readers){
        History history = new History();
        
        
        
        
        
        return history;
    }
    public History returnBook(History history){
        history.setReturnOfDate(new Date());
        return history;
    }
 }

