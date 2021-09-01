package org.learn.SprinBootStarter.topics;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
	
	//public Optional<Topic> findById(String Id);

}
