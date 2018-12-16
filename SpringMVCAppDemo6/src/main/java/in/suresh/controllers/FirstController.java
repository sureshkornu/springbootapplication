package in.suresh.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller

public class FirstController {

	@RequestMapping(method = RequestMethod.GET, value = "/first")
	public String doSomeWork() {
		System.out.println("doSomeWork().......");
		
		return "one";
	}

}
