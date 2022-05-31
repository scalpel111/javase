package com.scalpel.junit;

import org.junit.*;

/**
 * 测试方法
 * 公开 无参数 无返回值
 * 用@Test注解标记
 */

/**
 * 开始执行的方法：初始化资源
 * 执行完之后的方法：释放资源
 */
public class TestUserService {
    //修饰实例方法
    @Before
    public void before(){
        System.out.println("1");
    }
    @After
    public void after(){
        System.out.println("2");
    }
    //修饰静态方法
    @BeforeClass
    public static void beforeClass(){
        System.out.println("3");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("4");
    }
    @Test
    public void testLoginName(){
        UserService userService=new UserService();
        String rs = userService.loginName("admin", "123456");
        //进行预期结果的正确性测试：断言
        Assert.assertEquals("可能出现问题","登陆成功",rs);
    }
    @Test
    public void testSelectName(){
        UserService userService=new UserService();
        userService.selectNames();
    }
}
