package com.sus.Rep;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sus.Entity.Book;


public interface BookRep extends JpaRepository<Book, Long> {
}