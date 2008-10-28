package org.xwww.requests;

import java.io.BufferedInputStream;
import java.util.ArrayList;
import java.util.List;

import org.xwww.types.XGenericType;

public abstract class XRequest {

	protected Integer id = null;
	protected List<XGenericType> parameters = new ArrayList<XGenericType>();
	
	
	public XRequest() {
	
		init();
		
	}
	
	
	abstract void init();
	abstract String createHTML();
	
	
	public void captureDataFromStream( BufferedInputStream inputStream ) {
		
		for (XGenericType type:parameters) {
			
			type.getDataFromStream( inputStream );
			
		}
		
	}
	
	public String toString() {
		
		String result;
		result = "Request Id: " + id;

		result += "Parameters: ";
		for (XGenericType type:parameters) {
			result += "  " + type.getNameType() + ": " + type.toString();
		}
		
		return result;
	}
	
}
