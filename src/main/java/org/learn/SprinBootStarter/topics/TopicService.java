package org.learn.SprinBootStarter.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository  topicRepository;
	
	/*private List<Topic> topics = new ArrayList<Topic>( Arrays.asList(
			new Topic("spring","Spring Framwork 3","Spring Framework Desc"),
			new Topic("java","Core Java 2","Core Java Desc"),
			new Topic("js","Java Script 2","Java Script Desc")	
		));*/
	
	public List<Topic> getAllTopicsService() {
		List<Topic> topicList = new ArrayList<Topic>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
		
		//return topics;
	}
	
	public Optional<Topic> getTopicService(String id) {
	// return	topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	//	return 	(Topic)topicRepository.findById(id);
	 
	 return topicRepository.findById(id);
		
	}

	public void addTopicService(Topic topic) {
		topicRepository.save(topic);
		
	}

	public void updateTopicService(String id, Topic topic) {
		/*for(int i = 0; i<topics.size(); i++) {
			Topic t = topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}*/
		
		topicRepository.save(topic);
		
	}

	public void deleteTopicService(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		
		topicRepository.deleteById(id);
		
	}

}
