package com.github.lila;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest extends TestCase {
	public AppTest(String testName) {
		super(testName);
	}

	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	public static interface Permission {
		public static final int READ = 1;
		public static final int WRITE = 2;
		public static final int EXECUTE = 4;
		public static final int ANOTHER = 8;
	}

	public static class User implements HasPermission {

		private int permission;

		public int getPermission() {
			return permission;
		}

		public void setPermission(int permission) {
			this.permission = permission;
		}

	}

	public void testApp() {
		LilaPermissionAdapter pm = new LilaPermissionAdapter(new User());
		pm.addPermission(Permission.EXECUTE);
		pm.addPermission(Permission.WRITE);

		assertTrue(pm.hasPermission(Permission.EXECUTE));
	}
}
