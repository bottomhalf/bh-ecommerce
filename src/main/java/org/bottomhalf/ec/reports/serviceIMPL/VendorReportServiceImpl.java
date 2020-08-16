package org.bottomhalf.ec.reports.serviceIMPL;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bottomhalf.ec.reports.modelVO.VendorReportPdf;
import org.bottomhalf.ec.reports.service.VendorReportServiceIF;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

@Service
public class VendorReportServiceImpl  implements VendorReportServiceIF{
	
	private static final Logger log = LoggerFactory.getLogger(VendorReportServiceImpl.class);
	
	@Autowired
	Environment env;

	@Override
	public ByteArrayInputStream generateProductPdfReport(VendorReportPdf vendorPdfReportObj, HttpServletRequest request,
			HttpServletResponse response) {
		log.info("Inside generateProductPdfReport() method"); 
		Document document = new Document();
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		try {
			


				PdfPTable table = new PdfPTable(3);
				table.setWidthPercentage(60);
				table.setWidths(new int[] { 1, 3, 3 });

				Font headFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD);

				PdfPCell hcell;
				hcell = new PdfPCell(new Phrase("Id", headFont));
				hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(hcell);

				hcell = new PdfPCell(new Phrase("Name", headFont));
				hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(hcell);

				hcell = new PdfPCell(new Phrase("Population", headFont));
				hcell.setHorizontalAlignment(Element.ALIGN_CENTER);
				table.addCell(hcell);

				

					PdfPCell cell;

					cell = new PdfPCell(new Phrase("1"));
					cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell.setHorizontalAlignment(Element.ALIGN_CENTER);
					table.addCell(cell);

					cell = new PdfPCell(new Phrase("IND"));
					cell.setPaddingLeft(5);
					cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell.setHorizontalAlignment(Element.ALIGN_LEFT);
					table.addCell(cell);

					cell = new PdfPCell(new Phrase("20"));
					cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
					cell.setHorizontalAlignment(Element.ALIGN_RIGHT);
					cell.setPaddingRight(5);
					table.addCell(cell);
			

				PdfWriter.getInstance(document, out);
				document.open();
				document.add(table);

				document.close();

			} catch (DocumentException ex) {

				log.error("", ex);
			}

			return new ByteArrayInputStream(out.toByteArray());
		
	}
	
	

}
