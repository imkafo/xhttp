package org.xwww.types;

import java.io.IOException;

import com.jcraft.weirdx.IO;

public class WINDOW extends XGenericType {

	public WINDOW(String nameParam) {
		super(nameParam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDataFromStream(IO io) throws IOException {
		
		int i = io.readInt();
		value = Integer.valueOf(i).toString();
		
	}



}
