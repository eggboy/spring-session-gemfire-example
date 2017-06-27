package io.pivotal.sample.gemfire.sessiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@SpringBootApplication
public class SessionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SessionDemoApplication.class, args);
	}
}

@RestController
class GeodeRestController {

	@RequestMapping("/gemfire/session")
	public String hello(HttpSession session) {

		String sessionId = (String) session.getAttribute("sessionId");
		if (sessionId == null) {
			sessionId = session.getId();
		}
		session.setAttribute("sessionId", sessionId);
		return sessionId;
	}
}
