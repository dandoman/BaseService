package org.name.activity;

import java.util.List;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

import org.name.business.DummyData;
import org.name.logic.DummyLogic;
import org.name.request.CreateDummyDataRequest;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Log4j
@Controller
@RequestMapping(value = "/dummy")
@Transactional
public class DummyActivity {

	private static final String APPLICATION_JSON = "application/json";
	@Setter private DummyLogic dummyLogic;
	
	@RequestMapping(method = RequestMethod.POST, value = "/write", produces = { APPLICATION_JSON })
    @ResponseBody
    public DummyData create(@RequestBody CreateDummyDataRequest r) {
    	return dummyLogic.createDummyData(r);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/read", produces = { APPLICATION_JSON })
    @ResponseBody
    public List<DummyData> read() {
    	return dummyLogic.getDummyAllData();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/readById", produces = { APPLICATION_JSON })
    @ResponseBody
    public List<DummyData> read(@RequestParam(required = false) String id) {
    	return dummyLogic.getDummyDataById(id);
    }
		
}
