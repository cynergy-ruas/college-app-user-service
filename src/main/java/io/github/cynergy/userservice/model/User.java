package io.github.cynergy.userservice.model;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.ToString;


@ToString
@Document(collection="user")
public class User {
	
	 String id;
	 String reg_no;
	 String name;
	 String department;
	 int semester;
	 String section;
	 String email;
	 
	
	
	public User( @JsonProperty("reg_no") String reg_no, @JsonProperty("name") String name,
			@JsonProperty("department") String department, @JsonProperty("semester") int semester, @JsonProperty("section") String section, @JsonProperty("email") String email) {
		
		this.reg_no = reg_no;
		this.name = name;
		this.department=department;
		this.semester =semester;
		this.section = section;
		this.email = email;
		this.id= null;
	}
//
//	public UUID getId() {
//		return id;
//	}
//
//	public void setId(UUID id) {
//		this.id = id;
//	}

	public String getReg_no() {
		return reg_no;
	}

	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
