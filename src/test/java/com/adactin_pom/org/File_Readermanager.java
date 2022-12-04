package com.adactin_pom.org;

import java.io.IOException;

public class File_Readermanager {
	private File_Readermanager() {
			}

	public static File_Readermanager getInstanceFR() {
		File_Readermanager fr = new File_Readermanager();
		return fr;
	}
	public TestData getInstanceTD() throws IOException {
		TestData td = new TestData();
		return td;
	}
	
	
}
