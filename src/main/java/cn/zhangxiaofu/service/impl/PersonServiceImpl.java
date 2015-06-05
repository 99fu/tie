package cn.zhangxiaofu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.zhangxiaofu.dao.PersonMapper;
import cn.zhangxiaofu.model.Person;
import cn.zhangxiaofu.service.PersonService;
@Service
public class PersonServiceImpl implements PersonService {
	PersonMapper p;

	public PersonMapper getP() {
		return p;
	}
	@Autowired
	public void setP(PersonMapper p) {
		this.p = p;
	}
	@Override
	public Person getPersonById(int id){
		
		return p.selectByPrimaryKey(id);
	}
	@Override
	public List<Person> getAll() {

		return p.getAll();
	}
	@Override
	public List<Person> getAll1() {
		return p.getAll1();
	}
	@Override
	public List<Person> getAll2() {
		return p.getAll2();
	}
	@Override
	public List<Person> getAll3() {
		return p.getAll3();
	}
	@Override
	public List<Person> getAll4() {
		return p.getAll4();
	}

}
