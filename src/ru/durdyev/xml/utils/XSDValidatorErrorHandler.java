/**
 * Developed by Ilya Durdyev
 * Website - http://durdyev.ru
 * GitHub - https://github.com/durdyev/
 * Skype - banjifun (with photo)
 * Email - i@durdyev.ru
 */
package ru.durdyev.xml.utils;

import java.util.List;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

/**
 * XML Error handler
 * 
 * @author Ilya Durdyev i@durdyev.ru http://durdyev.ru
 *
 */
public class XSDValidatorErrorHandler implements ErrorHandler {

	private List<Exception> exceptions;
	
	public XSDValidatorErrorHandler(List<Exception> exceptions) {
		this.exceptions = exceptions;
	}
	
	@Override
	public void error(SAXParseException exception) throws SAXException {
		exceptions.add(exception);
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		exceptions.add(exception);
	}

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		exceptions.add(exception);
	}
	
}
