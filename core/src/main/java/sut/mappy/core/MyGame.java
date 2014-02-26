package sut.mappy.core;

import playn.core.util.Clock;

import playn.core.Game;

import playn.core.util.Clock;

import tripleplay.game.ScreenStack;

public class MyGame extends Game.Default {

    public static final int UPDATE_RATE = 25;

    private ScreenStack ss = new ScreenStack();
    //ประกาศ ScreenStack มาเพื่อแสดงผลหน้าจอถัดไปแบบ Stack

    protected final Clock.Source clock = new Clock.Source(UPDATE_RATE);
    //ต้องเพิ่มเข้าไปเพื่อให้สามารถแสดงปุ่มได้

    public MyGame() {

        super(UPDATE_RATE); // call update every 33ms (30 times per second)

    }

    @Override

    public void init() {

        ss.push(new HomeScreen(ss));
        // ทำการเรียกหน้า HomeScrees
    }

    @Override

    public void update(int delta) {

        ss.update(delta);


    }

    @Override

    public void paint(float alpha) {



        clock.paint(alpha);

        ss.paint(clock);

    }

}