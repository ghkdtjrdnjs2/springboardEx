package com.example.demo.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.entity.Board;

@Mapper
public interface BoardDao {
	@Insert("insert into board(bno,title,content,writer,readcnt) values(board_seq.nextval,#{title},#{content},#{writer},0)")
	public Long save(Board board);
}
