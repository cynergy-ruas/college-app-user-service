package io.github.cynergy.userservice.model;

import org.springframework.data.annotation.AccessType;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.AccessType.Type;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import com.fasterxml.jackson.annotation.JsonProperty;


@Document(collection = "users")
public class User {

	@Id
	@AccessType(Type.PROPERTY)
	String id;

	@Field("reg_no")
	String regNo;

	String name;
	String department;
	int semester;
	String section;
	String email;

	public User(@JsonProperty("reg_no") String regNo, @JsonProperty("name") String name,
			@JsonProperty("department") String department, @JsonProperty("semester") int semester,
			@JsonProperty("section") String section, @JsonProperty("email") String email) {

		this.regNo = regNo;
		this.name = name;
		this.department = department;
		this.semester = semester;
		this.section = section;
		this.email = email;
		this.id = null;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegNo() {
		return regNo;
	}

	public void setRegNo(String regNo) {
		this.regNo = regNo;
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

	public void updateFrom(User user) {
		if (user.regNo != null) {
			this.setRegNo(user.regNo);
		}

		if (user.name != null) {
			this.setName(user.name);
		}

		if (user.department != null) {
			this.setDepartment(user.department);
		}

		if (user.semester != 0) {
			this.setSemester(user.semester);
		}

		if (user.section != null) {
			this.setSection(user.section);
		}

		if (user.email != null) {
			this.setEmail(user.email);
		}
	}
}
