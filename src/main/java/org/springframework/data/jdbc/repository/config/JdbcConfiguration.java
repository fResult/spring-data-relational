/*
 * Copyright 2017-2018 the original author or authors.
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
package org.springframework.data.jdbc.repository.config;

import java.util.Optional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.relational.core.mapping.ConversionCustomizer;
import org.springframework.data.relational.core.mapping.RelationalMappingContext;
import org.springframework.data.relational.core.mapping.NamingStrategy;

/**
 * Beans that must be registered for Spring Data JDBC to work.
 *
 * @author Greg Turnquist
 * @author Jens Schauder
 * @since 1.0
 */
@Configuration
public class JdbcConfiguration {

	@Bean
	RelationalMappingContext jdbcMappingContext(Optional<NamingStrategy> namingStrategy,
			Optional<ConversionCustomizer> conversionCustomizer) {

		return new RelationalMappingContext(namingStrategy.orElse(NamingStrategy.INSTANCE),
				conversionCustomizer.orElse(ConversionCustomizer.NONE));
	}
}
