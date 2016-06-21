package redrock.dubbo.sample.provider;

import org.springframework.stereotype.Service;

import redrock.dubbo.sample.api.HelloService;

@Service("helloService")
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("provider1:welcome " + name);
		return "welcome " + name + " from provider1";
	}

}
