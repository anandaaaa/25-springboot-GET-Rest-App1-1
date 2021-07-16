package in.anand.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.anand.response.Book;

@RestController
public class BookRestController {
	
	@GetMapping("/book")
	public Book getBook()
	{
		Book book = new Book(101,"spring",550.50);
		return book;
	}
	

}
