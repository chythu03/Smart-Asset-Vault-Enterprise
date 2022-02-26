package model;

public class user {
	private String actor,name;
	private int id;
	public user(int id,String name, String actor) {
		super();
		this.id=id;
		this.actor = actor;
		this.name = name;
	}
	
	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
