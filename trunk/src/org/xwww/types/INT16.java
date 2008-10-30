package org.xwww.types;

import java.io.IOException;
import com.jcraft.weirdx.IO;

public class INT16 extends XGenericType {

	
	public INT16(String nameParam) {
		super(nameParam);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getDataFromStream(IO io) throws IOException {
		
		int i = io.readShort();
		value = Integer.valueOf(i).toString();
		
	}

}
