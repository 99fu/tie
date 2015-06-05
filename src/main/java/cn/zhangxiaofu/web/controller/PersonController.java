package cn.zhangxiaofu.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.zhangxiaofu.model.Person;
import cn.zhangxiaofu.service.PersonService;
@Controller
@RequestMapping("/userController")
public class PersonController {
	private PersonService person;


	public PersonService getPerson() {
		return person;
	}

@Autowired
	public void setPerson(PersonService person) {
		this.person = person;
	}

    //@RequestMapping("/{id}/showUser")
	@RequestMapping("/showUser/{id}")
	public String showUser(@PathVariable int id, HttpServletRequest request) {
		Person p=  person.getPersonById(id);
		request.setAttribute("person", p);
		return "person";
	}

}
