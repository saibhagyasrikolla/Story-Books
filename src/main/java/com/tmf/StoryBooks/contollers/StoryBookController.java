package com.tmf.StoryBooks.contollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tmf.StoryBooks.entities.StoryBook;
import com.tmf.StoryBooks.repositories.services.StoryBookService;

@RestController
public class StoryBookController {
	@Autowired 
	private StoryBookService service;
	
	@PostMapping("/storybook")
	public StoryBook addStoryBook(@RequestBody StoryBook book) {
		return service.addStoryBook(book);
	}
	
	@GetMapping("/storybook")
	public List<StoryBook> getStoryBooks(){
		return service.getStroyBooks();
	}
	
	@GetMapping("/stroybook/{id}")
	public StoryBook getStroyBookById(@PathVariable("id") long bookId) {
		return service.getStoryBookById(bookId);
	}
	
	@GetMapping("/storybook/{author}")
	public List<StoryBook> getStoryBooksByAuthor(@PathVariable("author") String author) {
		return service.getStoryBooksByAuthor(author);
	}
	
	@GetMapping("/storybook/{title}")
	public List<StoryBook> getStroyBooksByTitle(@PathVariable("title") String title) {
		return service.getStoryBookByTitle(title);
	}
	
	@PutMapping("/storybook/{id}")
	public StoryBook updateStoryBook(@PathVariable("id") long bookId, @RequestBody StoryBook book) {
		return service.updateStroyBook(bookId, book);
		
	}
	
	@DeleteMapping("/storybook/{id}")
	public void deleteStoryBook(@PathVariable("id") long bookId) {
		service.deleteStroyBook(bookId);
	}
}
