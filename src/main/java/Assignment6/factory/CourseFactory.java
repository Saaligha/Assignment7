package Assignment6.factory;

import Assignment6.domain.Course;
import Assignment6.util.GenerateId;

public class CourseFactory {

    public static Course getCourse(String courseName) {
        return new Course.Builder().courseId(GenerateId.generateId())
                .courseName(courseName)
                .build();
    }
}
