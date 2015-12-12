package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Table;

import utils.EntityManagerUtils;
import model.Model;

public class DAO<T extends Model> {
	
	private Class<T> klazz;
	
	public DAO(Class<T> klazz) {
		this.klazz = klazz;
	}

	public void create(T entity) {
	}
	
	public T find(T entity) {
		EntityManagerUtils.criarConexao();
		EntityManager em = EntityManagerUtils.criarEntityManager();
		entity = em.find(klazz, entity.getId());
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
