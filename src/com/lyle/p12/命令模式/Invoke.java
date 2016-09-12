package com.lyle.p12.命令模式;

public class Invoke {
	
	ICommand command;
	
	public Invoke(ICommand command) {
		this.command = command;
	}
	
	public void execute(){
		command.sweep();
	}
	
}
