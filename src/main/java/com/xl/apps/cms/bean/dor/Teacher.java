package com.xl.apps.cms.bean.dor;

public class Teacher {
	private Long id;
	private String t_name;
	private String t_num;
	private String sex;
	private String class_name;
	private String tel;
	private String state;
	private String descs;
	private String alterable;

	public Teacher() {
	}


	public Teacher(String t_name, String t_num, String sex, String class_name,
				   String tel,String state,String descs){
		this.t_name = t_name;
		this.t_num = t_num;
		this.sex = sex;
		this.class_name = class_name;
		this.tel = tel;
		this.state=state;
		this.descs = descs;
	}

	public Teacher(Long id, String t_name, String t_num, String sex, String class_name, String door_num) {
		this.id = id;
		this.t_name = t_name;
		this.t_num = t_num;
		this.sex = sex;
		this.class_name = class_name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_num() {
		return t_num;
	}

	public void setT_num(String t_num) {
		this.t_num = t_num;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getclass_name() {
		return class_name;
	}

	public void setclass_name(String class_name) {
		this.class_name = class_name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getdescs() {
		return descs;
	}

	public void setdescs(String descs) {
		this.descs = descs;
	}

	public String getAlterable() {
		return alterable;
	}

	public void setAlterable(String alterable) {
		this.alterable = alterable;
	}

	@Override
	public String toString() {
		return "Teacher{" +
				"id=" + id +
				", t_name='" + t_name + '\'' +
				", t_num='" + t_num + '\'' +
				", sex='" + sex + '\'' +
				", class_name='" + class_name + '\'' +
				", tel='" + tel + '\'' +
				", state='" + state + '\'' +
				", descs='" + descs + '\'' +
				", alterable='" + alterable + '\'' +
				'}';
	}
}
