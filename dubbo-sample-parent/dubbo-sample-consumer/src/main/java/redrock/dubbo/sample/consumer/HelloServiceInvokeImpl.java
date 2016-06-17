package redrock.dubbo.sample.consumer;

import org.springframework.stereotype.Service;

import redrock.dubbo.sample.api.HelloService;

import com.alibaba.dubbo.config.annotation.Reference;

@Service("helloServiceInvoke")
public class HelloServiceInvokeImpl implements HelloServiceInvoke {

	//@Autowired
	@Reference
	HelloService helloService;

	@Override
	public void printHello() {
		System.out.println("consumer:" + helloService.sayHello("chenglong"));
	}
}
