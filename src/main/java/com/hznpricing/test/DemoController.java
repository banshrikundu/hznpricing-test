package com.hznpricing.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	 @GetMapping("/test")
	  String getTest() {
	    return "Calling Test REST API";
	  }
	 
}
