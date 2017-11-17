package com.lyle.structure.装饰器模式2;

/**
 * @ClassName: Voice
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月14日 下午9:09:51
 */
public class Voice {

	private int voice = 10;

	public int getVoice() {
		return voice;
	}

	public void setVoice(int voice) {
		this.voice = voice;
	}

	public void say() {
		System.out.println("当前音量是：" + voice);
	}
}
