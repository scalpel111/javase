package com.scalpel.proxy.case1;

public class UserServiceImpl implements UserService{
    @Override
    public String login(String loginName, String passWord) {

        String rs="登录失败";
        if ("admin".equals(loginName)&&"123456".equals(passWord)){
            rs="登录成功";
        }
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }

    @Override
    public void deleteUsers() {

        try {
            System.out.println("正在删除用户");
            Thread.sleep(2500);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public String selectUsers() {

        String rs="查询了1000个用户";
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return rs;
    }
}
