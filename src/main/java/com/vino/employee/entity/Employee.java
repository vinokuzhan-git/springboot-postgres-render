package com.vino.employee.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {
  @Id 
  @GeneratedValue
  private Long id;
  private String name;
  private String department;
  // Getters and setters
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
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
@Override
public int hashCode() {
	return Objects.hash(department, id, name);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	return Objects.equals(department, other.department) && Objects.equals(id, other.id)
			&& Objects.equals(name, other.name);
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
}
  
  
}
