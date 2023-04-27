package org.zerock.service;

import java.util.List;
import org.zerock.domain.BoardVO;

public interface BoardService {

	public void register(BoardVO board);
	
	public BoardVO get(Long board_no);

	public boolean modify(BoardVO board);
	
	public boolean remove(Long board_no);
	
	public List<BoardVO> getList();

}
