package BookStore.com.Book_Store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping("/book")
    public String book(){
        return "Hello thanks for visiting";
    }
}
