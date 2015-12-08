package org.name.entity;

import org.name.business.DummyData;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DummyDataEntity {
	private String id;
	private String data;
	
	public DummyData toDummyData(){
		DummyData c = new DummyData();
		c.setId(this.id);
		c.setData(this.data);
		return c;
	}
}
