package org.name.dao.impl;

import java.util.List;
import java.util.UUID;

import lombok.Setter;
import lombok.SneakyThrows;

import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.name.business.DummyData;
import org.name.dao.DummyDao;
import org.name.dao.mybatis.DummyDataMapper;
import org.name.entity.DummyDataEntity;
import org.apache.ibatis.session.defaults.DefaultSqlSessionFactory;
import org.springframework.util.StringUtils;

public class DummyDaoImpl implements DummyDao {
	@Setter private DummyDataMapper dummyDataMapper;

	@Override
	public List<DummyDataEntity> getDummyData() {
		return dummyDataMapper.getDummyData();
	}

	@Override
	public DummyData createDummyData(String data, String id) {
		dummyDataMapper.createDummyData(data, id);
		return new DummyDataEntity(id,data).toDummyData();
	}
	
	@Override
	@SneakyThrows
	public List<DummyDataEntity> getDummyDataBuilderExample(final String id) {
		return dummyDataMapper.getDummyDataById(id);
	}
}
