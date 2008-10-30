package org.xwww.requests;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.xwww.types.XGenericType;

import com.jcraft.weirdx.IO;

public abstract class XRequest {

	Logger log = Logger.getLogger( XRequest.class );
	
	protected Integer id = null;
	protected String name = null;
	protected List<XGenericType> parameters = new ArrayList<XGenericType>();
	
	
	/**
	 * 	Constructor
	 */
	public XRequest() {
	
		init();
		
	}
	
	
	protected abstract void init();
	public abstract String createHTML();
	
	
	public void captureDataFromStream( IO io ) throws IOException {
		
		log.debug("Capturing data to request: " + this.name );
		for (XGenericType type:parameters) {
			
			type.getDataFromStream( io );
			log.debug("  Param: " + type.getName() + "   value: " + type.getValue() );
			
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
	
    public XGenericType findParameter( String paramName ) {
    	
    	for (XGenericType type:parameters) {
    		if ( type.getName().equalsIgnoreCase( paramName ) ) {
    			// log.debug("Parameter found: " + paramName);
    			return type;
    		}
    	}
    	
    	log.error("Parameter not found: " + paramName);
    	return null;
    }
	
}
