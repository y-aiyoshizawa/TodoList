package beans;

import java.util.Date;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import db.Task;
import db.TaskDB;

@Named @RequestScoped
public class TaskBean {
	private Integer id;
	private String taskName;
	private String taskMemo;
	private Date deadline;

	@EJB
	TaskDB db;

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getTaskMemo() {
		return taskMemo;
	}
	public void setTaskMemo(String taskMemo) {
		this.taskMemo = taskMemo;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public void next(){
		System.out.println(id);
		create ();
	}

	public void create(){
		Task task = new Task(id,taskName,taskMemo,null);
		try{
			db.create(task);

			System.out.println("成功");
		}catch(Exception e){
			System.out.println("失敗");
		}
	}
}
