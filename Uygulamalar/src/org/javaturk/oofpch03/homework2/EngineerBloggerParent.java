package org.javaturk.oofpch03.homework2;

public class EngineerBloggerParent extends Engineer implements Blogger, Parent {

	EngineerBloggerParent(String name, String lastName, int age, String branch) {
		super(name, lastName, age, branch);
	}

	@Override
	public void loveKids() {
		System.out.println("EngineerBloggerParent love his/her kids. ");

	}

	@Override
	public void teachEthic() {
		System.out.println("EngineerBloggerParent teach ethics");

	}

	@Override
	public void writeBlog() {
		System.out.println("EngineerBloggerParent can write blgs");

	}

	@Override
	public void doSearch() {
		System.out.println("EngineerBloggerParent do search for project");

	}

}
