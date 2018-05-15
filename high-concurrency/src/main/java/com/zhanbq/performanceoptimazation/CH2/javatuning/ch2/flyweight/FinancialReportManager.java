package com.zhanbq.performanceoptimazation.CH2.javatuning.ch2.flyweight;

public class FinancialReportManager implements IReportManager {
	protected String tenantId=null;
	public FinancialReportManager(String tenantId){
		this.tenantId=tenantId;
	}
	@Override
	public String createReport() {
		return "This is a financial report";
	}
}
