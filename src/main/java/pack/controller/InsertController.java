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
public class InsertController {
	
	@Autowired
	private MemDaoInter inter;
	
	@RequestMapping(value = "insert", method = RequestMethod.GET)
	public String insertInput() {
		String viewName="input";
		 return viewName;
	}
	@RequestMapping(value = "insert", method = RequestMethod.POST)
	public ModelAndView insertResult(MemBean bean) {
		inter.insertData(bean);
		List<MemDto> list = inter.getDataAll();
		 return new ModelAndView("list", "datas", list);
	}
}
