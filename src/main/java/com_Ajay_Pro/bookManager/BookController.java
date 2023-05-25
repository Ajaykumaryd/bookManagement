package com_Ajay_Pro.bookManager;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController //it helps springboot that all apis are inside the particular class where rest is being written
                // shows are APIs are
public class BookController {
    Map <Integer,Book> bookData=new HashMap<>();
    //book created
    @PostMapping("/add-new-book")  //api call        //Postmapping above the method it is using
    public String addBook(@RequestBody Book book){    //request body before input variable
     return "book added with id"+book.getId();
    }
}
