package group32project.hua.dit.dao;

import java.util.List;

import group32project.hua.dit.entities.Book;

public interface BookDAO {
	public List<Book> getBooks(String HQLCommand);
	
	public int updateBook(String tableName, int id, int newValue);
	
}
