package ClockPractice;

public class Clock {
	
	private int hour;
	private int minute;
	private int second;

	public Clock() {
		hour = 0;
		minute = 0;
		second = 0;
	}

	public boolean setHour(int hour) {
		if (hour >= 0 && hour <= 23) {
			this.hour = hour;
			return true;
		}
		return false;
	}

	public boolean setMinute(int minute) {
		if (minute >= 0 && minute <= 59) {
			this.minute = minute;
			return true;
		}
		return false;
	}

	public boolean setSecond(int second) {
		if (second >= 0 && second <= 59) {
			this.second = second;
			return true;
		}
		return false;
	}

	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public int getSecond() { return second; }

	public String toString() {
		return String.format("%02d:%02d:%02d", hour, minute, second);
	}

	public void tick() {
		second++;
		if (second == 60) {
			second = 0;
			minute++;
		}
		if (minute == 60) {
			minute = 0;
			hour++;
		}
		if (hour == 24) {
			hour = 0;
		}
	}

	public String display12H() {
		int displayHour = hour;
		String period = "AM";

		if (hour == 0) {
			displayHour = 12;
		} else if (hour == 12) {
			period = "PM";
		} else if (hour > 12) {
			displayHour = hour - 12;
			period = "PM";
		}

		return String.format("%02d:%02d:%02d %s", displayHour, minute, second, period);
	}

	public Clock advance(int minutes) {
		int newHour = hour;
		int newMinute = minute + minutes;
		int newSecond = second;

		newHour += newMinute / 60;
		newMinute = newMinute % 60;
		newHour = newHour % 24;

		Clock newClock = new Clock();
		newClock.setHour(newHour);
		newClock.setMinute(newMinute);
		newClock.setSecond(newSecond);

		return newClock;
	}
}
