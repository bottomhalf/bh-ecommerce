package org.bottomhalf.ec.reports.controller;

import java.io.ByteArrayInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bottomhalf.ec.reports.modelVO.VendorReportPdf;
import org.bottomhalf.ec.reports.serviceIMPL.VendorReportServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendor/reports")
public class VendorReportsController {
	
	private static final Logger log = LoggerFactory.getLogger(VendorReportsController.class);
	
	@Autowired
	VendorReportServiceImpl vendorReportService;
	
	@RequestMapping(value="/productDetailsPdf", method = RequestMethod.GET,
			produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<InputStreamResource> generateVendorProductPDF(@RequestBody VendorReportPdf vendorReportObject,
			HttpServletRequest request, HttpServletResponse response){
		ByteArrayInputStream reportPdf = null;
		if(null !=vendorReportObject) {
			 reportPdf= vendorReportService.generateProductPdfReport(vendorReportObject, request, response);
		}
		 HttpHeaders headers = new HttpHeaders();
	        headers.add("Content-Disposition", "inline; filename=citiesreport.pdf");

	        return ResponseEntity
	                .ok()
	                .headers(headers)
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(new InputStreamResource(reportPdf));
				
	}

}
