package my.projects.springbootstarter.topic;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping ( "/topics" )
    public List<Topic> getTopics() {
        return topicService.getTopics();
    }

    @RequestMapping ( "/topic/{topicId}" )
    public Topic getTopic( @PathVariable ( "topicId" ) String id ) {
        return topicService.getTopic( id );
    }

    @RequestMapping ( method = RequestMethod.POST, value = "/topics" )
    public void addTopic( @RequestBody Topic topic ) {
        topicService.addTopic( topic );
    }

    @RequestMapping ( method = RequestMethod.POST, value = "/topics" )
    public void updateTopic( @RequestBody Topic topic ) {
        topicService.updateTopic( topic );
    }

    @RequestMapping ( method = RequestMethod.DELETE, value = "/topic/{topicId}" )
    public void deleteTopic( @PathVariable ( "topicId" ) String id ) {
        topicService.deleteTopic( id );
    }

}
