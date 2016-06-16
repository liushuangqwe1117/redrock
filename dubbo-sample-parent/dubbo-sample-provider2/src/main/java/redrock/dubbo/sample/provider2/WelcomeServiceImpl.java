package redrock.dubbo.sample.provider2;

import redrock.dubbo.sample.api.WelcomeService;

public class WelcomeServiceImpl implements WelcomeService {

	@Override
	public String sayHello(String name) {
		System.out.println("dubbo-sample-provider2:welcome2 " + name);
		return "welcome2 " + name;
	}

}
