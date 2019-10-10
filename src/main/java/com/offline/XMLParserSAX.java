package com.offline;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import com.offline.UrlRedirections;

public class XMLParserSAX {

	public static void main(String[] args) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
		try {
			SAXParser saxParser = saxParserFactory.newSAXParser();
			MyHandler handler = new MyHandler();
			saxParser.parse(new File("C:/Users/Amit Singh/Downloads/redirections.xml"), handler);
			// Get Employees list
			List<UrlRedirections> urlList = handler.getUrlList();
			// print employee information
			for (UrlRedirections url : urlList){
				System.out.println(url.getOldurl()+"-----"+url.getNewurl());
			}
				
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
		}
	}

}
