package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import model.Model;
import utils.EntityManagerUtils;

public class DAO<T extends Model> {
	
	private Class<T> klazz;
	private EntityManager em; 
	
	public DAO(Class<T> klazz) {
		this.klazz = klazz;
		EntityManagerUtils.criarConexao();
		em = EntityManagerUtils.criarEntityManager();
	}

	public void create(T entity) {
		em.getTransaction().begin();
		em.persist(entity);
		em.getTransaction().commit();
	}
	
	public T find(Integer id) {
		
		T entity = em.find(klazz, id);
		EntityManagerUtils.fechaConexao();
		return entity;
	}
	
	public List<T> findAll() {
		String jpql = "FROM " + klazz.getSimpleName();
		TypedQuery<T> query = em.createQuery(jpql, klazz);
		return query.getResultList();
	}
	
	public void update(T entity) {
	}
	
	public void delete(T entity) {
	}
	
}
