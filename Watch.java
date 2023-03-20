package edu.heca48.jspider.ClassAndObject2;

import edu.jspider.heca48.ObjectAndClass.Faculty;

public class Watch
{
	private int  hours;
	private int minutes;
	private int second;
	public Watch(int hours, int minutes, int second) {
		super();
		this.hours = hours;
		this.minutes = minutes;
		this.second = second;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	public String toString()
	{
		return hours+"\t\t"+minutes+"\t\t"+second;
	}
	public boolean equals(Object obj)
	{
		Watch w= ( Watch) obj;
		return this.hours==w.hours &&
				this.minutes==w.minutes &&
				this.second==w.second;
	}
}
