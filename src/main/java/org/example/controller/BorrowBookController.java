package org.example.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.BorrowBookEntity;
import org.example.model.BorrowBook;
import org.example.service.BorrowService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class BorrowBookController {
    final BorrowService borrowService;
    @PostMapping("/add-borrow-details")
    public void addBorrowDetails(@RequestBody BorrowBook borrowBook){
        borrowService.saveDetails(borrowBook);
        log.info(borrowBook.toString());
    }
    @GetMapping("/get-all")
    public List<BorrowBookEntity> getAll(){
        return borrowService.getAll();
    }
}
