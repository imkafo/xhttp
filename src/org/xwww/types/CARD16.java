package org.xwww.types;

import java.io.IOException;

import com.jcraft.weirdx.IO;

public class CARD16 extends XGenericType {

	
	public CARD16(String nameParam) {
		super(nameParam);
	}

	@Override
	public void getDataFromStream(IO io) throws IOException {
		
		int i = io.readShort();
		value = Integer.valueOf(i).toString();
		
	}


	

}
