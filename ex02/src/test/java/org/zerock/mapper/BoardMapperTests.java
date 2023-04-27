package org.zerock.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {

	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	@Test
	public void testUpdate() {
		
		BoardVO board = new BoardVO();
		board.setBoard_no(5L);
		board.setBoard_title("������ ����");
		board.setBoard_content("������ ����");
		board.setBoard_writer("user11");
		
		int count = mapper.update(board);
		log.info("UPDATE COUNT: " + count);
		
	}
	
	public void testDelete() {
		//log.info("DELETE COUNT : " + mapper.delete(3L));
	}
	
	public void testRead() {
		BoardVO board = mapper.read(5L);
		
		log.info(board);
	}
	
	public void testInsertSelectKey() {
		BoardVO board = new BoardVO();
		board.setBoard_title("New TITLE select Key");
		board.setBoard_content("NEW Content select Key");
		board.setBoard_writer("newbie");
		
		mapper.insert(board);
		
		log.info(board);
	}
	
	public void testInsert() {
		
		BoardVO board = new BoardVO();
		board.setBoard_title("New TITLE");
		board.setBoard_content("NEW Content");
		board.setBoard_writer("newbie");
		
		mapper.insert(board);
		
		log.info(board);
	}
	
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	
}
