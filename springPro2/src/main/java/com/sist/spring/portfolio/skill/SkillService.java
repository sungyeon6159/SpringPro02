package com.sist.spring.portfolio.skill;

import java.lang.annotation.Annotation;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sist.spring.cmn.DTO;

@Service
public class SkillService implements com.sist.spring.cmn.Service {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	
	public SkillService() {
	}
	
	@Autowired
	SkillDaoImple skillDao;
	
	
	public int doInsert(DTO dto) {
		return this.skillDao.doInsert(dto);
	}

	public int doUpdate(DTO dto) {
		return this.skillDao.doUpdate(dto);
	}


	public DTO doSelectOne(DTO dto) {
		return this.skillDao.doSelectOne(dto);
	}


	public int doDelete(DTO dto) {
		return this.skillDao.doDelete(dto);
	}


	public List<?> doRetrieve(DTO dto) {
		LOG.debug("==========================");
		LOG.debug("SkillService/doRetrieve");
		LOG.debug("==========================");
		return this.skillDao.doRetrieve(dto);

	}


	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return null;
	}


	public String value() {
		// TODO Auto-generated method stub
		return null;
	}

}
