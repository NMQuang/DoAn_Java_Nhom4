package foodGroup4.config;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.metamodel.source.annotations.entity.EntityClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	@Autowired
	private  SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}

	public <T> Serializable create(final T entity) {
	return sessionFactory.getCurrentSession().save(entity);
	}

	public <T> T update(final T entity) {
	sessionFactory.getCurrentSession().update(entity);
	return entity;
	}

	public <T> void delete(final T entity) {
	sessionFactory.getCurrentSession().delete(entity);
	}

	public <T> void delete(Serializable id, Class<T> entityClass) {
	T entity = fetchById(id, entityClass);
	delete(entity);
	}

	@SuppressWarnings("unchecked")
	public <T> List<T> fetchAll(Class<T> entityClass) {
	return sessionFactory.getCurrentSession().createQuery(" FROM "+entityClass.getName()).list();

	}

	@SuppressWarnings("rawtypes")
	public <T> List fetchAll(String query) {
	return sessionFactory.getCurrentSession().createQuery(query).list();
	}

	@SuppressWarnings("unchecked")
	public <T> T fetchById(Serializable id, Class<T> entityClass) {
	return (T)sessionFactory.getCurrentSession().get(entityClass, id);
	}

}