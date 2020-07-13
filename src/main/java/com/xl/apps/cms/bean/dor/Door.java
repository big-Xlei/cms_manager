package com.xl.apps.cms.bean.dor;

public class Door {
	private Long id;
	private String door_num;
	private Long froms;
	private String statue;
	
	public Door() {
	}

	public Door(Long id, String door_num, Long froms, String statue) {
		this.id = id;
		this.door_num = door_num;
		this.froms = froms;
		this.statue = statue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDoor_num() {
		return door_num;
	}

	public void setDoor_num(String door_num) {
		this.door_num = door_num;
	}

	public Long getfroms() {
		return froms;
	}

	public void setfroms(Long froms) {
		this.froms = froms;
	}

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	@Override
	public String toString() {
		return "Door [id=" + id + ", door_num=" + door_num + ", froms=" + froms + ", statue=" + statue + "]";
	}
	
	
}

