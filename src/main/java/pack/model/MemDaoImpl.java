package pack.model;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import pack.controller.MemBean;

@Repository
public class MemDaoImpl extends SqlSessionDaoSupport implements MemDaoInter {
	//mybatis가 제공하는 SqlSessionDaoSupport를 상속해야 함
	//그리고 아래 내용으로 factory를 세터 인젝션 해야 함
	@Autowired
	public MemDaoImpl(SqlSessionFactory factory) {
		setSqlSessionFactory(factory);
	}

	@Override
	public List<MemDto> getDataAll() {
		// SqlSessionFactory에 있는 sqlsession을 getSqlSession()통해 호출 
		// 그리고 . 하면 sql구문을 실행하는 메소드가 나온다.
		return getSqlSession().selectList("selectAll");
	}

	@Override
	public MemDto selectPart(String num) {
		
		return getSqlSession().selectOne("selectPart");
	}

	@Override
	public boolean insertData(MemBean bean) {
		int result = getSqlSession().insert("insertData", bean);
		boolean bool = false;
		if(result!=0) {
			bool=true;
		}
		return bool;
	}

	@Override
	public boolean updateData(MemBean bean) {
		int result = getSqlSession().update("updateData", bean);
		boolean bool = false;
		if(result!=0) {
			bool=true;
		}
		return bool;
	}

	@Override
	public boolean deleteData(String num) {
		int result = getSqlSession().delete("deleteData",num);
		boolean bool = false;
		if(result!=0) {
			bool=true;
		}
		return bool;
	}
}
