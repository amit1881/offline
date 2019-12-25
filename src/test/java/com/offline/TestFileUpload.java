package com.offline;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

public class TestFileUpload {

	String filePath="";
	
	@Test
	public void testFileUpload() throws AWTException{
		
		StringSelection str=new StringSelection(filePath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		uploadFile();
	}

	private void uploadFile() throws AWTException {
		// TODO Auto-generated method stub
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}
	
}
