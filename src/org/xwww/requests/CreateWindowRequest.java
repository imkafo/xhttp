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
		//		1  1                             opcode
		//		1  CARD8                         depth
		//		2  8+n                           request length
		//		4  WINDOW                        wid
		//		4  WINDOW                        parent
		//		2  INT16                         x
		//		2  INT16                         y
		//		2  CARD16                        width
		//		2  CARD16                        height
		//		2  CARD16                        border-width
		//		2                                class
		//		   0           CopyFromParent
		//		   1           InputOutput
		//		   2           InputOnly
		//		4  VISUALID                      visual
		//		   0           CopyFromParent
		//		4  BITMASK                       value-mask (has n bits set to 1)
		//		   #x00000001  background-pixmap
		//		   #x00000002  background-pixel
		//		   #x00000004  border-pixmap
		//		   #x00000008  border-pixel
		//		   #x00000010  bit-gravity
		//		   #x00000020  win-gravity
		//		   #x00000040  backing-store
		//		   #x00000080  backing-planes
		//		   #x00000100  backing-pixel
		//		   #x00000200  override-redirect
		//		   #x00000400  save-under
		//		   #x00000800  event-mask
		//		   #x00001000  do-not-propagate-mask
		//		   #x00002000  colormap
		//		   #x00004000  cursor
		//		4n LISTofVALUE                   value-list


		// parameters.add( new CARD8("depth") );
		// parameters.add( new 8+n("lenght") );
		parameters.add( new WINDOW("wid") );
		parameters.add( new WINDOW("parent") );
		parameters.add( new INT16("x") );
		parameters.add( new INT16("y") );
		parameters.add( new CARD16("width") );
		parameters.add( new CARD16("height") );
		parameters.add( new CARD16("border-width") );
		parameters.add( new CLASSREQUEST("class") );		
		parameters.add( new VISUALID("visual") );
		parameters.add( new BITMASK("value-mask") );
		parameters.add( new LISTOFVALUE("value-list") );		
		
	}

	
	@Override
	public String createHTML() {

		log.debug("CreateWidowRequest - Creating HTML ... ");
		
		String wid  	= findParameter("wid").getValue();
		String width 	= findParameter("width").getValue();
		String height 	= findParameter("height").getValue();
		String x 		= findParameter("x").getValue();
		String y 		= findParameter("y").getValue();
		String parentId = findParameter("parent").getValue();
		
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
            "win_"+wid+".show();\n" +
            "win_"+parentId+".add( win_"+wid+");\n\n";
       
        log.debug("HTML: " + out.substring(0, 30));
        
		return out;
	}

	
	
	
	
	
}
