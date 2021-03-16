package pack.model;

import java.util.List;

import pack.controller.MemBean;

public interface MemDaoInter {//db와 연결하는 메소드가 있는 클래스
	
	List<MemDto> getDataAll();
	MemDto selectPart(String num);
	boolean insertData(MemBean bean);
	boolean updateData(MemBean bean);
	boolean deleteData(String num);
	

}
