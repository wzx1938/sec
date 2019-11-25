package com.company.pms.dao.idao;

public interface IBaseDao<T,K> {
    void save(T t)throws Exception;
    void update(T t)throws Exception;
    void delete(T t)throws Exception;
    T findById(K id) throws Exception;
}
