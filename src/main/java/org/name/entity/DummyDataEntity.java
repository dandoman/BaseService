package org.name.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.name.business.DummyData;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "dummy_data")
@NoArgsConstructor
public class DummyDataEntity {
	@Id private String id;
	private String data;
	
	public DummyData toDummyData(){
		DummyData c = new DummyData();
		c.setId(this.id);
		c.setData(this.data);
		return c;
	}
}
