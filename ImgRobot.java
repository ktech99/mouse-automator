import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.*;
import java.util.*;

public class ImgRobot {

  public static void main(String[] args) throws IOException, AWTException, InterruptedException {
    Robot robot = new Robot();
    for (int i = 0; i < 10; i++) {
      Thread.sleep(10000);
      System.out.println(
          "("
              + MouseInfo.getPointerInfo().getLocation().x
              + ", "
              + MouseInfo.getPointerInfo().getLocation().y
              + ")");
      String A = robot.getPixelColor(1363, 679).toString();
      String AA = robot.getPixelColor(1363, 717).toString();
      String AB = robot.getPixelColor(1363, 755).toString();
      String AC = robot.getPixelColor(1363, 795).toString();
      String AD = robot.getPixelColor(1363, 832).toString();
      System.out.println(AA);
      if (A.length() <= 32 && A.length() > 30) {
        // robot.mouseClick();
        // robot.mouseRelease();
        System.out.println("open");
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        break;
      } else {
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_R);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        System.out.println("closed");
      }
    }
  }
}
