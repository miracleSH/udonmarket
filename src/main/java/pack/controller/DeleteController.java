package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemDaoInter;
import pack.model.MemDto;

@Controller
public class DeleteController {
	
	@Autowired
	private MemDaoInter inter;
	
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public ModelAndView deleteresult(String num) {
		inter.deleteData(num);
		List<MemDto> list = inter.getDataAll();
		return new ModelAndView("list","datas",list); 
	}
	
}
