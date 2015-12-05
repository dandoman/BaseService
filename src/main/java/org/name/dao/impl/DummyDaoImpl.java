package org.name.dao.impl;

import java.util.List;

import lombok.Setter;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
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
	public void createDummyData(DummyDataEntity d) {
		// TODO Auto-generated method stub
	}
}
