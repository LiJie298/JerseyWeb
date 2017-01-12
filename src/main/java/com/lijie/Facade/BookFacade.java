package com.lijie.Facade;

import com.lijie.Entity.BookEn;

import java.util.List;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
public class BookFacade extends BaseFacada {

    public BookFacade() {
    }

    public List<BookEn> getAllBooks(){
        String sql = "";
        List<Object> bookEns = this.CreatQuery(sql);
        List<BookEn> bookEns1 = null;
        for(Object book:bookEns){
            if(book!=null){
                BookEn bookEn = (BookEn) book;
                bookEns1.add(bookEn);
            }
        }
        return bookEns1;
    }
}
