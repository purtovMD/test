package classwork_last_homework;

import java.util.Scanner;

public class Main02 {

  public static int getDaysAmount(String month) {
    switch (month) {
      case "Februari":
        return 28;
      case "April":
      case "June":
      case "September":
      case "November":
        return 30;
      case "January":
      case "March":
      case "May":
      case "July":
      case "August":
      case "October":
      case "December":
        return 31;
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String month = scanner.next();
    System.out.println(getDaysAmount(month));
  }

}
