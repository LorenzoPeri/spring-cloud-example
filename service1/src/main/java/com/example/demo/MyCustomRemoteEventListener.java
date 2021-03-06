package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class MyCustomRemoteEventListener implements ApplicationListener<MyCustomRemoteEvent> {
	private static final Logger logger = LoggerFactory.getLogger(MyCustomRemoteEventListener.class);

	@Override
	public void onApplicationEvent(MyCustomRemoteEvent myCustomRemoteEvent) {
		logger.info("Received MyCustomRemoteEvent - message: " + myCustomRemoteEvent.getMessage());
	}
}
