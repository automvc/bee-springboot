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

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author Kingstar
 * @since  2.1
 */
@Configuration
//@ConditionalOnProperty(prefix = "bee.db",name = "hasmongodb", havingValue = "true", matchIfMissing = false)//ok
@ConditionalOnProperty(name = "bee.db.hasMongodb", havingValue = "true", matchIfMissing = false)
@ImportResource("classpath:beeMongoContext.xml")
public class BeeMongoXmlConfiguration {
	
	public BeeMongoXmlConfiguration() {}

}
