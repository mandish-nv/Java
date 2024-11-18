package Overloading;
public class time {
  int hour;
  int minute;

  time() {
    hour = 0;
    minute = 0;
  }

  time(int hour, int minute) {
    this.hour = hour;
    this.minute = minute;
  }

  time addTime(time t1, time t2) {
    time newTime = new time();
    newTime.hour = t1.hour + t2.hour;
    newTime.minute = t1.minute + t2.minute;
    return newTime;
  }

  public static void main(String[] args) {
    time t1 = new time(2, 20);
    time t2 = new time(1, 15);
    time t3 = new time();

    t3 = t3.addTime(t1, t2);
    System.out.println("New time = " + t3.hour + ":" + t3.minute);

  }
}
