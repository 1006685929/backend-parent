package com.hxk.meetingfilm.backend.common.dao.mapper;

import com.hxk.meetingfilm.backend.common.dao.entity.FilmBackendUserT;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * 后台用户表 Mapper 接口
 * </p>
 *
 * @author hxk
 * @since 2020-06-05
 */
public interface FilmBackendUserTMapper extends BaseMapper<FilmBackendUserT> {

    /**
     * 测试自定义sql
     * @param username
     * @return
     */
    FilmBackendUserT describeByUserName(@Param("username") String username);

}
