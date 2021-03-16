package pack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import pack.model.MemDaoInter;
import pack.model.MemDto;

@Controller
public class ListController {
	
	@Autowired
	private MemDaoInter inter;
	
	@RequestMapping("list")
	public ModelAndView list() {
		
		List<MemDto> list = inter.getDataAll();
		return new ModelAndView("list", "datas", list);
	}
}
