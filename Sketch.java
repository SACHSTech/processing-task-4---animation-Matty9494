import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(210, 255, 173);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  

  

    //sun 
    fill(225, 225, 0);
    ellipse(50, 50, 80, 80);

    //cloud
    fill(255, 255, 255);
    ellipse(190, 37, 140, 40);

    //cloud
    fill(255, 255, 255);
    ellipse(290, 40, 140, 40);

    //house
    fill(255, 204, 51);
    rect(100, 155, 200, 200);

    //windows
    fill(255, 255, 255);
    rect(110, 280, 50, 50);

      // Window
    fill(255, 255, 255);
    rect(238, 280, 50, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(233, 280, 60, 5);

    // Window
    fill(255, 255, 255);
    rect(112, 200, 75, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(107, 200, 85, 5);

    // Window
    fill(255, 255, 255);
    rect(213, 200, 75, 50);

    // Window Roof
    fill(51, 0, 0);
    rect(208, 200, 85, 5);

    // Door Handle
    fill(255, 204, 0);
    ellipse(215, 315, 10, 10);

    // House Chimny
    fill(255, 204, 51);
    rect(250, 80, 25, 70);

    // Chimny Exit
    fill(51, 0, 0);
    rect(245, 80, 35, 5);

    // House Roof
    fill(51, 0, 0);
    triangle(200, 75, 325, 175, 75, 175);

    // Tree Leaves
    fill(0, 102, 0);
    ellipse(65, 220, 100, 100);

    // Tree Trunk
    fill(102, 51, 0);
    rect(55, 270, 20, 100);

   // Bush
    fill(0, 102, 0);
    ellipse(315, 330, 60, 60);

    // Bush
    fill(0, 102, 0);
    ellipse(340, 350, 60, 60);

    // Bush
    fill(0, 102, 0);
    ellipse(300, 350, 60, 60);



    

  

  }



}
  

