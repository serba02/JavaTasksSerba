package ua.epam.dao.jdbc;

import java.util.List;

public interface GenericDao<T> {
	T find(int id);
	List<T> findAll();
	void update(T entity);
	void delete(int id);
	void insert(T entity);
}
