package dao;

import java.util.List;

import javax.persistence.EntityManager;

import utils.EntityManagerUtils;
import model.Model;

public class DAO<T extends Model> {
	
	private Class<T> klazz;
	
	public DAO(Class<T> klazz) {
		this.klazz = klazz;
		EntityManagerUtils.criarConexao();
	}

	public void create(T entity) {
	}
	
	public T find(Integer id) {
		EntityManager em = EntityManagerUtils.criarEntityManager();
		T entity = em.find(klazz, id);
		EntityManagerUtils.fechaConexao();
		return entity;
	}
	
	public List<T> findAll() {
		return null;
	}
	
	public void update(T entity) {
	}
	
	public void delete(T entity) {
	}
	
}
