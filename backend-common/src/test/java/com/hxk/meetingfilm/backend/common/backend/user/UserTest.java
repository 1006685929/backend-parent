package com.hxk.meetingfilm.backend.common.backend.user;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hxk.meetingfilm.backend.common.BackendCommonApplicationTests;
import com.hxk.meetingfilm.backend.common.dao.entity.FilmBackendUserT;
import com.hxk.meetingfilm.backend.common.dao.mapper.FilmBackendUserTMapper;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author xiaokang.huang
 * @date 2020/6/5 10:26
 * @description
 */

public class UserTest extends BackendCommonApplicationTests {

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

        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("user_name","admin4");

        // 查询列表
        List<FilmBackendUserT> user = filmBackendUserTMapper.selectList(wrapper);
        user.stream().forEach(
                System.out::println
        );

    }

    @Test
    public void describeByName() {
        FilmBackendUserT userT = filmBackendUserTMapper.describeByUserName("admin");
        System.out.println("user:"+userT);

    }

    @Test
    public void selectByPage(){

        //分页对象
        Page<FilmBackendUserT> page = new Page<>(1,3);

        QueryWrapper wrapper = new QueryWrapper();
        wrapper.like("user_name","admin");
        // 查询列表
        //List<FilmBackendUserT> user = filmBackendUserTMapper.selectList(wrapper);

        IPage iPage = filmBackendUserTMapper.selectPage(page, wrapper);
        iPage.getRecords().stream().forEach(
                System.out::println
        );
    }
}
