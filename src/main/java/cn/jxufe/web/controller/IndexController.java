package cn.jxufe.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.jxufe.web.mybatis.TestMyBatis;

@Controller
@RequestMapping
public class IndexController {

	@RequestMapping("/index")
	public String list(HttpServletRequest request){
		
		TestMyBatis.testAdd();
		
		TestMyBatis.getUser();
		return "index";
	}
	
}