package com.hxk.meetingfilm.backend.common.backend.user;

import com.hxk.meetingfilm.utils.common.vo.BaseResponseVO;
import org.junit.Test;

/**
 * @author xiaokang.huang
 * @date 2020/6/5 11:09
 * @description
 */

public class UtilsTest {

    @Test
    public void test(){
        BaseResponseVO baseResponseVO = new BaseResponseVO();
        System.out.println(baseResponseVO.run("hello"));
    }
}
