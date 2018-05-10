package org.marshallbros.cheatsheet;

import java.awt.*;

public class Main extends Canvas {

    private static final int WIDTH = 640;
    private static final int HEIGHT = WIDTH / 12 * 9;
    private static final String title = "Cheat Sheet";

    public Main() {

        new Window(WIDTH, HEIGHT, title, this);
    }

    public static void main(String[] args) {
        new Main();
    }
}
