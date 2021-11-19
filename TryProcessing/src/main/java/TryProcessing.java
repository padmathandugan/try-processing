import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final float FOURTH_BALL_DIST = 1.28f;
    public static final float THIRD_BALL_DIST = 1.8f;
    public static final float SECOND_BALL_DIST = 2.8f;
    public static final float FIRST_BALL_DIST = 5.8f;
    int firstBallSpeed =0;
    int secondBallSpeed =0;
    int thirdBallSpeed =0;
    int fourthBallSpeed =0;

    public static void main(String[] args) {
       PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        drawFirstBall();
        drawSecondBall();
        drawThirdBall();
        drawFourthBall();
    }

    private void drawFourthBall() {
        ellipse(fourthBallSpeed, HEIGHT / FOURTH_BALL_DIST, 10, 10);
        fourthBallSpeed+=4;
    }

    private void drawThirdBall() {
        ellipse(thirdBallSpeed, HEIGHT / THIRD_BALL_DIST, 10, 10);
        thirdBallSpeed += 3;
    }

    private void drawSecondBall() {
        ellipse(secondBallSpeed, HEIGHT / SECOND_BALL_DIST, 10, 10);
        secondBallSpeed += 2;
    }

    private void drawFirstBall() {
        ellipse(firstBallSpeed, HEIGHT / FIRST_BALL_DIST, 10, 10);
        firstBallSpeed++;
    }
}
