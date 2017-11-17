package com.lyle.structure.组合模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Folder
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月24日 上午10:03:52
 */
public class Folder extends File {

	private List<File> files = null;

	public List<File> getFiles() {
		return files;
	}

	public void setFiles(List<File> files) {
		this.files = files;
	}

	public Folder(String name) {
		super(name);
		files = new ArrayList<>();
	}

	public void add(File file) {
		files.add(file);
	}

	public void remove(File file) {
		files.remove(file);
	}

	@Override
	public String toString() {
		return "Folder [files=" + files + "]";
	}
}
