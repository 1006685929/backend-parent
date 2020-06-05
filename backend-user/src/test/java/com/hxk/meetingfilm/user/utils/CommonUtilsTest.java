package com.hxk.meetingfilm.user.utils;

import com.hxk.meetingfilm.utils.common.vo.BaseResponseVO;
import org.junit.jupiter.api.Test;

/**
 * @author xiaokang.huang
 * @date 2020/6/5 11:18
 * @description
 */

public class CommonUtilsTest {

    @Test
    public void test(){
        BaseResponseVO responseVO = new BaseResponseVO();
        System.out.println(responseVO.run("hello user"));
    }
}
