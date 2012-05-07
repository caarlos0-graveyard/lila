Lila
====

![Lila](http://s1-02.twitpicproxy.com/photos/full/574935072.jpg)

"Lila doesn't like people who try to do things they supposed couldn't do."

This is Lila, a little puppy that lives in our neighborhood. The name of this API is my simple tribute to to her :)

-----

This tiny API helps you to avoid the use of enuns, complex logics and join tables just to made a full and secure permission management in your applications.

How?

Simple: Using [Java Binary Operators](http://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html).

So, you just create a simple enum or interface of int constants (0, 1, 2, 4, 8, 16, 32, and go on), and save a single int number per object in your database.

You can use both `Lila` and `LilaPermissionAdapter` classes to manage permissions in your objects.

Oh, you can also use our [AOP module](https://github.com/caarlos0/lila-aop) (just for [Guice](http://code.google.com/p/google-guice/), sorry).

Maven users: You can use my singele [maven repository](http://caarlos0.github.com/maven) like a boss ;)