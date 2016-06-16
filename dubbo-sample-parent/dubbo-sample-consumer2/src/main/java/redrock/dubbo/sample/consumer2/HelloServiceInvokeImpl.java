package redrock.dubbo.sample.consumer2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import redrock.dubbo.sample.api.HelloService;

@Service("helloServiceInvoke")
public class HelloServiceInvokeImpl implements HelloServiceInvoke {

	@Autowired
	HelloService helloService;

	@Override
	public void printHello() {
		System.out.println("consumer:" + helloService.sayHello("chenglong"));
	}
}
