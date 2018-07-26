package com.lanou.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Created by lanou on 2018/7/25.
 */
@Controller
public class CookieController {
  @RequestMapping("/find")
    public String findCookie(HttpServletRequest request, HttpServletResponse response){
    //获取cookie
      //获取request
        Cookie[] cookies=request.getCookies();
        for(int i=0;i<cookies.length;i++){
          cookies[i].getName();
          cookies[i].getValue();
        }
        if (true){
          return "index";
        }else{
          return  "login";
        }

    }
}
