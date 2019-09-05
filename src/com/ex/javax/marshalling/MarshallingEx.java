package com.ex.javax.marshalling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import com.ex.javax.marshalling.model.Employee;

public class MarshallingEx {

	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext contextObject = JAXBContext.newInstance(Employee.class);
		Marshaller marshallerObj = contextObject.createMarshaller();
		marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		Employee employee = new Employee(1, "name", "location", "project");
		marshallerObj.marshal(employee, new FileOutputStream("employee.xml"));

		StringWriter writer = new StringWriter();
		marshallerObj.marshal(employee, writer);
		System.out.println(writer.toString());

	}

}
