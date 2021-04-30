package br.xml.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "employees")
@XmlType(propOrder = { "employees" })
@XmlAccessorType(XmlAccessType.FIELD)
public class Employees implements Serializable {

	private static final long serialVersionUID = 1L;

	@XmlElement(name = "employee")
	private List<Employee> employees = new ArrayList<>();

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	@Override
	public String toString() {
		return String.format("Employees [employees=%s]", employees);
	}
}
