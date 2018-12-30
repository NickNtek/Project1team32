package group32project.hua.dit.dao;

import java.util.List;

import group32project.hua.dit.entities.Publisher;

public interface PublisherDAO {
	public List<Publisher> getPublishers();

	public List<Publisher> getPublisher(int id);
}
