package com.api.bookstockmanager.repositories;

import com.api.bookstockmanager.models.BookstockModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BookstockManageRepository extends JpaRepository<BookstockModel, UUID> {

}
