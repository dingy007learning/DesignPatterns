/**
 * An object is used to represent and encapsulate all the information needed to call a method at a later time.
 * Allows storing lists of codes that can be executed at a later time or multiple times and usually have an undo command also.
 * 
 * Eg. of the Diner at Objectville in HFDP Book. Diner(wants the food) -> Waitress (takes orders) -> Cook (executes the cooking)
 * Client
 * 	- defines the device
 *  - defines a command that needs to be issued
 *  
 *  
 *  Invoker
 *  
 *  Command:
 *  - the command object has one method execute()	
 *  
 *  Cons:
 *  	- may have to create multiple that store lists of commands to be executed.
 * 
 * The 'DeviceButton' class is the Invoker
 * 
 * Based on Tutorial from Derek Banas on www.youtube.com
 * 
 * @author dineshkp
 *
 */
package com.designpatterns.behavioural.command;