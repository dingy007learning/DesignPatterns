/**
 * State pattern allows an object to change/alter its behavior when its internal state changes.
 * The object would appear to have changed its class.
 * - State implementation should be abstracted from the clients, they should only be able to see the Context.
 * - The Context can have access to many States, implemented through a common State interface.
 * - When the state changes, change the state object & the implementation is done in the state object.
 * The example is from http://www.programcreek.com/2011/07/java-design-pattern-state/
 */
package com.designpatterns.behavioural.state;