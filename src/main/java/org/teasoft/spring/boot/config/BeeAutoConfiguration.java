/*
 * Copyright 2016-2021 the original author.All rights reserved.
 * Kingstar(honeysoft@126.com)
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.teasoft.spring.boot.config;

import javax.sql.DataSource;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.teasoft.honey.osql.core.BeeFactory;
import org.teasoft.honey.osql.core.SessionFactory;

/**
 * @author Kingstar
 * @since  1.9
 */
@Configuration
@AutoConfigureAfter({ BeeManageConfig.class, DataSourceAutoConfiguration.class, BeeXmlConfiguration.class })
public class BeeAutoConfiguration {

	public BeeAutoConfiguration() {}

	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnSingleCandidate(DataSource.class)
	public BeeFactory beeFactory(DataSource dataSource) {
		BeeFactory beeFactory = BeeFactory.getInstance();
		beeFactory.setDataSource(dataSource);
		return beeFactory;
	}

	@Bean
	@ConditionalOnMissingBean
	@ConditionalOnBean(BeeFactory.class)
	public SessionFactory sessionFactory(BeeFactory beeFactory) {
		SessionFactory factory = new SessionFactory();
		factory.setBeeFactory(beeFactory);
		return factory;
	}

}
