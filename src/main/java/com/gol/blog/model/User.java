package com.gol.blog.model;

import java.sql.Timestamp;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class User {
	@Id // Primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) //프로젝트에서 연결한 데이타베이스의 규칙을 따라간다.
	private int id;
	@Column(nullable = false, length=30)
	private String username;
	@Column(nullable = false, length=100) //나중에 해쉬로 해서 암호화예정
	private String password;
	@Column(nullable = false, length=50)
	private String email;
	@ColumnDefault("'user'")
	private String role; // 나중에는 Enum을 사용하는게 좋다.
	
	@CreationTimestamp //시간 자동 입력
	private Timestamp createDate;
	
}
