package com.zhanbq.performanceoptimazation.CH4.javatuning.ch4.prodcom;

public final class PCData {
	private  final int intData;
	public PCData(int d){
		intData=d;
	}
	public PCData(String d){
		intData=Integer.valueOf(d);
	}
	public int getData(){
		return intData;
	}
	@Override
	public String toString(){
		return "data:"+intData;
	}
}
