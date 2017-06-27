package io.pivotal.sample.gemfire.sessiondemo.config;

import org.springframework.context.annotation.ImportResource;
import org.springframework.session.data.gemfire.config.annotation.web.http.EnableGemFireHttpSession;

/**
 * Created by leec43 on 6/27/17.
 */
@EnableGemFireHttpSession
@ImportResource(value = "gemfire-session-client.xml")
@SuppressWarnings("unused")
public class GemFireCacheClientXmlConfiguration {
}
