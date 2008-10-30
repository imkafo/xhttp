package org.xwww.types;

import java.io.IOException;

import com.jcraft.weirdx.IO;

public abstract class XGenericType {

	
	protected String value; 
	
	private String name = "(No assigned)";
	
	
	public XGenericType( String nameParam) {
		this.name = nameParam;
	}
	
	public abstract void getDataFromStream(IO io) throws IOException;
	
	public String getNameType() {
		
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}

	public String getValue() {
		return value;
	}

	public Integer getValueInt() {
		return Integer.parseInt( value );
	}

}
