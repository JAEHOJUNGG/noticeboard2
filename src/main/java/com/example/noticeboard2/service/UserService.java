package com.example.noticeboard2.service;

import com.example.noticeboard2.mapper.UserMapper;
import com.example.noticeboard2.vo.UserVo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    UserMapper userMapper;

    public Integer isLoginAble(UserVo param){
        return userMapper.isLoginAble(param);
    }

    public Boolean loginProcess(UserVo param) {
        Boolean result =false;
        Integer userCount = isLoginAble(param);

        if (userCount > 0) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    public Boolean joinUser(UserVo userVo){
        Boolean result = false;
        Integer count = getUserCountByUserId(userVo.getUserId());
        if (count == 0 ) {
            userMapper.joinUser(userVo);
            result= true;
        }
        return result;
    }
    public Integer getUserCountByUserId(String userId) {
        return userMapper.duplicateUserByUserId(userId);
    }

}