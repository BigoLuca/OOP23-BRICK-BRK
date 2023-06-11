package brickbreaker.common;

import javafx.scene.image.Image;

public enum GameObjectsImages {

    BLUE_BRICK("blueBrick.png"),

    LIME_BRICK("limeBrick.png"),

    PURPLE_BRICK("purpleBrick.png"),

    RED_BRICK("redBrick.png"),

    ORANGE_BRICK("orangeBrick.png"),

    BRIGHT_BLUE_BRICK("brightBlueBrick.png"),

    YELLOW_BRICK("yellowBrick.png"),

    GREEN_BRICK("greenBrick.png"),

    GREY_BRICK("greyBrick.png"),

    BROWN_BRICK("brownBrick.png"),

    FIFTY_SCORE_POWER_UP("fiftyScorePP.png"),

    ONE_HUNDRED_SCORE_POWER_UP("oneHundredScorePP.png"),

    LARGE_SCORE_POWER_UP("Large_Score_PP.png"),

    MEGA_SCORE_POWER_UP("megaScorePP.png"),

    SLOW_BALL("slowBallMalus.png"),

    FAST_BALL("fastBall.png"),

    SHORT_BAR("shortBarMalus.png"),

    LONG_BAR("longBarBonus.png"),

    BALL("ball.png"),

    BAR_ANIMATION_1("bar.png"),

    BAR_ANIMATION_2("barAnimation1.png"),

    BAR_ANIMATION_3("barAnimation2.png");

    private static final String RES_PATH = "images//sprites/";
    private String fileName;
    private Image i;

    GameObjectsImages(final String fileName) {
        this.fileName = fileName;
    }

    public String getFilePath() {
        return RES_PATH + this.fileName;
    }

    public void setImage(final Image image) {
        this.i = image;
    }
    
    public Image getImage() {
        return this.i;
    }
}
