package com.ckj.ssm.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ckj.ssm.mapper.BookMapper;
import com.ckj.ssm.po.Book;
import com.ckj.ssm.service.BookService;


@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired BookMapper bookMapper;
	
	
	@Override
	public List<Book> findBook() {
		// TODO Auto-generated method stub
		return bookMapper.findAllBook();
		
	}

}
