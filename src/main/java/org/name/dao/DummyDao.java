package org.name.dao;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.name.business.DummyData;
import org.name.entity.DummyDataEntity;

public interface DummyDao {
	public DummyData createDummyData(String data, String id);
	public List<DummyDataEntity> getDummyData();
	public List<DummyDataEntity> getDummyDataBuilderExample(String id);
}
