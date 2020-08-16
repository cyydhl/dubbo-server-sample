package com.itcast.dubbo;

public class LoginServiceImpl implements ILoginService{
    @Override
    public String login(String username, String password) {
        if(username.equals("admin")&& password.equals("admin"))
        {
            return "SUCCESS";
        }else
        {
            return "FAILED";
        }

    }
}
