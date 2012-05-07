package com.github.lila;

/**
 * Interface to define a Object/POJO/Bean that have a permission.
 *
 * @author Carlos A Becker
 *
 */
public interface HasPermission {

    void setPermission(int permission);

    int getPermission();
}
