package com.skcet.day6exercises.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.skcet.day6exercises.entity.ChildEntity;
import com.skcet.day6exercises.service.ChildService;



@RestController
@RequestMapping("/apichild")
public class ChildController {
	@Autowired
	private ChildService childService;
	
	@PostMapping(path="/savechild")
	public ChildEntity saveChilld(@RequestBody ChildEntity c) {
		return childService.saveChild(c);
	}
	
	//Pagination and Sorting
	
	@GetMapping(path="/getpage")
	public ResponseEntity<Page<ChildEntity>> getChildByField(@RequestParam String field,@RequestParam int pageNo,@RequestParam int pageSize){
		Page<ChildEntity> children=childService.getChildByField(field, pageNo, pageSize);
		return ResponseEntity.ok(children);
	}
}
