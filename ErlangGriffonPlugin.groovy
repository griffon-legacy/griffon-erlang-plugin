/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the 'License');
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an 'AS IS' BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres Almiray
 */
class ErlangGriffonPlugin {
    // the plugin version
    String version = '0.4'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [:]
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = []
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-erlang-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'Erlang support via JInterface'
    // accepts Markdown syntax. See http://daringfireball.net/projects/markdown/ for details
    String description = '''
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
'''
}
