package br.xml.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "employee")
@XmlType(propOrder = { "id", "firstName", "lastName", "salary" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "employee_id")
	private Long id;

	@XmlElement(name = "first_name")
	private String firstName;

	@XmlElement(name = "last_name")
	private String lastName;

	@XmlElement(name = "salary")
	private BigDecimal salary;

	public Employee() {
	}

	public Employee(Long id, String firstName, String lastName, BigDecimal salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return String.format("Employee [id=%s, firstName=%s, lastName=%s]", id, firstName, lastName);
	}

}
