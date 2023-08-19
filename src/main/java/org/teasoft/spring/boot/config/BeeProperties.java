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

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.teasoft.beex.config.BeePro;
import org.teasoft.beex.config.BeeProCache;
import org.teasoft.beex.config.BeeProCacheRedis;
import org.teasoft.beex.config.BeeProDb;
import org.teasoft.beex.config.BeeProGenid;
import org.teasoft.beex.config.BeeProMoreTable;
import org.teasoft.beex.config.BeeProMultiDS;
import org.teasoft.beex.config.BeeProNaming;
import org.teasoft.beex.config.BeeProPearFlowerId;
import org.teasoft.beex.config.BeeProProfiles;
import org.teasoft.beex.config.BeeProReturnStringList;
import org.teasoft.beex.config.BeeProSelectJson;
import org.teasoft.beex.config.BeeProSharding;
import org.teasoft.beex.config.BeeProShowSql;

/**
 * @author Kingstar
 * @since  1.9
 */
@Configuration
public class BeeProperties {

	@Bean
	@ConditionalOnClass(BeePro.class)
	@ConfigurationProperties(prefix = "bee.osql")
	public BeePro getBeePro() {
		return new BeePro();
	}

	@Bean
	@ConditionalOnClass(BeeProCache.class)
	@ConfigurationProperties(prefix = "bee.osql.cache")
	public BeeProCache getBeeProCache() {
		return new BeeProCache();
	}
	
	@Bean
	@ConditionalOnClass(BeeProCacheRedis.class)
	@ConfigurationProperties(prefix = "bee.osql.cache-redis")
	public BeeProCacheRedis getBeeProCacheRedis() {
		return new BeeProCacheRedis();
	}

	@Bean
	@ConditionalOnClass(BeeProDb.class)
	@ConfigurationProperties(prefix = "bee.db")
	public BeeProDb getBeeProDb() {
		return new BeeProDb();
	}
	
	@Bean
	@ConditionalOnClass(BeeProProfiles.class)
	@ConfigurationProperties(prefix = "bee.profiles")
	public BeeProProfiles getBeeProProfiles() { //V1.11
		return new BeeProProfiles();
	}

	@Bean
	@ConditionalOnClass(BeeProGenid.class)
	@ConfigurationProperties(prefix = "bee.distribution.genid")
	public BeeProGenid getBeeProGenid() {
		return new BeeProGenid();
	}

	@Bean
	@ConditionalOnClass(BeeProMoreTable.class)
	@ConfigurationProperties(prefix = "bee.osql.more-table")
	public BeeProMoreTable getBeeProMoreTable() {
		return new BeeProMoreTable();
	}

	@Bean
	@ConditionalOnClass(BeeProMultiDS.class)
	@ConfigurationProperties(prefix = "bee.dosql.multi-d-s")
	public BeeProMultiDS getBeeProMultiDS() {
		return new BeeProMultiDS();
	}
	
	@Bean
	@ConditionalOnClass(BeeProSharding.class)
	@ConfigurationProperties(prefix = "bee.dosql.sharding")
	public BeeProSharding getBeeProSharding() {
		return new BeeProSharding();
	}
	
	@Bean
	@ConditionalOnClass(BeeProNaming.class)
	@ConfigurationProperties(prefix = "bee.osql.naming")
	public BeeProNaming getBeeProNaming() {
		return new BeeProNaming();
	}

	@Bean
	@ConditionalOnClass(BeeProPearFlowerId.class)
	@ConfigurationProperties(prefix = "bee.distribution.pear-flower-id")
	public BeeProPearFlowerId getBeeProPearFlowerId() {
		return new BeeProPearFlowerId();
	}

	@Bean
	@ConditionalOnClass(BeeProReturnStringList.class)
	@ConfigurationProperties(prefix = "bee.osql.return-string-list")
	public BeeProReturnStringList getBeeProReturnStringList() {
		return new BeeProReturnStringList();
	}

	@Bean
	@ConditionalOnClass(BeeProSelectJson.class)
	@ConfigurationProperties(prefix = "bee.osql.select-json")
	public BeeProSelectJson getBeeProSelectJson() {
		return new BeeProSelectJson();
	}

	@Bean
	@ConditionalOnClass(BeeProShowSql.class)
	@ConfigurationProperties(prefix = "bee.osql.show-sql")
	public BeeProShowSql getBeeProShowSql() {
		return new BeeProShowSql();
	}
	
	@Bean
	@ConditionalOnClass(SpringDatasourceConfig.class)
	@ConfigurationProperties(prefix = "spring.datasource")
	public SpringDatasourceConfig getSpringDatasourceConfig() {
		return new SpringDatasourceConfig();
	}

}
