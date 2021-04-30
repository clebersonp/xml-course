package br.xml;

import java.io.File;
import java.math.BigDecimal;
import java.util.Arrays;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import br.xml.model.Employee;
import br.xml.model.Employees;

public class TestMarshallerEmployees {

	public static void main(String[] args) throws JAXBException {

		Employee emp1 = new Employee(105L, "Cleberson", "Pauluci", new BigDecimal("4000"));
		Employee emp2 = new Employee(106L, "Bruna", "Pauluci", new BigDecimal("8000"));
		Employee emp3 = new Employee(107L, "Melissa", "Pauluci", new BigDecimal("6000"));

		Employees employees = new Employees();
		employees.setEmployees(Arrays.asList(emp1, emp2, emp3));

		JAXBContext context = JAXBContext.newInstance(Employee.class);
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(emp1, new File("resources/newEmployee.xml"));

		context = JAXBContext.newInstance(Employees.class);
		marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(employees, new File("resources/newEmployees.xml"));

	}

}
