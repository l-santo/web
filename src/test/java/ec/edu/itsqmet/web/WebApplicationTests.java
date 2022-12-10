package ec.edu.itsqmet.web;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import ec.edu.itsqmet.web.repository.IWebRepository;

@SpringBootTest
class WebApplicationTests {
	@Autowired
	private IWebRepository webRepository;

	@Test
	void contextLoads() {
		System.out.println(webRepository.count());
	}

}
