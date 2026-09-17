import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
    AsphaltPainter wes = new AsphaltPainter();
    wes.setPaint(144);
    while(wes.canMove()){
    wes.paintCanvas("aqua");
    }
    wes.paint("aqua");
  
    wes.turnLeft();
    wes.turnLeft();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.setPaint(60);
    wes.turnRight();

    while(wes.canMove()){
      wes.paintCanvas("white");
    }
    wes.paint("white");

    wes.turnRight();
    while(wes.canMove()){
      wes.move();
    }
    wes.turnRight();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.turnRight();
    wes.setPaint(60);
    while(wes.canMove()){
      wes.paintCanvas("TAN");
    }
    wes.paint("TAN");

    wes.turnRight();
    wes.turnRight();

    while(wes.canMove()){
      wes.move();
    }
    wes.setPaint(8);
    wes.turnLeft();
    wes.move();
    wes.move();
    wes.paint("Yellow");
    wes.turnLeft();
    wes.move();
    wes.paint("Yellow");
    wes.turnLeft();
    wes.move();
    wes.paint("yellow");
    wes.turnRight();
    wes.move();
    wes.paint("yellow");
    wes.turnLeft();
    wes.move();
    wes.paint("yellow");
    wes.turnLeft();
    wes.move();
    wes.paint("yellow");
    wes.move();
    wes.paint("yellow");
    wes.turnLeft();
    wes.move();
    wes.paint("yellow");

    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.turnLeft();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();

    wes.setPaint(11);
    wes.paintCactus("green");

    wes.move();
    wes.turnLeft();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
   
    wes.setPaint(11);
    wes.paintCactus("green");

    wes.turnRight();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.turnLeft();
    wes.move();
    wes.move();
    wes.move();
    wes.move();
    wes.move();


    wes.setPaint(11);
    wes.paintCactus("green");
  }
}