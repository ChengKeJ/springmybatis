package com.ckj.ssm.controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ckj.ssm.po.Book;
import com.ckj.ssm.service.BookService;


@Controller
public class BookController {
	
	@Autowired
	@Qualifier("bookService")
	private BookService bookService; 
	
	
	@RequestMapping(value="/main")
	public ModelAndView book(ModelAndView mv,HttpSession session){
		List<Book> list_book=bookService.findBook();
		session.setAttribute("list_book",list_book);
		System.err.println("---------");
		mv.addObject("list_book",list_book);
		System.err.println("11111111111");
		mv.setViewName("main");
		return mv;
	}
	
	
	
	

}
