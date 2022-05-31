package com.scalpel.junit;

public class UserService {
    public String loginName(String loginName,String passWord){
        if ("admin".equals(loginName)&&"123456".equals(passWord)){
            return "登陆成功";
        }else {
        return "登陆失败";
        }
    }
    public void selectNames(){
        System.out.println(10/2);
        System.out.println("");
    }
}
