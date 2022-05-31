package com.scalpel.proxy.case1;

public interface UserService {
    String login(String loginName,String passWord);
    void deleteUsers();
    String selectUsers();
}
