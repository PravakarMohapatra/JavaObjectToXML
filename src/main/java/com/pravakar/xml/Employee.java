package com.pravakar.xml;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@XmlRootElement
@Data

public class Employee {
	
	@XmlTransient
	private int empId;
	private String empName;
	private String loc;
	

}
