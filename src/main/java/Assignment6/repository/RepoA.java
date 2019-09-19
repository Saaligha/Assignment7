package Assignment6.repository;


public interface RepoA<T, ID> {

    T create(T t);
    T update(T t);
    void delete(ID id);
    T read(ID id);

}
