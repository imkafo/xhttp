package org.xwww.requests;

import org.apache.log4j.Logger;

public class XRequestDispatcher {

	private static Logger log = Logger.getLogger( XRequestDispatcher.class );
	
	public static XRequest createRequest( Integer opt ) {
		
		switch ( opt ) {
			case 1: 	return new CreateWindowRequest();
			case 74: 	return new PolyText8Request();
		}
		
		log.debug("Request not implemented " + opt );
		return null;
		
	}
	
	
}
