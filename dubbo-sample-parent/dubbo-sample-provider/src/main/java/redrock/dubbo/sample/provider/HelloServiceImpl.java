package redrock.dubbo.sample.provider;

import com.alibaba.dubbo.config.annotation.Service;

import redrock.dubbo.sample.api.HelloService;

@Service
//@org.springframework.stereotype.Service
public class HelloServiceImpl implements HelloService {

	@Override
	public String sayHello(String name) {
		System.out.println("dubbo-sample-provider:welcome " + name);
		return "welcome " + name;
	}

}
