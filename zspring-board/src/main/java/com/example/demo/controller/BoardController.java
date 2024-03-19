package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Board;
import com.example.demo.service.BoardService;

// @Controller : 응답이 모델앤드뷰, 리스폰스엔티티 모두가능
// RestController : 응답이 모두 리스폰스엔티티

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	
	// 게시판 글쓰기 - view를 보여주기
	@GetMapping("/board/save")
	public ModelAndView save() {
		return null;
	}
	
	// 게시판 글쓰기 - 처리하기
	@PostMapping("/board/save")
	public ModelAndView save(@ModelAttribute Board board) {
		service.save(board);
		return new ModelAndView("/redirect:/board/find-all");
	}
	
	// 게시판 글 목록
	@GetMapping("/board/find_all")
	public ModelAndView findAll(@RequestParam(defaultValue="1") Long bno) {
		return null;
	}
	
	// 게시판 글 읽기
	@GetMapping("/board/find-by-bno")
	public ModelAndView findByBno(@RequestParam Long pageno) {
		return null;
	}
	
	// 게시판 삭제
	// form을 submit : 화면이 이동하면서 처리
	// $.ajax() : 화면이동 없이 비동기 처리 -> ResponseEntity
	@PostMapping("/board/delete")
	public ResponseEntity<String> delete() {
		// 스프링 rest응답 : Model + http 상태코드
		//return ResponseEntity.ok("삭제에 성공했습니다");
		return null;
	}
}

