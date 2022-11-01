package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ContentDTO;
import com.example.demo.repository.ToDoRepository;

@Service
public class ToDoService {
	@Autowired
    private ToDoRepository toDoRepository;
	
	/** 컨텐츠 정보를 저장한다. */
	public ContentDTO save(ContentDTO content) {
		toDoRepository.save(content);
        return content;
    }
}
