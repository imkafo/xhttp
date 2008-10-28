package org.xwww.requests;

import org.xwww.types.CARD16;

public class CreateWindowRequest extends XRequest {

	
	
	
	@Override
	void init() {

		// Set id
		id = 34;
		// TODO: ...
		
		// Set Parameters
		parameters.add( new CARD16() );
		// TODO: ...
		
	}

	@Override
	String createHTML() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	
	
}
