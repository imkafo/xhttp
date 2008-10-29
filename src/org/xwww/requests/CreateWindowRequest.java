package org.xwww.requests;

import org.xwww.types.*;

public class CreateWindowRequest extends XRequest {

	// Static data
	public int _ID = 1;
	public String _NAME = "Create Window";

	
	@Override
	public void init() {

		// Set id and name
		id = _ID;
		name = _NAME;
		
		// Set Parameters
		//
		//		wid, parent: WINDOW
		//		class: {InputOutput, InputOnly, CopyFromParent}
		//		depth: CARD8
		//		visual: VISUALID or CopyFromParent
		//		x, y: INT16
		//		width, height, border-width: CARD16
		//		value-mask: BITMASK
		//		value-list: LISTofVALUE
		//		Errors: Alloc, Colormap, Cursor, IDChoice, Match, Pixmap, Value, Window	
		//
		parameters.add( new WINDOW("parent") );
		parameters.add( new CLASSREQUEST("parent") );
		parameters.add( new CARD8("depth") );
		parameters.add( new VISUALID("visual") );
		parameters.add( new INT16("x") );
		parameters.add( new INT16("y") );
		parameters.add( new CARD16("width") );
		parameters.add( new CARD16("height") );
		parameters.add( new CARD16("border-width") );
		parameters.add( new BITMASK("value-mask") );
		parameters.add( new LISTOFVALUE("value-list") );
		
	}

	
	@Override
	public String createHTML() {

		int wid = id;
		String width = findParameter("width").getValue();
		String height = findParameter("height").getValue();
		String x = findParameter("x").getValue();
		String y = findParameter("y").getValue();
		String parentId = findParameter("parentId").getValue();
		
        String out = 
            "win_"+ wid + " = new Ext.Window({ \n" +
            "    id: " + width + ", \n" +
            "        layout:'fit', \n" +
            "        width:"+width+", \n" +
            "        height:"+height+", \n" +
            "    x:"+x+", y:"+y+", \n" +
            "        closable: false, \n" +
            "        resizable: false, \n" +
            "        plain: false, \n" +
            "        border: false, \n" +
            "    shadow: false, \n" +
            "    html: 'Id:"+width+"' \n" +
            "    }); \n" + 
            "win_"+width+".show();\n" +
            "win_"+parentId+".add( win_"+width+");\n\n";
       
		return out;
	}

	
	
	
	
	
}
