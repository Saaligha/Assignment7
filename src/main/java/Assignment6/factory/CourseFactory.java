package Assignment6.factory;

import Assignment6.domain.Course;
import Assignment6.util.GenerateId;

public class CourseFactory {

    public static Course getCourse(String courseName, String courseId) {
        return new Course.Builder().courseId(GenerateId.generateId())
                .courseId(courseId)
                .courseName(courseName)
                .build();
    }
}
