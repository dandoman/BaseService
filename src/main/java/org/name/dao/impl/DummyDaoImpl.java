package org.name.dao.impl;

import java.util.List;
import java.util.UUID;

import lombok.Setter;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.name.business.DummyData;
import org.name.dao.DummyDao;
import org.name.entity.DummyDataEntity;

public class DummyDaoImpl implements DummyDao {
	@Setter
	private SessionFactory sessionFactory;

	@Override
	public List<DummyDataEntity> getDummyData() {
		Criteria c = sessionFactory.getCurrentSession().createCriteria(
				DummyDataEntity.class);
		return c.list();
		
	}

	@Override
	public DummyData createDummyData(String data) {
		DummyDataEntity dataEntity = new DummyDataEntity();
		dataEntity.setId(UUID.randomUUID().toString());
		dataEntity.setData(data);
		sessionFactory.getCurrentSession().saveOrUpdate(dataEntity);
		return dataEntity.toDummyData();
	}
}
