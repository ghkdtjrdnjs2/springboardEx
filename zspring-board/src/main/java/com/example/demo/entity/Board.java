package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class Board {
	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Long readcnt;
}
