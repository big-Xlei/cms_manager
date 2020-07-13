package com.xl.apps.cms.bean.dor;

public class Ridrepole {

	private Long id;
	private String ridrepole_num;
	private String floor;
	private String statue;
	private String parentId;
	private String descs;
	
	
	public Ridrepole() {
	}

	public Ridrepole(Long id, String ridrepole_num, String floor, String statue, String parentId, String descs) {
		this.id = id;
		this.ridrepole_num = ridrepole_num;
		this.floor = floor;
		this.statue = statue;
		this.parentId = parentId;
		this.descs = descs;
	}
	public Ridrepole( String ridrepole_num, String floor, String statue, String parentId, String descs) {
		this.id = id;
		this.ridrepole_num = ridrepole_num;
		this.floor = floor;
		this.statue = statue;
		this.parentId = parentId;
		this.descs = descs;
	}

	public Ridrepole(String ridrepole_num, String floor, String statue, String parentId) {
		this.ridrepole_num = ridrepole_num;
		this.floor = floor;
		this.statue = statue;
		this.parentId = parentId;
	}

	public Ridrepole(Long id, String ridrepole_num, String floor, String statue) {
		this.id = id;
		this.ridrepole_num = ridrepole_num;
		this.floor = floor;
		this.statue = statue;
	}

	
	
	public Ridrepole(Long id, String ridrepole_num, String floor, String statue, String parentId) {
		this.id = id;
		this.ridrepole_num = ridrepole_num;
		this.floor = floor;
		this.statue = statue;
		this.parentId = parentId;
	}

	public String getDescs() {
		return descs;
	}

	public void setDescs(String descs) {
		this.descs = descs;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRidrepole_num() {
		return ridrepole_num;
	}

	public void setRidrepole_num(String ridrepole_num) {
		this.ridrepole_num = ridrepole_num;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getStatue() {
		return statue;
	}

	public void setStatue(String statue) {
		this.statue = statue;
	}

	@Override
	public String toString() {
		return "Ridrepole{" +
				"id=" + id +
				", ridrepole_num='" + ridrepole_num + '\'' +
				", floor='" + floor + '\'' +
				", statue='" + statue + '\'' +
				", parentId='" + parentId + '\'' +
				", descs='" + descs + '\'' +
				'}';
	}
}
