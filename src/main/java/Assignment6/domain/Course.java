package Assignment6.domain;


public class Course {

    private String courseId, courseName;

    private Course(){}

    private Course(Builder builder) {
        this.courseId = builder.courseId;
        this.courseName = builder.courseName;
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Course courseName(String courseName) {
         this.courseName = courseName;
         return this;
    }

    public static class Builder{

        private String courseId, courseName;

        public Builder courseId(String courseId) {
            this.courseId = courseId;
            return this;
        }

        public Builder courseName(String courseName) {
            this.courseName = courseName;
            return this;
        }
        public Builder copy(Course course){
            this.courseId = course.courseId;
            this.courseName = course.courseName;

            return this;
        }
        public Course build() {
            return new Course(this);
        }


    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId='" + courseId + '\'' +
                ", courseName='" + courseName + '\'' +
                '}';
    }
}
