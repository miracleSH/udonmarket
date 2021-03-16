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
public class UpdateController {
	
	@Autowired
	private MemDaoInter inter;
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public ModelAndView updateresult(MemBean bean) {
		inter.updateData(bean);
		List<MemDto> list = inter.getDataAll();
		return new ModelAndView("list","datas",list); 
	}
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String updateinput(MemBean bean) {
		String viewName="updateinput";
		return viewName;
	}

}
