package com.example.noticeboard2.mapper;

import com.example.noticeboard2.vo.UserVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.javassist.compiler.ast.Member;

@Mapper
public interface UserMapper {
//회원가입
    Integer duplicateUserByUserId(String userId); // 유저 중복체크
    int joinUser(UserVo param);
    Integer isLoginAble(UserVo param);

}
