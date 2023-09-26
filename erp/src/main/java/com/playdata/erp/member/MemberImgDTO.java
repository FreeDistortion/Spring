package com.playdata.erp.member;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberImgDTO {
	private String id;
	private String originalFilename;
	private String storeFilename;
}
