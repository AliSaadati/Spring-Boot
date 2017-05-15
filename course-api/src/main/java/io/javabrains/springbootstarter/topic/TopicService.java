package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	private List<Topic> topics = Arrays.asList(
			new Topic("JS", "JavaScript", "JavaScript Programming"),
			new Topic("Java", "Java", "Java Programming"),
			new Topic("Python", "Python", "Python Programming"),
			new Topic("TS", "TypeScript", "TypeScript Programming")
			);
	
	public List<Topic> getAllTopics() {
		return topics;
	}
}
