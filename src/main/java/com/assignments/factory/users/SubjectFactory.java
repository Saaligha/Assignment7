package za.ac.cput.factory.users;

import za.ac.cput.domain.users.Subject;

public class SubjectFactory {
    public static Subject getSubject(String subjectID, String subjectName, String subjectDisc, String subjectLevel) {
        return new Subject.Builder().subjectID(subjectID).subjectName(subjectName).subjectDisc(subjectDisc).subjectLevel(subjectLevel).build();
    }
}


