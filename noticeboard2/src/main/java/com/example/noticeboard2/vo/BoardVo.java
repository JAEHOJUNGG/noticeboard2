package com.example.noticeboard2.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.DateTimeException;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardVo {
    private int boardNumber;
    private  String userId;
    private  String title;
    private  String content;
    private  String  boardTime;
    private int num;
    private String registerId;
}
