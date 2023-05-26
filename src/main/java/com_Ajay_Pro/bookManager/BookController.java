package com_Ajay_Pro.bookManager;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController //it helps springboot that all apis are inside the particular class where rest is being written
                // shows are APIs are
public class BookController {
    Map <Integer,Book> bookData=new HashMap<>();  //Integer are keys because they are unique
    //book created
    @PostMapping("/add-new-book")  //api call        //Postmapping above the method it is using
    public String addBook(@RequestBody Book book){    //request body before input variable
        bookData.put(book.getId(),book);
        return "book added with id "+book.getId();
    }


    @GetMapping("/get-book") //google.com/search?q=yes_bank   localhost:8080//get-book?id=1
    public Book getBook(@RequestParam Integer id){    //For String= @RequestParam String q

        return bookData.get(id);
    }

    @GetMapping("/get-list-books")
    public List<Book> getBooks(){

        return new ArrayList<>(bookData.values());
    }





}

