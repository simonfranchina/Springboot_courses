package my.projects.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping ( "topics/{topicId}/courses" )
    public List<Course> getCourses( ) {
        return courseService.getCourses();
    }

    @RequestMapping ( "topics/{topicId}/course/{courseId}" )
    public Course getCourse( @PathVariable ( "courseId" ) String id ) {
        return courseService.getCourse( id );
    }

    @RequestMapping ( method = RequestMethod.POST, value = "topics/{topicId}/courses" )
    public void addCourse( @RequestBody Course course ) {
        courseService.addCourse( course );
    }

    @RequestMapping ( method = RequestMethod.POST, value = "topics/{topicId}//courses" )
    public void updateCourse( @RequestBody Course course ) {
        courseService.updateCourse( course );
    }

    @RequestMapping ( method = RequestMethod.DELETE, value = "topics/{topicId}//course/{courseId}" )
    public void deleteCourse( @PathVariable ( "courseId" ) String id ) {
        courseService.deleteCourse( id );
    }

}
