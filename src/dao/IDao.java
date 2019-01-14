package dao;

public interface IDao<T> {
    void add();
    void delete(int id);
    void update(int id, IDao dao);
    T[] getAll();
    T getById(int id);
}
