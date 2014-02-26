package sut.mappy.core;

import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.Pointer;
import sut.mappy.core.Sprite.Rat;
import tripleplay.game.ScreenStack;
import tripleplay.game.UIScreen;
import tripleplay.ui.Root;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;

/**
 * Created by Clickmycom on 10/2/2557.
 */
public class GamePlay extends UIScreen {
    private Root root;

    private Rat z;
    private final ScreenStack ss;
    public GamePlay(ScreenStack ss){
        this.ss=ss;
    }
    //ประกาศ GamePlay(ScreenStack ss) เพื่อมารับค่าที่ปุ่ม Play Game สงมา



    public void wasShown(){
        Image bgImage = assets().getImage("images/safe_image.jpg");
        ImageLayer bgLayer = graphics().createImageLayer(bgImage);
        layer.add(bgLayer);

        z = new Rat(567f,454f);
        layer.add( z.layer());


        Image backIm = assets().getImage("images/Back2.png");
        ImageLayer backLayer = graphics().createImageLayer(backIm);
        graphics().rootLayer().add(backLayer);
        layer.add(backLayer);
        backLayer.setTranslation(401,301);


        backLayer.addListener(new Pointer.Adapter() {
            @Override
            public void onPointerEnd(Pointer.Event event) {
                ss.push(new HomeScreen (ss));
            }
        });


    }

    public void update(int delta) {
        z.update(delta);
    }

}
