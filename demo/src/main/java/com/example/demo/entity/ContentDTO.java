package com.example.demo.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name="content")
public class ContentDTO {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // MySQL의 AUTO_INCREMENT를 사용
	private Long id;
	
	private String name;
	private String content;
	private String isComplete;
	
	@CreationTimestamp
	private LocalDateTime created;
	
	@Builder
    public ContentDTO(Long id, String name, String content, String isComplete, LocalDateTime created) {
		this.id = id;
		this.name = name;
		this.content = content;
		this.isComplete = isComplete;
		this.created = created;
	}
}
