package com.java;

import org.springframework.stereotype.Component;

@Component
public class SnapDragon implements MobileProcessor {

	public void processor() {
		System.out.println("World's  Best Processor.....");
	}

}
