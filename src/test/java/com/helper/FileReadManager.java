package com.helper;

import java.io.IOException;

public class FileReadManager {

	private FileReadManager() {
	}
	public static FileReadManager getInstance() {
		FileReadManager frm = new FileReadManager();
		return frm;
	}
	public Configreader Configreader() throws IOException {
		Configreader cr = new Configreader();
		return cr;
	}
}
