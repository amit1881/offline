package com.offline;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.offline.UrlRedirections;

public class MyHandler extends DefaultHandler {

	// List to hold Employees object
	private List<UrlRedirections> urlList = null;
	private UrlRedirections url = null;

	// getter method for employee list
	public List<UrlRedirections> getUrlList() {
		return urlList;
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {

		if (qName.equalsIgnoreCase("redirection")) {
			// create a old Url and put it in Map
			String oldurlname = attributes.getValue("oldUrl");
			// create a new Url and put it in Map
			String newurlname = attributes.getValue("newUrl");
			// initialize Employee object and set id attribute
			url = new UrlRedirections();
			url.setOldurl(oldurlname);
			url.setNewurl(newurlname);
			// initialize list
			if (urlList == null)
				urlList = new ArrayList<UrlRedirections>();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equalsIgnoreCase("redirection")) {
			// add url object to list
			urlList.add(url);
		}
	}

}
