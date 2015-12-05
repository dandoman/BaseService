package org.name.dao;

import java.util.List;

import org.name.entity.DummyDataEntity;

public interface DummyDao {
	public void createDummyData(DummyDataEntity c);
	public List<DummyDataEntity> getDummyData();
}
