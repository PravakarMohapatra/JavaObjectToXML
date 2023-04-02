package com.pravakar.xml;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class JavaToXml {

	public static void main(String[] args) {
		
		try {
			Employee employee = new Employee();
			employee.setEmpId(101);
			employee.setEmpName("Suraj");
			employee.setLoc("Hyderabad");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Employee.class);
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			File file = new File("C:\\Users\\HP\\Desktop\\xml_docs\\employee.xml");
			
			marshaller.marshal(employee, file );
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
