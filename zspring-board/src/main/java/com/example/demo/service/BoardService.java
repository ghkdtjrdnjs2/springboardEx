package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;
	
	public Boolean save(Board board) {
		return boardDao.save(board)==1L; 
	}
}
