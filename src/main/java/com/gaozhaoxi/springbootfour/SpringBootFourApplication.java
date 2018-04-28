package com.gaozhaoxi.springbootfour;

import com.gaozhaoxi.springbootfour.entity.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@SpringBootApplication
public class SpringBootFourApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFourApplication.class, args);
	}

	@RequestMapping(value="/")
	public String index(){
		return "index";
	}

	@RequestMapping(value = "PersonAndPeople")
	public String personAndPeople(Model model){
		Person single=new Person("gao",22);

		List<Person> people=new ArrayList<Person>();
		Person p1=new Person("zhangsan",222);
		Person p2=new Person("lisi",43);
		Person p3=new Person("wangwu",242);

		people.add(p1);
		people.add(p2);
		people.add(p3);
		model.addAttribute("singlePerson",single);
		model.addAttribute("people",people);

		return "PersonAndPeople";

	}


}
