package com.krantitech.interview;


import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

	static List<String> ls =Arrays.asList("hello","world","java","angular");
	
	@GetMapping("/getList/{str}")
	List<String> getall(@PathVariable String str){
		if(ls.contains(str)) {
			return ls;	
		}
		return null;
		
	}
	
	@PostMapping("/addToList")
	void add(@RequestBody String str){
		
		ls.add(str);
		
	}
	
	
	@DeleteMapping("/getList/{str}")
	void deleteList(@PathVariable String str){
		if(ls.contains(str)) {
			ls.remove(str);
		}
		
	}

	@PutMapping("/updateList/{str}")
	void updatelist(@PathVariable String str){
		
		if(ls.contains(str)) {
			ls.add("new val");
		}
		
		
	}
	
	
}

