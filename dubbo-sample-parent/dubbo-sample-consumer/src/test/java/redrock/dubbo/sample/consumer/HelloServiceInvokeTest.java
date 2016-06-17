package redrock.dubbo.sample.consumer;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class HelloServiceInvokeTest extends BaseTest {
	
	@Autowired
	HelloServiceInvoke helloServiceInvoke;

	@Test
	public void testPrintHello() {
		try {
			helloServiceInvoke.printHello();
			Thread.sleep(9000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
