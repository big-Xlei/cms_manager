package com.xl.apps.cms.bean.dor;

public class Student {

    private Long id;
    private String name;
    private String sex;
    private String s_number;
    private String class_name;
    private String s_tel;
    private String t_name;
    private String door_num;
    private String t_num;
    private String state;
    private String descs;
    private String alterable;


    public Student() {
    }

    public Student(String name, String sex, String s_number, String class_name, String s_tel, String t_name,
				   String door_num, String t_num,String state,String descs ){
		this.name = name;
		this.sex = sex;
		this.s_number = s_number;
		this.class_name = class_name;
		this.s_tel = s_tel;
		this.t_name = t_name;
		this.door_num = door_num;
		this.t_num = t_num;
		this.state = state;
		this.descs = descs;
	}


    public Student(Long id, String name, String sex, String s_number, String class_name, String s_tel, String t_name,
                   String door_num, String t_num) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.s_number = s_number;
        this.class_name = class_name;
        this.s_tel = s_tel;
        this.t_name = t_name;
        this.door_num = door_num;
        this.t_num = t_num;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getS_number() {
        return s_number;
    }

    public void setS_number(String s_number) {
        this.s_number = s_number;
    }

    public String getClass_name() {
        return class_name;
    }

    public void setClass_name(String class_name) {
        this.class_name = class_name;
    }

    public String getS_tel() {
        return s_tel;
    }

    public void setS_tel(String s_tel) {
        this.s_tel = s_tel;
    }

    public String getT_name() {
        return t_name;
    }

    public void setT_name(String t_name) {
        this.t_name = t_name;
    }

    public String getDoor_num() {
        return door_num;
    }

    public void setDoor_num(String door_num) {
        this.door_num = door_num;
    }

    public String getT_num() {
        return t_num;
    }

    public void setT_num(String t_num) {
        this.t_num = t_num;
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
		return "Student{" +
				"id=" + id +
				", name='" + name + '\'' +
				", sex='" + sex + '\'' +
				", s_number='" + s_number + '\'' +
				", class_name='" + class_name + '\'' +
				", s_tel='" + s_tel + '\'' +
				", t_name='" + t_name + '\'' +
				", door_num='" + door_num + '\'' +
				", t_num='" + t_num + '\'' +
				", state='" + state + '\'' +
				", descs='" + descs + '\'' +
				", alterable='" + alterable + '\'' +
				'}';
	}
}
