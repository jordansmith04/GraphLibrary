package com.Jordan.GraphLibrary;

import java.util.Objects;

public class Vertex<T> {

	private int value;
	private T type;
	
	
	public Vertex() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vertex(int value, T type) {
		super();
		this.value = value;
		this.type = type;
	}
	
	@Override
	public String toString() {
		return "Vertex [value=" + value + ", type=" + type + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(type, value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		return Objects.equals(type, other.type) && value == other.value;
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public T getType() {
		return type;
	}
	
	public void setType(T type) {
		this.type = type;
	}

	
	
	
	
	
}
