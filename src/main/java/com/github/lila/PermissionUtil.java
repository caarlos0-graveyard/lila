package com.github.lila;

import java.util.Arrays;
import java.util.List;

/**
 * Class that will add, remove and verify Permissions.
 *
 * @author Carlos A Becker
 *
 */
public class PermissionUtil {

    /**
     * Add a permission code to the object.
     *
     * @param Permissionable object
     * @param int permission
     */
    public void addPermission(Permissionable object, int permission) {
        object.setPermission(object.getPermission() | permission);
    }

    /**
     * Adds a array of permissions to the object.
     *
     * @param object
     * @param permission
     */
    public void addPermission(Permissionable object, Integer... permission) {
        addPermission(object, Arrays.asList(permission));
    }

    /**
     * Adds a list of permissions to the object.
     *
     * @param object
     * @param permission
     */
    public void addPermission(Permissionable object, List<Integer> permission) {
        for (Integer i : permission) {
            addPermission(object, i);
        }
    }

    /**
     * Remove the permission code from object.
     *
     * @param object
     * @param permission
     */
    public void removePermission(Permissionable object, int permission) {
        object.setPermission(object.getPermission() & ~permission);
    }

    public void removePermission(Permissionable object, Integer... permission) {
        removePermission(object, Arrays.asList(permission));
    }

    public void removePermission(Permissionable object, List<Integer> permission) {
        for (Integer i : permission) {
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
    public boolean hasPermission(Permissionable object, int permission) {
        int permission_copy = object.getPermission();
        return (permission_copy &= permission) == permission;
    }

    /**
     * Verify a array of permissions into the object.
     *
     * @param object
     * @param permissions
     * @return true if the object permissions has all the permissions.
     */
    public boolean hasPermissions(Permissionable object, Integer... permissions) {
        return hasPermissions(object, Arrays.asList(permissions));
    }

    /**
     * Verify a list of permissions in the object.
     *
     * @param object
     * @param permissions
     * @return true if the object permissions has all the permissions.
     */
    public boolean hasPermissions(Permissionable object,
            List<Integer> permissions) {
        for (int p : permissions) {
            if (!hasPermission(object, p)) {
                return false;
            }
        }
        return true;
    }
}