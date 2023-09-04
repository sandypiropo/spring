package com.api.bookstockmanager.services;

import com.api.bookstockmanager.models.BookstockModel;
import com.api.bookstockmanager.repositories.BookstockManageRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BookstockManageService {

// Injection point
    final BookstockManageRepository bookstockManageRepository;

    public BookstockManageService(BookstockManageRepository bookstockManageRepository) {
        this.bookstockManageRepository = bookstockManageRepository;
    }

    @Transactional
    public BookstockModel save(BookstockModel bookstockModel) {
        return bookstockManageRepository.save(bookstockModel);
    }

//    public boolean //existisby?? (String booksName) {
//        return
}
