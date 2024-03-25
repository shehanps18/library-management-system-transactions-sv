package org.example.service;

import org.example.entity.BorrowBookEntity;
import org.example.model.BorrowBook;

import java.util.List;

public interface BorrowService {
    void saveDetails(BorrowBook borrowBook);
    List<BorrowBookEntity> getAll();
}
