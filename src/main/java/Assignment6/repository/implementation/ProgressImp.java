package Assignment6.repository.implementation;

import Assignment6.domain.Course;
import Assignment6.domain.Demographic;
import Assignment6.domain.Progress;
import Assignment6.repository.ProgressRepo;
import Assignment6.repository.RepoA;

import java.util.HashSet;
import java.util.Set;

public class ProgressImp implements ProgressRepo {

    private static ProgressImp Progress =  null;
    private Set<Progress> progress;

    private ProgressImp(){
        this.progress = new HashSet<>();
    }
    @Override
    public Set<Progress> getAll() {
        return this.progress;
    }

   // @Override
    public Progress create(Progress Progress) {
        this.progress.add(Progress);
        return Progress;
    }

   // @Override
    public Progress update(Progress Progress) {
       this.progress.add(Progress);
       return Progress;
    }

    @Override
    public Course create(Course course) {
        return null;
    }

    @Override
    public Course update(Course course) {
        return null;
    }

    @Override
    public void delete(String s) {
    this.progress.remove(progress);
    }

    @Override
    public Course read(String s) {
        return null;
    }


}
