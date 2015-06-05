package cn.zhangxiaofu.model;

import java.util.Date;
import java.util.List;

public class Person {
	
	private List<User> users;

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	//通过中间表，此映射比较麻烦
	private List<PersonUser> personUser;
	
    public List<PersonUser> getPersonUser() {
		return personUser;
	}

	public void setPersonUser(List<PersonUser> personUser) {
		this.personUser = personUser;
	}

	private Integer personId;

    private String name;

    private Integer gender;

    private String personAddr;

    private Date birthday;

    public Integer getPersonId() {
        return personId;
    }

    public void setPersonId(Integer personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getPersonAddr() {
        return personAddr;
    }

    public void setPersonAddr(String personAddr) {
        this.personAddr = personAddr == null ? null : personAddr.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}