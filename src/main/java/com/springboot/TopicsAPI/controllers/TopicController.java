package com.springboot.TopicsAPI.controllers;

import com.springboot.TopicsAPI.dao.Topic;
import com.springboot.TopicsAPI.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping(method = RequestMethod.GET, value = "/topics")
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/topics/{id}")
    public Optional<Topic> getTopicbyID(@PathVariable String id) {
        return topicService.getbyTopicID( id );
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody Topic topic) {
        topicService.addTopic( topic );

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics{id}")
    public void updateTopic(@PathVariable String id, @RequestBody Topic topic) {
        topicService.updateTopic( id, topic );

    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics")
    public void deleteTopic(@RequestBody String id) {
        topicService.deleteTopic( id );

    }

}
