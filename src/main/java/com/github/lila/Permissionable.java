/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lila;

/**
 * Interface to define a Object that will have a permission.
 *
 * @author Carlos A Becker
 *
 */
public interface Permissionable {

    void setPermission(int permission);

    int getPermission();
}
