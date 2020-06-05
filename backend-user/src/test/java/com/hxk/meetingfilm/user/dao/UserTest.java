package com.hxk.meetingfilm.user.dao;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hxk.meetingfilm.user.BackendUserApplicationTests;
import com.hxk.meetingfilm.user.dao.entity.FilmBackendUserT;
import com.hxk.meetingfilm.user.dao.mapper.FilmBackendUserTMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaokang.huang
 * @date 2020/6/5 10:26
 * @description
 */

public class UserTest extends BackendUserApplicationTests {

    @Resource
    private FilmBackendUserTMapper filmBackendUserTMapper;

    @Test
    public void add() {
//        FilmBackendUserT user = new FilmBackendUserT();
//        user.setUserName("admin");
//        user.setUserPwd("admin123");
//        user.setUserPhone("18588888888");
//
//        filmBackendUserTMapper.insert(user);
    }

    @Test
    public void select() {

        // 查询列表
        List<FilmBackendUserT> user = filmBackendUserTMapper.selectList(null);
        user.stream().forEach(
                System.out::println
        );

    }


}
