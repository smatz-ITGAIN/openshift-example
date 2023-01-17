package de.itgain.openshift;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

	@GetMapping(value = "/hello")
	public String hello() {
		return "Hello Example from ExampleController";
	}

}
