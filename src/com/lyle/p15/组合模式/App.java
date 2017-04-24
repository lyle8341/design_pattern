package com.lyle.p15.组合模式;

/**
 * @ClassName: App
 * @Description: TODO
 * @author: Lyle
 * @date: 2017年2月24日 上午10:04:09
 */
public class App {

	public static void main(String[] args) {
		Folder folder = new Folder("总文件夹");
		ImageFile image = new ImageFile("凤凰图");
		TextFile text = new TextFile("紫霞秘籍");
		Folder box = new Folder("百宝箱");
		folder.add(image);
		folder.add(text);
		folder.add(box);
		ImageFile horse = new ImageFile("八骏图");
		TextFile jyzj = new TextFile("九阴真经");
		box.add(horse);
		box.add(jyzj);
		System.out.println(folder);
	}
}
