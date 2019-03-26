package uni.sistemas.service;

public interface ICrudDao<T> {
    //definir las firmas

    void create(T o);

    void update(T o);

    void delete(T o);

    T findForId(int o);

    T[] readAll();
}
