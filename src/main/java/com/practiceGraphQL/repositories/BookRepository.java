package com.practiceGraphQL.repositories;

import com.practiceGraphQL.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
