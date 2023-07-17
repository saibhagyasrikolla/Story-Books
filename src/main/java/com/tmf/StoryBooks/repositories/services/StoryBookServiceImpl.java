package com.tmf.StoryBooks.repositories.services;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tmf.StoryBooks.entities.StoryBook;
import com.tmf.StoryBooks.repositories.StoryBookRepository;

@Service
public class StoryBookServiceImpl implements StoryBookService {
	
	@Autowired
	private StoryBookRepository repository;
	
	@Override
	public StoryBook addStoryBook(StoryBook book) {
		// TODO Auto-generated method stub
		return repository.save(book);
	}

	@Override
	public List<StoryBook> getStroyBooks() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public StoryBook getStoryBookById(long bookId) {
		// TODO Auto-generated method stub
		return repository.findById(bookId).get();
	}

	@Override
	public List<StoryBook> getStoryBooksByAuthor(String author) {
		// TODO Auto-generated method stub
		return repository.findByAuthor(author);
	}

	@Override
	public List<StoryBook> getStoryBookByTitle(String title) {
		// TODO Auto-generated method stub
		return repository.findByTitle(title);
	}

	@Override
	public StoryBook updateStroyBook(long bookId, StoryBook book) {
		// TODO Auto-generated method stub
		StoryBook storybook = repository.findById(bookId).get();
		if(Objects.nonNull(book.getAuthor()) && !"".equalsIgnoreCase(null)) {
			storybook.setAuthor(book.getAuthor());
		}
		if(Objects.nonNull(book.getTitle()) && !"".equalsIgnoreCase(null)) {
			storybook.setTitle(book.getTitle());
		}
		if(Objects.nonNull(book.getPrice()) && !"".equalsIgnoreCase(null)) {
			storybook.setPrice(book.getPrice());
		}
		return storybook;
	}

	@Override
	public void deleteStroyBook(long bookId) {
		StoryBook storybook = repository.findById(bookId).get();
		repository.delete(storybook);
		// TODO Auto-generated method stub

	}

}
