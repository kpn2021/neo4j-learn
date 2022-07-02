package cn.kpn.demoneo4jspringdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoNeo4jSpringDataApplicationTests {

	@Autowired
	MovieRepository movieRepository;

	@Test
	void contextLoads() {

		System.err.println(movieRepository.findOneByTitle("Jerry Maguire"));
	}

}
