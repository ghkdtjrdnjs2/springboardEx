package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.BoardDao;
import com.example.demo.entity.Board;

@SpringBootTest
public class BoardDaoTest {
	@Autowired
	private BoardDao boardDao;
	
	// 테스트에서 사용하는 @Transactional은 자동으로 rollback
	@Transactional
	@Test
	public void saveTest() {
		Board board = new Board(null,"aaa","bbb","ccc",null);
		assertEquals(1L, boardDao.save(board));
	}
}
