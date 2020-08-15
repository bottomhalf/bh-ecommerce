package org.bottomhalf.ec.app.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author rahman
 *
 */
@Service
public class SecurityLogWriterService {

	private static final Logger log = LoggerFactory.getLogger(SecurityLogWriterService.class);
	
	public void debug(String message) {
		log.debug(message);
	}
	
	public void info(String message) {
		log.info(message);
	}
	
	public void warn(String message) {
		log.warn(message);
	}
	public void error(String message) {
		log.error(message);
	}
}
