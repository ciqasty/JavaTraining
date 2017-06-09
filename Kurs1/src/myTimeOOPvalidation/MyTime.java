package myTimeOOPvalidation;

public class MyTime {
	private int hour=0;
	private int minute=0;
	private int second=0;
	
	public MyTime() {
		
	}
	public MyTime(int hour, int minute, int second) throws IllegalArgumentException {
		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			throw new IllegalArgumentException("Invalid hour, minute or second!");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public void setTime(int hour, int minute, int second) {
		if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
			throw new IllegalArgumentException("Invalid hour, minute or second!");
		}
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setHour(int hour) {
		if (hour <0 || hour > 23) {
			throw new IllegalArgumentException("Invalid hour!");
		}
		this.hour = hour;
	}
	public void setMinute(int minute) {
		if (minute < 0 || minute > 59) {
			throw new IllegalArgumentException("Invalid minute!");
		}
		this.minute = minute;
	}
	public void setSecond(int second) {
		if (second < 0 || second > 59) {
				throw new IllegalArgumentException("Invalid minute!");
		}
		this.second = second;
	}
	
	public int getHour() {
		return hour;
	}
	public int getMinute() {
		return minute;
	}
	public int getSecond() {
		return second;
	}
	
	public String toString() {
		String hour;
		String minute;
		String second;
		if (this.hour < 10) {
			hour = "0" + this.hour;
		}
		else {
			hour = "" + this.hour;
		}
		if (this.minute < 10) {
			minute = "0"+this.minute;
		}
		else {
			minute = "" + this.minute;
		}
		if (this.second < 10) {
			second = "0" + this.second;
		}
		else {
			second = "" + this.second;
		}
		return hour + ":" + minute + ":" + second;
	}
	
}
