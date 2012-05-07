package com.github.lila;

/**
 * 
 * Interface that could be implemented by enuns to define the permissions.
 * Example:
 * <pre>
 * {@code
 * public enum Perm implements Permission { 
 * 		WRITE(1), READ(2), EXECUTE(4), ANOTHER(8);
 * 		private int p;
 * 		private Perm(int p) { this.p = p; }
 * 		public int get() { return p; }
 * }
 * }
 * </pre>
 * 
 * <b>NOTE:</b> use "binary" numbers (1, 2, 4, 8, 16, ...) to define your permissions values :)
 * 
 * @author Carlos A Becker
 */
public interface Permission {

	public int get();

}
