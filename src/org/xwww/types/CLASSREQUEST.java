package org.xwww.types;

import java.io.IOException;

import com.jcraft.weirdx.IO;

public class CLASSREQUEST extends XGenericType {

	public CLASSREQUEST(String nameParam) {
		super(nameParam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDataFromStream(IO io) throws IOException {
		
		int i = io.readShort();
		value = Integer.valueOf(i).toString();
		
	}

}
