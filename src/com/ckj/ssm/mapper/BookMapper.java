package com.ckj.ssm.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.ckj.ssm.po.Book;

public interface BookMapper {
	@Select("select * from tb_book")
	List<Book> findAllBook();

}
