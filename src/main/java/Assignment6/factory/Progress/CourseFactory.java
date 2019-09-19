package Assignment6.factory.Progress;

import Assignment6.domain.Progress.Course;
import Assignment6.util.GenerateId;

public class CourseFactory {

    public static Course getCourse(String courseName, String courseId) {
        return new Course.Builder()
                .courseId(courseId)
                .courseName(courseName)
                .build();
    }
}
