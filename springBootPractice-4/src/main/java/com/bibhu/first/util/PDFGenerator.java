package com.bibhu.first.util;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import com.bibhu.first.entities.Reservation;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFGenerator {

	public void generateItinary(Reservation reservation, String filePath) {
		Document document = new Document();
		try {
			PdfWriter.getInstance(document, new FileOutputStream(filePath));
			document.open();
			document.add(new PdfPTable(2));
			document.close();
		} catch (FileNotFoundException | DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private PdfPTable generatePdf() {
		PdfPTable table=new PdfPTable(2);
		PdfPCell cell;
		cell = new PdfPCell(new Phrase("flight Itinary"));
		cell.setColspan(2);
		table.addCell(cell);
			return table;
	}
}
