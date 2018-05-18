package com.example.mystore.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController  {
 
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {

    	 Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        
        return "error";
    }
 
    @Override
    public String getErrorPath() {
        return "/error";
    } 

}
