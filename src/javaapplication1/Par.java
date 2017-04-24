/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author iqgonzalez
 */
import java.util.*;
 
final class Par<T, S> {
	private T a;
	private S b;
 
	public Par(T a, S b)
	{
		this.a = a;
		this.b = b;
	}
 
	public T getA() {
		return a;
	}
 
	public S getB() {
		return b;
	}
 
	public boolean esIgual(Par<T,S> p)
	{
		return this.a.equals(p.getA()) && this.b.equals(p.getB());
	}
 
	@Override
	public String toString()
	{
		return String.format( "(%s, %s)", getA(), getB() );
	}
}
 
class Ideone {
	public static void main (String[] args)
	{
 
 
		Par<String, Integer> prof1 = new Par<> ( "Pedro", 411 );
		Par<String, Integer> prof2 = new Par<> ( "Nanny", 409 );
 
 
		System.out.println( prof1 );
		System.out.println( prof2 );
 
		if (prof1.esIgual(prof2))
			System.out.println("Mismo profesor");
		else System.out.println("Distinto profesor");
 
	}
}
 
