
Erlang support via JInterface
-----------------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/erlang](http://artifacts.griffon-framework.org/plugin/erlang)


Allows a Griffon application to communicate with [Erlang][1] processes via rpc or even create an Erlang server.
Uses Erlang's [Jinterface][2] under the covers.

Usage
-----

This plugin enhances OtpErlang classes with additional methods via meta classes. Those methods are

 * **OtpErlangTuple.getAt(int)** - enables array subscript notation. Alias for elementAt(int).
 * **OtpErlangTuple.iterator()** - enables iterator methods. Immutable iterator based on elements().

Java primitive and wrappers have a **toErlang()** method that creates their OtpErlang counterparts.
Both String and List have this method too. String has one more, *toErlangAtom()*, while List has *toErlangObjectTuple()*.


[1]: http://ftp.sunet.se/pub/lang/erlang/
[2]: http://www.erlang.org/doc/apps/jinterface/index.html

