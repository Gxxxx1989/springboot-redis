package com.guoxi.config

import org.springframework.context.annotation.Configuration
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 86400*30)
open class SessionConfig {
}