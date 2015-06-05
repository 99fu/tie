package cn.zhangxiaofu.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;

import cn.zhangxiaofu.model.Person;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml","classpath:spring-mybatis.xml"})
public class PersonServiceTest {
PersonService personService;

	public PersonService getPersonService() {
	return personService;
}
@Autowired
public void setPersonService(PersonService personService) {
	this.personService = personService;
}

	@Test
	public void testGetPersonById() {
		Person person = personService.getPersonById(1);
		String name = person.getName();
//		System.out.println(name);
//		System.out.println(JSON.toJSONString(person));
		System.out.println(JSON.toJSONStringWithDateFormat(person,"yyyy-MM-dd HH:mm:ss"));
	}
	@Test
	public void getAll(){
		List<Person> all = personService.getAll();
		System.out.println(JSON.toJSONStringWithDateFormat(all, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void getAll1(){
		List<Person> all = personService.getAll1();
		System.out.println(JSON.toJSONStringWithDateFormat(all, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void getAll2(){
		List<Person> all = personService.getAll2();
		System.out.println(JSON.toJSONStringWithDateFormat(all, "yyyy-MM-dd HH:mm:ss"));
	}

	@Test
	public void getAll3(){
		List<Person> all = personService.getAll3();
		System.out.println(JSON.toJSONStringWithDateFormat(all, "yyyy-MM-dd HH:mm:ss"));
	}
	
	@Test
	public void getAll4(){
		List<Person> all = personService.getAll4();
		System.out.println(JSON.toJSONStringWithDateFormat(all, "yyyy-MM-dd HH:mm:ss"));
	}
}
