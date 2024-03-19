package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.Board;

@Mapper
public interface BoardDao {
	@Insert("insert into board(bno,title,content,writer,readcnt) values(board_seq.nextval,#{title},#{content},#{writer},0)")
	public Long save(Board board);
	
	public List<Board> findAll(Long startRownum, Long endRownum);
	
}
