package com.tmf.StoryBooks.repositories.services;

import java.util.List;

import com.tmf.StoryBooks.entities.StoryBook;

public interface StoryBookService {
	StoryBook addStoryBook(StoryBook book);
	List<StoryBook> getStroyBooks();
	StoryBook getStoryBookById(long bookId);
	List<StoryBook> getStoryBooksByAuthor(String author);
	List<StoryBook> getStoryBookByTitle(String title);
	StoryBook updateStroyBook(long bookId, StoryBook book);
	void deleteStroyBook(long bookId);
}
