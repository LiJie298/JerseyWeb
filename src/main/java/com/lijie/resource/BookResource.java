package com.lijie.resource;

import com.lijie.Entity.BookEn;
import com.lijie.Facade.BookFacade;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Administrator on 2017/1/6 0006.
 */
@Path("/resource-book")
public class BookResource {

    private BookFacade bookFacade;

    public BookResource() {
    }
    @Inject
    public BookResource(BookFacade bookFacade) {
        this.bookFacade = bookFacade;
    }

    @Path("/get-all-books")
    @Consumes(MediaType.APPLICATION_JSON)
    @GET
    public List<BookEn> getAllBooks(){
      return   bookFacade.getAllBooks();
    }
}
