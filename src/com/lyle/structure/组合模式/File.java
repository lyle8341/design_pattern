package com.lyle.structure.组合模式;

public abstract class File {

	private String name;

	public File(String name) {
		this.name = name;
	}

	public File() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "File [name=" + name + "]";
	}
}
