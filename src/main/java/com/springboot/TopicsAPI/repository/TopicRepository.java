package com.springboot.TopicsAPI.repository;

import com.springboot.TopicsAPI.dao.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {


}
