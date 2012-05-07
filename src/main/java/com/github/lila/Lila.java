package com.github.lila;

/**
 * Class that will add, remove and verify Permissions.
 * 
 * @author Carlos A Becker
 * 
 */
public class Lila {

	/**
	 * Add the <code>newPermission</code> Permission to the
	 * <code>atualPermission</code> and return the updated value.
	 * 
	 * @param atualPermission
	 *            : The atual permission of your object.
	 * @param newPermission
	 *            : The permission you want to add.
	 * @return the int number representing the new permission value of your
	 *         object.
	 */
	public int addPermission(int atualPermission, int newPermission) {
		return atualPermission | newPermission;
	}

	/**
	 * Remove <code>permissionToRemove</code> Permission from the
	 * <code>atualPermission</code> and return the updated value.
	 * 
	 * @param atualPermission
	 *            : The atual permission of your object.
	 * @param permissionToRemove
	 *            : The permission you want to remove from it.
	 * @return the int number representing the new permission value of your
	 *         object.
	 */
	public int removePermission(int atualPermission, int permissionToRemove) {
		return atualPermission & ~permissionToRemove;
	}

	/**
	 * Verify if your <code>atualPermission</code> has the
	 * <code>permission</code>.
	 * 
	 * @param atualPermission
	 *            : The atual permission of your object.
	 * @param permission
	 *            : The permission you want to verify.
	 * @return true if it has the object, false otherwise.
	 */
	public boolean containsPermission(int atualPermission, int permission) {
		int atual = atualPermission;
		return (atual &= permission) == permission;
	}

}