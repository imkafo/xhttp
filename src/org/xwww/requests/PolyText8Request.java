package org.xwww.requests;

import org.xwww.types.*;

public class PolyText8Request extends XRequest {

	// Static data
	public int _ID = 74;
	public String _NAME = "Poly Text 8";

	
	@Override
	public void init() {

		// Set id and name
		id = _ID;
		name = _NAME;
		
		// Set Parameters
		//
		//		   1  74              opcode
		//		   1                  unused
		//		   2  4+(n+p)/4       request length
		//		   4  DRAWABLE        drawable
		//		   4  GCONTEXT        gc
		//		   2  INT16           x
		//		   2  INT16           y
		//		   n  LISTofTEXTITEM8 items
		//		   p                  unused, p=pad(n) (p is always 0 or 1)
		//		TEXTITEM8
		//		   1  m               length of string (cannot be 255)
		//		   1  INT8            delta
		//		   m  STRING8         string
		//		or
		//		   1  255             font-shift indicator
		//		   1                  font byte 3 (most-significant)
		//		   1                  font byte 2
		//		   1                  font byte 1
		//		   1                  font byte 0 (least-significant)

		parameters.add( new INT8("unused") );
		parameters.add( new INT16("length") );
		parameters.add( new DRAWABLE("drawable") );
		parameters.add( new GCONTEXT("gc") );
		parameters.add( new INT16("x") );
		parameters.add( new INT16("y") );
		parameters.add( new LISTofTEXTITEM8("items") );
		
	}

	
	@Override
	public String createHTML() {

		String out = "";
		log.debug( _NAME + " - Creating HTML ... ");
		

        
		return out;
	}

	
	
	
	
	
}
