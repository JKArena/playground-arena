/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.jhkt.playgroundArena.examples.generic.controller;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;

import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * @author Ji Hoon Kim
 */
@PropertySource("classpath:application.properties")
class BaseController {
	
	enum VIEW_KEYS {
		USER_LIST, USER
	};
	
	static final String ENVIRONMENT_MODEL_KEY = "env";
	
	@Inject
    Environment env;
	
	Map<String, Object> getBaseFields() {
		
		Map<String, Object> model = new HashMap<String, Object>();
    	model.put(ENVIRONMENT_MODEL_KEY, env);
		
    	return model;
	}
	
}