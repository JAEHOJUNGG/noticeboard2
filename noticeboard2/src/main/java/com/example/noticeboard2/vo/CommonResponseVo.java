package com.example.noticeboard2.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommonResponseVo {
    /** 비동기로 데이터를 받을 때 사용하는 VO
     * success = true : 해당 작업이 성공했는 지 여부를 체크 하는 용도
     * Object = body 에서 받아야 하는 데이터를 담는 용도 */
    private String message;
    private Boolean success =false;
    private Object data;
}