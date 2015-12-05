package org.name.logic;

import org.name.business.DummyData;
import org.name.dao.DummyDao;
import org.name.request.CreateDummyDataRequest;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
public class DummyLogic {
	@Setter
	private DummyDao dummyDao;

	public DummyData createDummyData(CreateDummyDataRequest r) {
		// TODO Auto-generated method stub
		return null;
	}
}
