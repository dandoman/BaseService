package org.name.logic;

import java.util.ArrayList;
import java.util.List;

import org.name.business.DummyData;
import org.name.dao.DummyDao;
import org.name.entity.DummyDataEntity;
import org.name.request.CreateDummyDataRequest;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class DummyLogic {
	@Setter
	private DummyDao dummyDao;

	public DummyData createDummyData(CreateDummyDataRequest r) {
		return dummyDao.createDummyData(r.getDummyMessage());
	}
	
	public List<DummyData> getDummyAllData() {
		List<DummyData> returnList = new ArrayList<DummyData>();
		for(DummyDataEntity d : dummyDao.getDummyData()){
			returnList.add(d.toDummyData());
		}
		
		return returnList;
	}
	
}
