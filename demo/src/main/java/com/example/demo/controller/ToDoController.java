package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ContentDTO;
import com.example.demo.service.ToDoService;

@RestController
@RequestMapping("")
public class ToDoController {
	
	@Autowired
    public ToDoService toDoService;
	
	
	/**
     * 새로운 게시물을 등록한다.
     * @param 
     * @return 
     */
    @PostMapping(value = "/write")
    public ResponseEntity<ContentDTO> save(ContentDTO contentDTO) {
        return new ResponseEntity<ContentDTO>(toDoService.save(contentDTO), HttpStatus.OK);
    }
}