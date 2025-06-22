package com.as.test;
import com.as.factory_concrete_methods.*;
import com.as.factory_methods.*;
import com.as.models.*;

public class FactoryMethodTest {
	
	    public static void main(String[] args) {
	      try {
	    	// Creating Word Document
	        DocumentFactory wordFactory = new WordDocumentFactory();
	        Document wordDoc = wordFactory.createDocument();
	        Thread.sleep(1000);
	        System.out.println("It is a Word Document.....");
	        wordDoc.open();
	        Thread.sleep(500);
	        wordDoc.save();
	        Thread.sleep(500);
	        wordDoc.close();
	        Thread.sleep(2000);

	        // Creating PDF Document
	        DocumentFactory pdfFactory = new PdfDocumentFactory();
	        Document pdfDoc = pdfFactory.createDocument();
	        System.out.println("It is a PDF Document.....");
	        pdfDoc.open();
	        Thread.sleep(500);
	        pdfDoc.save();
	        Thread.sleep(500);
	        pdfDoc.close();
	        Thread.sleep(2000);

	        // Creating Excel Document
	        DocumentFactory excelFactory = new ExcelDocumentFactory();
	        Document excelDoc = excelFactory.createDocument();
	        System.out.println("It is an Excel Document.....");
	        excelDoc.open();
	        Thread.sleep(500);
	        excelDoc.save();
	        Thread.sleep(500);
	        excelDoc.close();
	        Thread.sleep(2000);
	        
	      }catch(InterruptedException e) {
	    	  System.err.println("Sleep delay is interrupted!...");
	    	  e.printStackTrace();
	      }
	   }
}


