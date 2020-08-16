package org.bottomhalf.ec.reports.service;

import java.io.ByteArrayInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.bottomhalf.ec.reports.modelVO.VendorReportPdf;
import org.springframework.core.io.InputStreamResource;

public interface VendorReportServiceIF {
	
	public ByteArrayInputStream generateProductPdfReport(VendorReportPdf vendorPdfReportObj, HttpServletRequest request,
			HttpServletResponse response);

}
