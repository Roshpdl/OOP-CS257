/**
 * TestDraw client.
 *
 * @param args the command-line arguments
 */

public class TestDraw {

  public static void main(String[] args) {

    // create one drawing window
    Draw draw1 = new Draw();
    draw1.setTitle("Test client 1");
    draw1.square(0.2, 0.8, 0.1);
    draw1.filledSquare(0.8, 0.8, 0.2);
    draw1.circle(0.8, 0.2, 0.2);
    draw1.setPenColor(Draw.MAGENTA);
    draw1.setPenRadius(0.02);
    draw1.arc(0.8, 0.2, 0.1, 200, 45);


    // create another one
    Draw draw2 = new Draw();
    draw2.setCanvasSize(900, 200);
    draw2.setTitle("Test client 2");
    // draw a blue diamond
    draw2.setPenRadius();
    draw2.setPenColor(Draw.BLUE);
    double[] x = { 0.1, 0.2, 0.3, 0.2 };
    double[] y = { 0.2, 0.3, 0.2, 0.1 };
    draw2.filledPolygon(x, y);

    // text
    draw2.setPenColor(Draw.BLACK);
    draw2.text(0.2, 0.5, "bdfdfdfdlack text");
    draw2.setPenColor(Draw.WHITE);
    draw2.text(0.8, 0.8, "white text");
  }
}