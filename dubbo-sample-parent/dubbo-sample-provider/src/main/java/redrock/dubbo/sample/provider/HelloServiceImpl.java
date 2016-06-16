package redrock.dubbo.sample.provider;

import redrock.dubbo.sample.api.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("dubbo-sample-provider:welcome " + name);
		return "welcome " + name;
	}

}
