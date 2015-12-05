package org.name.timer;

import lombok.extern.log4j.Log4j;

@Log4j
public class DummyPeriodicJob {
	public void run() {
		log.info("Running job");
	}
}
