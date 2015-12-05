package org.name.dao;

import java.util.List;

import org.name.business.DummyData;
import org.name.entity.DummyDataEntity;

public interface DummyDao {
	public DummyData createDummyData(String data);
	public List<DummyDataEntity> getDummyData();
}
