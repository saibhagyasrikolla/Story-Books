package com.tmf.StoryBooks.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tmf.StoryBooks.entities.StoryBook;

@Repository
public interface StoryBookRepository extends JpaRepository<StoryBook, Long>{
	List<StoryBook> findByAuthor(String author);
	List<StoryBook> findByTitle(String title);

}
