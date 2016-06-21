package redrock.dubbo.sample.consumer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceInvokeTest extends BaseTest {

	@Autowired
	HelloServiceInvoke helloServiceInvoke;

	@Test
	public void testPrintHello() {
		try {
			for (int i = 1; i <= 10; i++)
				helloServiceInvoke.printHello();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
