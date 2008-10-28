package org.xwww.types;

import java.io.BufferedInputStream;

public abstract class XGenericType {

	abstract public void getDataFromStream(BufferedInputStream inputStream);

	public String getNameType() {
		
		// TODO Auto-generated method stub
		return this.getClass().getName();
	}

}
