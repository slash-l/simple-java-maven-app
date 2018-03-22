package cn.newtouch.demo.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author mumu
 * @vervion v1.0
 * @description
 * @date 2017/8/21 2017, 上午11:50
 */
@Slf4j
public class DemoTest {

    @Test
    public void testHello(){
        log.info("test hello");
        Assert.assertEquals("hello", "hello");
    }

    @Test
    public void testFail(){
        Assert.assertEquals("a", "b");
    }
}
