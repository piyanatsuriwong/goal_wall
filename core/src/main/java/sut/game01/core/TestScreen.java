package sut.game01.core;

import playn.core.Image;

import playn.core.ImageLayer;
import playn.core.Layer;


import playn.core.Font;

import playn.core.util.CallbackList;

import react.UnitSlot;


import sut.game01.core.Sprite.Zealot;
import tripleplay.game.Screen;

import tripleplay.game.ScreenStack;

import playn.core.PlayN;

import tripleplay.game.UIScreen;

import tripleplay.ui.*;

import tripleplay.ui.layout.AxisLayout;

import tripleplay.game.UIScreen;

import static playn.core.PlayN.*;

import static tripleplay.ui.Background.bordered;

/**

 * Created by all user on 21/1/2557.

 */

public class TestScreen extends UIScreen {

    private final ScreenStack ss;
    private Zealot z;
    public TestScreen(ScreenStack ss){

        this.ss=ss;

    }

    @Override

    public void wasAdded(){

 z = new Zealot(300f,300f);
        layer.add( z.layer());

    }
    @Override

    public void update(int delta) {
        z.update(delta);
    }
}