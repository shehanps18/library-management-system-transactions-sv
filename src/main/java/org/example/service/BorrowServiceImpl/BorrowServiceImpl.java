package org.example.service.BorrowServiceImpl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.example.entity.BorrowBookEntity;
import org.example.model.BorrowBook;
import org.example.repository.BorrowBookRepository;
import org.example.service.BorrowService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
@Slf4j
public class BorrowServiceImpl implements BorrowService {
    final BorrowBookRepository repository;
    final ModelMapper mapper;
    @Override
    public void saveDetails(BorrowBook borrowBook) {
        repository.save(mapper.map(borrowBook,BorrowBookEntity.class));

    }

    @Override
    public List<BorrowBookEntity> getAll() {
        return repository.findAll();
    }
}
