package com.api.bookstockmanager.dtos;

import jakarta.validation.constraints.NotBlank;

public class BookstockManageDto {

    @NotBlank
    private String booksName;

    @NotBlank
    private String authorsName;

    @NotBlank
    private String publisher;

    @NotBlank
    private String responsibleName;

    @NotBlank
    private String responsibleAddress;

    public String getBooksName() {
        return booksName;
    }

    public void setBooksName(String booksName) {
        this.booksName = booksName;
    }

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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

    public void setResponsibleAddress(String responsibleAddress) {
        this.responsibleAddress = responsibleAddress;
    }
}

//
//    @NotNull
//    private Integer stockQuantities;