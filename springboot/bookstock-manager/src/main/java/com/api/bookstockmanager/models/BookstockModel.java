package com.api.bookstockmanager.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_BOOKSTOCK")
public class BookstockModel implements Serializable {
    private static final long BOOKS_ID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) //id será gerado automaticamente
    private UUID id;

    @Column(nullable = false, length = 70)
    private String booksName;

    @Column(nullable = false, length = 30)
    private String authorsName;

    @Column(nullable = false, length = 20)
    private String publisher;

    @Column(nullable = false)
    private LocalDateTime loanDate;

    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID responsibleId;

    @Column(nullable = false, unique = true, length = 80)
    private String responsibleName;

    @Column(nullable = false, unique = true, length = 100)
    private String responsibleAddress;


    public UUID getId () {
        return id;
    }

    public void setId (UUID id){
        this.id = id;
    }

    public String getBooksName () {
        return booksName;
    }

    public void setBooksName (String booksName){
        this.booksName = booksName;
    }

    public String getAuthorsName () {
        return authorsName;
    }

    public void setAuthorsName (String authorsName){
        this.authorsName = authorsName;
    }

    public String getPublisher () {
        return publisher;
    }

    public void setPublisher (String publisher){
        this.publisher = publisher;
    }

    public LocalDateTime getLoanDate () {
        return loanDate;
    }

    public void setLoanDate (LocalDateTime loanDate){
        this.loanDate = loanDate;
    }

    public UUID getResponsibleId() {
        return responsibleId;
    }

    public void setResponsibleId(UUID responsibleId) {
        this.responsibleId = responsibleId;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getResponsibleAddress() {
        return responsibleAddress;
    }

    public void setResponsibleEmail(String responsibleAddress) {
        this.responsibleAddress = responsibleAddress;
    }
}

//    @Column(nullable = false)
//    private int publicationYear;

//    @Column(nullable = false)  //preciso terminar
//    private int stockQuantities;

//    public int getStockQuantities () {
//        return stockQuantities;
//    }
//
//    public void setStockQuantities ( int stockQuantities){
//        this.stockQuantities = stockQuantities;
//    }
//
//    public int getPublicationYear () {
//        return publicationYear;
//    }
//
//    public void setPublicationYear ( int publicationYear){
//        this.publicationYear = publicationYear;
//    }