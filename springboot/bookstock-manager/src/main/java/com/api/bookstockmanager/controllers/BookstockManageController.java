package com.api.bookstockmanager.controllers;

import com.api.bookstockmanager.dtos.BookstockManageDto;
import com.api.bookstockmanager.models.BookstockModel;
import com.api.bookstockmanager.services.BookstockManageService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/book-stock")
public class BookstockManageController {

    // Service injection via constructor
    final BookstockManageService bookstockManageService;

    public BookstockManageController(BookstockManageService bookstockManageService) {
        this.bookstockManageService = bookstockManageService;
    }

    @PostMapping
    public ResponseEntity<Object> saveBookstock(@RequestBody @Valid BookstockManageDto bookstockManageDto) {
//       if(bookstockManageService.bookBorrowed(bookstockManageDto.getBooksName())); {
//            ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: The Book is been borrowed");
//        }
//        if(bookstockManageService.personReading(bookstockManageDto.getResponsibleName())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: User is already borrowing a book");
//        }
//        if(bookstockManageService.existsAddress(bookstockManageDto.getResponsibleAddress())){
//            return ResponseEntity.status(HttpStatus.CONFLICT).body("Conflict: address already registered");
//        }

        var bookstockModel = new BookstockModel();
        BeanUtils.copyProperties(bookstockManageDto, bookstockModel);
        bookstockModel.setLoanDate(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(bookstockManageService.save(bookstockModel));
    }
}
