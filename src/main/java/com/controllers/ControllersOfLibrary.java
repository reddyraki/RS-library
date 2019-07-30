package com.controllers;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.registrationPojo.RegistrationPojo;

@Controller
public class ControllersOfLibrary {

	@RequestMapping(value = "/ReadTheBook1")
	public String read1() {
		System.out.println("in controller classs");

		return "gk1";

	}

	@RequestMapping(value = "/gk1")
	public String read2() {

		System.out.println("in gk controller");

		return "login";

	}

	@RequestMapping(value = "/LoginUser")
	public String loginUser(@RequestParam("UserName") String UserName, @RequestParam("Password") String Password,
			Model model) {

		System.out.println("in loginUserMethod");
		// hibernate query for to check login details

		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session sess = sf.openSession();
		Query query = sess.createQuery("from RegistrationPojo  where email = :email and password=:password");

		System.out.println("it was hitting database");

		query.setParameter("email", UserName);
		query.setParameter("password", Password);

		List list2 = query.list();

		sess.beginTransaction().commit();
		sess.close();
		if (list2.isEmpty()) {
			System.out.println("the entered values are in correct");
			return "login";
		} else
			System.out.println("the entered values are correct");
		return "forward";

	}

	@RequestMapping(value = "/ReadingBookDetails")
	public String readingBook(Model model) {
		System.out.println("this is in reading bok method ");

		// need to hibernate logic to get the book total details from the
		// database
		Configuration configure = new Configuration().configure();
		SessionFactory sf = configure.buildSessionFactory();
		Session sess = sf.openSession();
		Query query = sess.createQuery("from GeneralStudiesBooksPojo where bookName = 'gk1' ");

		sess.beginTransaction().commit();
		System.out.println("hitting database for book");
		List list1 = query.list();
		sess.close();
		System.out.println("the database hitted got the data from the database");
		System.out.println("the book name is " + list1.get(0));

		model.addAttribute("list", list1);

		return "profile";
	}

	@RequestMapping(value = "/RigesterNewUser")
	public String register() {

		System.out.println("on the way new registration jsp page");
		return "Registration";

	}
	public
}
