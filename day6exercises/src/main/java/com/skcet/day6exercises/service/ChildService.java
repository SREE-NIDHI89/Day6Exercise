package com.skcet.day6exercises.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.skcet.day6exercises.entity.ChildEntity;
import com.skcet.day6exercises.repository.ChildRepository;



@Service
public class ChildService {
	
	@Autowired
	private ChildRepository childRepository;
	
	
	public ChildEntity saveChild(ChildEntity c) {
		return childRepository.save(c);
	}
	
	//Pagination and Sorting
	
	public Page<ChildEntity> getChildByField(String field,int pageNo,int pageSize){
		Sort sort=Sort.by(field);
		Pageable pageable=PageRequest.of(pageNo, pageSize, sort);
		return childRepository.findAll(pageable);
	}
}
