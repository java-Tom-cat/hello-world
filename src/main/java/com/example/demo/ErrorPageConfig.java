package com.example.demo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
* Copyright: Copyright (c) 2020   江晶华
* 
* @ClassName:  MainsiteErrorController
* @Description: 处理页面错误
 */
@Controller
class MainsiteErrorController implements ErrorController {

    @RequestMapping("/error")
    public void handleError(HttpServletRequest request,HttpServletResponse response){
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
      if(statusCode == 404){
    	  
    		//重定向,地址栏改变
            //response.sendRedirect("/jsp/error/404.jsp");
			try {
				//转发
				request.getRequestDispatcher("/jsp/error/404.jsp").forward(request,response);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(this.getClass().getName());
			}
      }else {
    	  return ;
      }
       
    }
    @Override
    public String getErrorPath() {
       return "/error";
    }
}
