package Assignment6.repository;


import Assignment6.domain.Demographic;
import Assignment6.domain.Location;

public interface RepoA<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);

}
