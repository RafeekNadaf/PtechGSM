package com.ptechgsm.cotroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Ptechgsm {
	
	@RequestMapping(value="/main")
	public String Ptech(){
		
		return "hello rafeek";
	}
	
	

}
