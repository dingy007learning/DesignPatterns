package com.designpatterns.creational.Prototype;

public interface Prototypeable extends Cloneable{
	public Prototypeable clone() throws CloneNotSupportedException;
}
