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

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
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
import org.teasoft.beex.config.ManageConfig;

/**
 * @author Kingstar
 * @since  1.9
 */
@AutoConfigureAfter(BeeProperties.class)
public class BeeManageConfig {
	@Autowired
	private BeePro beePro;
	@Autowired
	private BeeProCache beeProCache;
	@Autowired
	private BeeProCacheRedis beeProCacheRedis;
	@Autowired
	private BeeProDb beeProDb;
	@Autowired
	private BeeProProfiles beeProProfiles; //V1.11
	@Autowired
	private BeeProGenid beeProGenid;
	@Autowired
	private BeeProMoreTable beeProMoreTable;
	@Autowired
	private BeeProMultiDS beeProMultiDS;
	@Autowired
	private BeeProSharding beeProSharding; //V2.0
	@Autowired
	private BeeProNaming beeProNaming;
	@Autowired
	private BeeProPearFlowerId beeProPearFlowerId;
	@Autowired
	private BeeProReturnStringList beeProReturnStringList;
	@Autowired
	private BeeProSelectJson beeProSelectJson;
	@Autowired
	private BeeProShowSql beeProShowSql;
	
	@Bean
	@ConditionalOnClass(ManageConfig.class)
	public ManageConfig manageConfig() {
		
		ManageConfig manageConfig1=new ManageConfig();
		
		manageConfig1.setBeePro(beePro);
		manageConfig1.setBeeProCache(beeProCache);
		manageConfig1.setBeeProCacheRedis(beeProCacheRedis);
		manageConfig1.setBeeProDb(beeProDb);
		manageConfig1.setBeeProProfiles(beeProProfiles); //V1.11
		manageConfig1.setBeeProGenid(beeProGenid);
		manageConfig1.setBeeProMoreTable(beeProMoreTable);
		manageConfig1.setBeeProMultiDS(beeProMultiDS);
		manageConfig1.setBeeProSharding(beeProSharding);
		manageConfig1.setBeeProNaming(beeProNaming);
		manageConfig1.setBeeProPearFlowerId(beeProPearFlowerId);
		manageConfig1.setBeeProReturnStringList(beeProReturnStringList);
		manageConfig1.setBeeProSelectJson(beeProSelectJson);
		manageConfig1.setBeeProShowSql(beeProShowSql);
		
		manageConfig1.updateConfig();
		
		return manageConfig1;
	}

}
