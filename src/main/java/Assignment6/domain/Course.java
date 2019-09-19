package Assignment6.domain;


import java.util.Objects;

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

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Builder)) return false;
            Builder builder = (Builder) o;
            return Objects.equals(courseId, builder.courseId) &&
                    Objects.equals(courseName, builder.courseName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(courseId, courseName);
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
