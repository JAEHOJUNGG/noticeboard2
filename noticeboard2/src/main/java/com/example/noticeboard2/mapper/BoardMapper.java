package com.example.noticeboard2.mapper;

import com.example.noticeboard2.dto.SearchBoardDTO;
import com.example.noticeboard2.vo.BoardVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    void createBoard(BoardVo param);
    List<BoardVo> viewList(SearchBoardDTO searchBoardDTO);

    BoardVo getBoardDetail(String boardNumber);

    void changeBoard(BoardVo param);
    void boardDelete(BoardVo param);
}

