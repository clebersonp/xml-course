package br.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import br.xml.model.Employee;
import br.xml.model.Employees;

public class TestUnmarshallerEmployees {

	public static void main(String[] args) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Employees.class);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		Employees employees = (Employees) unmarshaller.unmarshal(new File("resources/employees.xml"));
		System.out.println("Employees:");
		employees.getEmployees().forEach(System.out::println);

		context = JAXBContext.newInstance(Employee.class);
		unmarshaller = context.createUnmarshaller();
		Employee employee = (Employee) unmarshaller.unmarshal(new File("resources/employee.xml"));
		System.out.println("\nEmployee:");
		System.out.println(employee);

	}

}
