package org.name.dao.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.name.business.DummyData;
import org.name.entity.DummyDataEntity;

public interface DummyDataMapper {
	@Insert("INSERT INTO dummy_data(id,data) "
			+ "VALUES (#{id},#{data})")
	public int createDummyData(@Param("data") String data, @Param("id") String id);
	
	@Select("SELECT id as id, data as data FROM dummy_data")
	public List<DummyDataEntity> getDummyData();
	
	//Example for dynamic queries
	@SelectProvider(type = DummyQueryProvider.class,  method = "getDataByIdSQL")
	public List<DummyDataEntity> getDummyDataById(@Param(value = "id") String id);
}
