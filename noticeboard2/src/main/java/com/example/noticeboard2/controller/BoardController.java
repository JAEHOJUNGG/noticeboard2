package com.example.noticeboard2.controller;

import com.example.noticeboard2.dto.SearchBoardDTO;
import com.example.noticeboard2.service.BoardService;
import com.example.noticeboard2.vo.BoardVo;
import com.example.noticeboard2.vo.CommonResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @RequestMapping({"", "/"})
    public ModelAndView boardPage(String userId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/board");
        return mv;
    }

    @RequestMapping("/boardWrite")
    public ModelAndView createPage(String userId) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("userId", userId);
        mv.setViewName("board/boardWrite");
        return mv;
    }

    @RequestMapping("/create")
    @ResponseBody
    public CommonResponseVo createBoard(BoardVo param) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            boardService.createBoard(param);
            r.setSuccess(true);
        } catch (Exception e) {
            System.out.println(e);
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }

    @RequestMapping("/getBoardList")
    @ResponseBody
    public CommonResponseVo viewBoard(SearchBoardDTO searchBoardDTO) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            List<BoardVo> boardVList = boardService.getBoardList(searchBoardDTO);
            r.setSuccess(true);
            r.setData(boardVList);
        } catch (Exception e) {
            System.out.println(e);
            r.setSuccess(false);

            r.setMessage(e.toString());
        }
        return r;
    }

    @RequestMapping("/boardDetail")
    public ModelAndView boardViewDetail(String boardNumber,String userId) {
        ModelAndView mv = new ModelAndView();
        try {
            BoardVo boardDetail = new BoardVo();
            /** Service ??? boardNumber ??? ????????? detail view ??? ????????? detail data ??? ???????????? ??? **/
            boardDetail = boardService.getBoardDetail(boardNumber);
            /**ModelAndView ??? Object ??? ???????????? ???????????????.*/
            mv.addObject("boardDetail", boardDetail);
            mv.addObject("userId", userId);
            /** jsp ?????? jstl ???????????? ???????????? ????????? ??? ??????
             * Tag ??????????????? ??? ???????????? , <c:if></c:if> <c:forEach></c:forEach> <c:choose><c:when></c:when></c:choose> */
        } catch (Exception e) {
            System.out.println(e);
        }
        mv.setViewName("board/boardView");
        return mv;

    }

    @RequestMapping("/boardDelete")
    @ResponseBody
    public CommonResponseVo deleteBoard(BoardVo param) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            boardService.boardDelete(param);
            r.setSuccess(true);
        } catch (Exception e) {
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }
    @RequestMapping("/boardModify")
    public ModelAndView modifyPage(String userId, String boardNumber) {
        ModelAndView mv = new ModelAndView();
        try {
            BoardVo boardDetail = new BoardVo();
            /** Service ??? boardNumber ??? ????????? detail view ??? ????????? detail data ??? ???????????? ??? **/
            boardDetail = boardService.getBoardDetail(boardNumber);
            /**ModelAndView ??? Object ??? ???????????? ???????????????.*/
            mv.addObject("boardDetail", boardDetail);
            mv.addObject("userId", userId);
            /** jsp ?????? jstl ???????????? ???????????? ????????? ??? ??????
             * Tag ??????????????? ??? ???????????? , <c:if></c:if> <c:forEach></c:forEach> <c:choose><c:when></c:when></c:choose> */
        } catch (Exception e) {
            System.out.println(e);
        }
        mv.setViewName("board/boardModify");
        return mv;
    }

    @RequestMapping("/changeBoard")
    @ResponseBody
    public CommonResponseVo changeBoard(BoardVo param) {
        CommonResponseVo r = new CommonResponseVo();
        try {
            boardService.changeBoard(param);
            r.setSuccess(true);
        } catch (Exception e) {
            System.out.println(e);
            r.setSuccess(false);
            r.setMessage(e.toString());
        }
        return r;
    }
}









