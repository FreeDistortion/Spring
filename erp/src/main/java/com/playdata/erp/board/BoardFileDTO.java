package com.playdata.erp.board;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/*
@Setter
@Getter
@ToString
*/
@Data

// 전체 member variables를 parameter로 하는 constructor 정의
@AllArgsConstructor

// default constructor
@NoArgsConstructor
public class BoardFileDTO {
	private String board_no; 
	private String originalFilename;
	private String storeFilename;
	private String boardFileorder;
}
