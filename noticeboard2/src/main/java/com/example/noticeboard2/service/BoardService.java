package com.example.noticeboard2.service;

import com.example.noticeboard2.dto.SearchBoardDTO;
import com.example.noticeboard2.mapper.BoardMapper;
import com.example.noticeboard2.vo.BoardVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BoardService {
@Autowired
    BoardMapper boardMapper;


    public void createBoard(BoardVo boardVo) {
        boardMapper.createBoard(boardVo);
    }

    public List<BoardVo> getBoardList(SearchBoardDTO searchBoardDTO){
        return boardMapper.viewList(searchBoardDTO);
    }

    public BoardVo getBoardDetail(String boardNumber){
        return boardMapper.getBoardDetail(boardNumber);
    }
    public void changeBoard(BoardVo param){boardMapper.changeBoard(param);}
    
    public void boardDelete(BoardVo param){
        boardMapper.boardDelete(param);
    }

}