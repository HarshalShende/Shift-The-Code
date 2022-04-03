package com.jaxb.producttest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class XMLToProduct {
	private static Product product;

	public static void main(String[] args) throws JAXBException {
		   File file = new File("E:\\XML WEBSERVICES\\JAXB_Example\\JAXB_Example\\product.xml");
	        JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
	        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
	        product = (Product) unmarshaller.unmarshal(file);
	        System.out.println(product);
	}
}
