package com.github.lila;

/**
 * A common interface to define a class (usually, a User) that have permissions.
 * 
 * @author Carlos A Becker
 * 
 */
public interface HasPermission {

	/**
	 * Get the permission from the object.
	 * 
	 * @return
	 */
	int getPermission();

	/**
	 * Set a new permission for the object.
	 * 
	 * @param permission
	 */
	void setPermission(int permission);

}
