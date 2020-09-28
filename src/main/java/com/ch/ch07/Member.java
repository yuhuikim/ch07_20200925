package com.ch.ch07;

import org.springframework.web.multipart.MultipartFile;

import lombok.Data;

@Data
public class Member {
	private String id;
	private String name;
	private String fileName;

	// 파일 upload 용
	private MultipartFile file;

}
