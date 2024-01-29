package mw.course.sonarqube;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class SonarqubeApplicationTests {

	/*@Mock
	Printer printer;*/

	@Autowired
	Printer printer;

	@Test
	void printerShouldReturnTrue() throws InterruptedException {
		//given
		boolean isPrinted;

		//when
		isPrinted = printer.printMe();

		//then
		assertThat(isPrinted).isTrue();
	}

}
