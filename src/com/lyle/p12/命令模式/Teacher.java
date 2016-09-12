package com.lyle.p12.命令模式;

/**
 * 命令发送者
 * @author Lyle
 */
public class Teacher implements ICommand{

	private Student receiver = null;
	
	public Teacher(Student receiver) {
		this.receiver = receiver;
	}
	
	@Override
	public void sweep() {
		receiver.sweeping();
	}

	
}
