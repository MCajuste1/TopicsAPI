package com.springboot.TopicsAPI.service;


import com.springboot.TopicsAPI.dao.Topic;
import com.springboot.TopicsAPI.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    @Autowired
     private TopicService topicService;
//
//    List<Topic> topics = new ArrayList<>( Arrays.asList(
//            new Topic( "spring", "spring framework ", "spring framework description" ),
//            new Topic( "java", "Core Java ", "Core Java description" ),
//            new Topic( "angular", "Angualar 8", "Angualar 8 description" )



    //Get all topics
    public List<Topic> getAllTopics() {
        List<Topic> listOfTopics = new ArrayList<>(  );
        topicRepository.findAll().forEach( listOfTopics::add );
        return listOfTopics;
    }

    //Get a Topic by ID
    public Optional<Topic> getbyTopicID(String id) {
//        for (int x = 0; x < topics.size(); x++) {
//            if (topics.get( x ).getId().equals( id )) {
//
//                return topics.get( x );
//            }
//        }
        return topicRepository.findById( id );

        //loop through the Topics
        //inside the loop check to see if the Topic has that iD

        //return that topic if id matches

    }

    public void  addTopic(Topic topic) {
      topicRepository.save( topic );

    }

    public void updateTopic(String id, Topic topic) {
//        for (int x = 0; x < topics.size(); x++){
//            if(topics.get( x ).getId().equals( id )){
//                topics.set( x,topic );
//                return;

        topicRepository.save( topic );
//
            }


        public void deleteTopic(String id){
//        for(int x = 0; x < topics.size(); x++){
//            if(topics.get( x ).getId().equals( topic.getId())){
//                topics.remove( x );
//            }
//        }

            topicRepository.deleteById( id );
        }
    }





