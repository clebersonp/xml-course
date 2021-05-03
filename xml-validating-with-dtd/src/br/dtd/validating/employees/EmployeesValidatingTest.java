package br.dtd.validating.employees;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class EmployeesValidatingTest {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setValidating(true);

		DocumentBuilder builder = dbf.newDocumentBuilder();

		Document document = builder.parse(new File("resources/employees.xml"));

		System.out.println(document);

	}

}
