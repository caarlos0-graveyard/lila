package com.github.lila;

/**
 * A simple adapter that receives a {@link HasPermission} object and optionally
 * a {@link Lila} object, just to help you write even less code :)
 * 
 * @author Carlos A Becker
 * 
 */
public class LilaPermissionAdapter {

	private final Lila lila;
	private final HasPermission t;

	public LilaPermissionAdapter(Lila lila, HasPermission t) {
		this.lila = lila;
		this.t = t;
	}

	public LilaPermissionAdapter(HasPermission t) {
		this.lila = new Lila();
		this.t = t;
	}

	/**
	 * Add the permission to your object.
	 * 
	 * @param permission
	 *            to add
	 */
	public void addPermission(int permission) {
		t.setPermission(lila.addPermission(t.getPermission(), permission));
	}

	/**
	 * Remove the permission from your object.
	 * 
	 * @param permission
	 *            to remove.
	 */
	public void removePermission(int permission) {
		t.setPermission(lila.removePermission(t.getPermission(), permission));
	}

	/**
	 * Verify if your object has that permission.
	 * 
	 * @param permission
	 *            to verify
	 * @return true if the object has the permission, false otherwise.
	 */
	public boolean hasPermission(int permission) {
		return lila.containsPermission(t.getPermission(), permission);
	}

}
