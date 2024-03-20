package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;

@Service
public class BoardService {
	@Autowired
	private BoardDao boardDao;
	@Value("${pagesize}")
	private Long PAGE_SIZE;
	
	public Boolean save(Board board) {
		return boardDao.save(board)==1L; 
	}
	
	public void findAll(Long pageno) {
		// 1. 사용자가 페이지번호를 선택
		// 2. 페이지번호에서 startRownum, endRownum 계산해서 dao 호출
		// 3. pagination(prev, start, ene, next)를 계산
		// 페이징 결과와 pagination을 클라이언트로
		
		// pageno			>startRownum		<endRownum
		//	1					0					10
		//	2					10					20
		
		Long startRownum = (pageno-1)*PAGE_SIZE;
		Long endRownum = startRownum+PAGE_SIZE;
		boardDao.findAll(startRownum, endRownum);
		
		// 페이징 정보
		Long countOfBoard = boardDao.count();
		// 페이지 개수를 계산하자
		Long countOfPage = (countOfBoard-1)/10+1;
		System.out.println(countOfPage);
		// 글의 개수	/ 10				페이지의 개수
		// 118		  11+1				12
		// 119		  11+1				12
		// 120		  12+0				12
		// 121 		  12+1				13
	}
	
}