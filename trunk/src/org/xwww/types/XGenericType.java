package org.xwww.types;

import java.io.BufferedInputStream;

public abstract class XGenericType {

	protected String value = "";
	
	public String getName() {
		return name;
	}

	private String name = "(No assigned)";
	
	
	public XGenericType( String nameParam) {
		this.name = nameParam;
	}
	
	public abstract void getDataFromStream(BufferedInputStream inputStream);
	
	
	public String getValue() {
		return value;
	}

	public String getNameType() {
		
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}
	
	

}
