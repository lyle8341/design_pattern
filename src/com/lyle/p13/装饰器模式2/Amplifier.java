package com.lyle.p13.装饰器模式2;

/**
 * @ClassName: Amplifier
 * @Description:
 * @author: Lyle
 * @date: 2017年2月14日 下午9:12:40
 */
public class Amplifier {

	private Voice voice;

	/**
	 * @Title:Amplifier
	 * @Description:TODO
	 * @param voice
	 */
	public Amplifier(Voice voice) {
		super();
		this.voice = voice;
	}

	public void say() {
		System.out.println("经过扩音后音量变为：" + this.voice.getVoice() * 100);
	}
}
