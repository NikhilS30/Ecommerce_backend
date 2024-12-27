package com.startup.firstproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/say")
public class Controllers {

	@GetMapping("/hello/{name}/{times}")
	public String hello(@PathVariable("name") String holder_name, @PathVariable("times") int NoOfTimes) {

		String output = "";
		for (int i = 1; i <=NoOfTimes; i++) {
			output += "Hello_" + holder_name+"---------";
		}
		return output;
	}

	@GetMapping("/bye")
	public String bye() {
		return "Bye Everyone!";
	}

}
