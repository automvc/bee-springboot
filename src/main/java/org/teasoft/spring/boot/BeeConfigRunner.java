/*
 * Copyright 2016-2021 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * The license,see the LICENSE file.
 */

package com.automvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.teasoft.beex.config.ManageConfig;

/**
 * @author Kingstar
 * @since  1.9
 */
@Component
@Order(value = 1)
public class BeeConfigRunner implements ApplicationRunner {

	@Autowired
	ManageConfig manageConfig;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.err.println("---------BeeConfigRunner------");
		manageConfig.updateConfig();
	}

}
