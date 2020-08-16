package org.bottomhalf.ec.reports.modelVO;

import java.io.Serializable;

public class VendorReportPdf implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	public VendorReportPdf() {
		super();
	}

	public String vendorId;

	public String getVendorId() {
		return vendorId;
	}

	public void setVendorId(String vendorId) {
		this.vendorId = vendorId;
	}

}
