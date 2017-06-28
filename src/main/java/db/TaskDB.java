package db;

import java.util.Calendar;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class TaskDB {
	@PersistenceContext(unitName = "todolist")
	private EntityManager em;
	public void create(Task task){
		task.setDeadline(Calendar.getInstance().getTime());
		em.persist(task);
	}
}
