package cn.zhangxiaofu.service;

import java.util.List;

import cn.zhangxiaofu.model.Person;

public interface PersonService {
	public Person getPersonById(int id);
	
	public List<Person> getAll();
	
	public List<Person> getAll1();
	
	public List<Person> getAll2();

	public List<Person> getAll3();

	public List<Person> getAll4();
}
