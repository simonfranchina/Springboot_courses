package my.projects.springbootstarter.course;

import my.projects.springbootstarter.topic.Topic;
import my.projects.springbootstarter.topic.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourses() {
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll()
                .forEach( courses::add );
        return courses;
    }

    public Course getCourse( String id ) {
        return courseRepository.findById( id ).get();
    }

    public void addCourse( Course course ) {
        courseRepository.save( course );
    }

    public void updateCourse( Course course ) {
        courseRepository.save( course );
    }

    public void deleteCourse( String id ) {
        courseRepository.deleteById( id );
    }
}
