import processing.core.PApplet;

public class MoveBalls extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int DIAMETER = 15;
    public static Ball[] balls;

    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        //setting up 4 balls at initial positions of 1/5, 2/5,3/5 and 4/5th heights
        balls = new Ball[4];
        for (int i = 0; i < 4; i++) {
            balls[i] = new Ball(0, (i + 1) * (HEIGHT / 5));
        }
    }

    public void drawBalls(Ball ball) {
        ellipse(ball.x, ball.y, DIAMETER, DIAMETER);
    }

    @Override
    public void draw() {

        //drawing each balls
        for (int i = 0; i < 4; i++) {
            drawBalls(balls[i]);
        }

        //increasing speed of each ball by 1x,2x,3x and 4x
        for (int i = 0; i < 4; i++) {
            balls[i].x += (i + 1);
        }
    }
}
