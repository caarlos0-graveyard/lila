package com.github.lila;

import java.util.Arrays;
import java.util.List;

/**
 * Class that will add, remove and verify Permissions.
 * 
 * @author Carlos A Becker
 * 
 */
public class Lila {

	/**
	 * Add a permission code to the object.
	 * 
	 * @param HasPermission
	 *            object
	 * @param int permission
	 */
	public void addPermission(HasPermission object, Permission permission) {
		object.setPermission(object.getPermission() | permission.get());
	}

	/**
	 * Adds a array of permissions to the object.
	 * 
	 * @param object
	 * @param permission
	 */
	public void addPermission(HasPermission object, Permission... permission) {
		addPermission(object, Arrays.asList(permission));
	}

	/**
	 * Adds a list of permissions to the object.
	 * 
	 * @param object
	 * @param permission
	 */
	public void addPermission(HasPermission object, List<Permission> permission) {
		for (Permission i : permission) {
			addPermission(object, i);
		}
	}

	/**
	 * Remove the permission code from object.
	 * 
	 * @param object
	 * @param permission
	 */
	public void removePermission(HasPermission object, Permission permission) {
		object.setPermission(object.getPermission() & ~permission.get());
	}

	public void removePermission(HasPermission object, Permission... permission) {
		removePermission(object, Arrays.asList(permission));
	}

	public void removePermission(HasPermission object,
			List<Permission> permission) {
		for (Permission i : permission) {
			removePermission(object, i);
		}
	}

	/**
	 * Check if object's permissions contains the permission.
	 * 
	 * @param object
	 * @param permission
	 * @return
	 */
	public boolean hasPermission(HasPermission object, Permission permission) {
		int permission_copy = object.getPermission();
		return (permission_copy &= permission.get()) == permission.get();
	}

	/**
	 * Verify a array of permissions into the object.
	 * 
	 * @param object
	 * @param permissions
	 * @return true if the object permissions has all the permissions.
	 */
	public boolean hasPermissions(HasPermission object,
			Permission... permissions) {
		return hasPermissions(object, Arrays.asList(permissions));
	}

	/**
	 * Verify a list of permissions in the object.
	 * 
	 * @param object
	 * @param permissions
	 * @return true if the object permissions has all the permissions.
	 */
	public boolean hasPermissions(HasPermission object,
			List<Permission> permissions) {
		for (Permission p : permissions) {
			if (!hasPermission(object, p)) {
				return false;
			}
		}
		return true;
	}
}