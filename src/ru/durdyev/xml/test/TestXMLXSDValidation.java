package ru.durdyev.xml.test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.xml.sax.SAXException;

import ru.durdyev.xml.utils.XMLUtils;

public class TestXMLXSDValidation {

	public static void main(String[] args) {
		try {
			Logger log = Logger.getLogger(TestXMLXSDValidation.class.toString());
			List<Exception> exceptions = XMLUtils
					.validateXMLByXSDAndGetErrors(new File("src/ru/durdyev/xml/xsd/user.xml"), 
							new File("src/ru/durdyev/xml/xsd/user.xsd"));
			
			String xmlErrors = "\n";
			for (Exception e : exceptions) {
				xmlErrors += "XML Error: " + e.getMessage() + "\n";
			}
			log.log(Level.INFO, xmlErrors);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
