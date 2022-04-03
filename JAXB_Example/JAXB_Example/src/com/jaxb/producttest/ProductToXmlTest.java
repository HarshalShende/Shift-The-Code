package com.jaxb.producttest;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class ProductToXmlTest {
	private static Product product;

	public static void main(String[] args) throws JAXBException {
		long l = 10;
		Long longId = new Long(l);
		File file = new File("C:\\xml\\product.xml");
		User user = new User(longId, "Ramu", "ramu@mycompany.com");
		product = new Product("PO1", "Ram Kumar",
				"https://mycompany.guru/ramu.jpg",
				new BigDecimal(18.95), user);
		JAXBContext jaxbContext = JAXBContext.newInstance(Product.class);
		Marshaller marshaller = jaxbContext.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(product, file);
		marshaller.marshal(product, System.out);
	}
}
