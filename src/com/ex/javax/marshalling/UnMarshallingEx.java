package com.ex.javax.marshalling;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.ex.javax.marshalling.model.Employee;

public class UnMarshallingEx {

	public static void main(String[] args) throws JAXBException, JsonGenerationException, JsonMappingException, IOException {
		
		JAXBContext contextObject=JAXBContext.newInstance(Employee.class);
		
		Unmarshaller xmlToObj=contextObject.createUnmarshaller();
		File file=new File("employee.xml");
		
		Employee employee= (Employee) xmlToObj.unmarshal(file);
		
		ObjectMapper objectMapper=new ObjectMapper();
		
		String json=objectMapper.writeValueAsString(employee);
		System.out.println(json);
		
		
	}

}
