package com.demo.module1.api;



import com.demo.module1.model.Message;
import com.demo.module1.service.TestService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {

	private TestService testService;

	public TestController(TestService testService) {
	    this.testService = testService;
    }

	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value="/test/get/json", method=RequestMethod.GET, produces="application/json")
	public @ResponseBody List<Message> testGetJson() {
	    return this.testService.test();
	}
}
