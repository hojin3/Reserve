package com.sist.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sist.dao.main.MainDAO;
import com.sist.dao.main.MainVO;

@Controller
public class MainController {
	@Autowired
	private MainDAO dao;
	
	@RequestMapping("main.do")
	public String main(Model model){
		
		//정보 얻어오기
		return "main/main";
	}
}













