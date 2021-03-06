package org.learn.SprinBootStarter.topics;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topics")
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@GetMapping("/")
	public List<Topic> getAlltopics() {
		return topicService.getAllTopicsService();
	}

	@GetMapping("/{id}")
	public Optional<Topic> getTopic(@PathVariable String id) {
		return topicService.getTopicService(id);
	}
	
	@PostMapping( "/add")
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopicService(topic);		
	}
	
	@PutMapping( value = "/edit/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopicService(id,topic);		
	}
	
	@DeleteMapping( value = "/delete/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopicService(id);		
	}
}
