package com_Ajay_Pro.bookManager;

import java.util.HashMap;
import java.util.Map;
public class BookController {

    Map <Integer,Book> bookData=new HashMap<>();


    //book created
    public String addBook(Book book){
     bookData.put(book.getId(), book) ;
     return "book added";
    }
}
