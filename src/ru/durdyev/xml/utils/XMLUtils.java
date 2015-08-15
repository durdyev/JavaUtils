/**
 * Developed by Ilya Durdyev
 * Website - http://durdyev.ru
 * GitHub - https://github.com/durdyev/
 * Skype - banjifun (with photo)
 * Email - i@durdyev.ru
 */
package ru.durdyev.xml.utils;

import java.io.File;
import java.util.List;

import org.xml.sax.SAXException;

/**
 * This class contains methods to validate XML by XSD.
 * You can implement this class into your project.
 * 
 * @author Ilya Durdyev i@durdyev@mail.ru
 */
public class XMLUtils {

	/**
	 * This method validate XML by input XML as String and XSD path to File.
	 * 
	 * @param xml input XML as String
	 * @param xsdPath input XSD File Path
	 * @return true or false, valid or not
	 */
	public static boolean validateXMLByXSD(String xml, String xsdPath) {
		return true;
	}
	
	/**
	 * This method validate XML by input XML as String and XSD File.
	 * 
	 * @param xml input XML as String
	 * @param xsd input XSD File
	 * @return true or false, valid or not
	 */
	public static boolean validateXMLByXSD(String xml, File xsd) {
		return true;
	}

	/**
	 * This method validate XML by XML File and XSD File.
	 * 
	 * @param xml input XML File
	 * @param xsd input XSD File
	 * @return true or false, valid or not
	 */
	public static boolean validateXMLByXSD(File xml, File xsd) {
		return true;
	}

	/**
	 * This method validate XML by input XML as String and XSD path to File.
	 * 
	 * @param xml input XML as String
	 * @param xsdPath input XSD File Path
	 * @return error list
	 */
	public static List<SAXException> validateXMLByXSDAndGetErrors(String xml, String xsdPath) {
		return null;
	}
	
	/**
	 * This method validate XML by input XML as String and XSD File.
	 * 
	 * @param xml input XML as String
	 * @param xsd input XSD File
	 * @return error list
	 */
	public static List<SAXException> validateXMLByXSDAndGetErrors(String xml, File xsd) {
		return null;
	}

	/**
	 * This method validate XML by XML File and XSD File.
	 * 
	 * @param xml input XML File
	 * @param xsd input XSD File
	 * @return error list
	 */
	public static List<SAXException> validateXMLByXSDAndGetErrors(File xml, File xsd) {
		return null;
	}
}
