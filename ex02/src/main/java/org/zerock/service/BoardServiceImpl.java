package org.zerock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.zerock.domain.BoardVO;
import org.zerock.mapper.BoardMapper;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService{
	
	private BoardMapper mapper;
	
	@Override
	public boolean modify(BoardVO board) {
		
		log.info("modify................." + board);
		
		return mapper.update(board) == 1;
		
	}
	
	@Override
	public boolean remove(Long board_no) {
		
		log.info("remove............" + board_no);
		
		return mapper.delete(board_no) == 1;
	}
	
	
	public BoardVO get(Long board_no) {
		
		log.info("get................" + board_no);
		return mapper.read(board_no);
	}
	
	public List<BoardVO> getList(){
		
		log.info("getList.........");
		return mapper.getList();
	}
	
	public void register(BoardVO board) {
		
		log.info("register............" + board);
		
		mapper.insertSelectKey(board);
	}

	@Override
	public BoardVO get(Long board_no) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean modify(BoardVO board) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean remove(Long board_no) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		return null;
	}


}
