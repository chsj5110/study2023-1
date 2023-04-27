package org.zerock.domain;

import java.util.Date;
import lombok.Data;

@Data
public class BoardVO {

	private Long board_no;
	private String board_title;
	private String board_content;
	private String board_writer;
	private String board_regdate;
	private String board_updatedate;
}
