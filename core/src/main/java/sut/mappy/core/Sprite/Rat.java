package sut.mappy.core.Sprite;

import playn.core.Key;
import playn.core.Keyboard;
import playn.core.Layer;
import playn.core.PlayN;
import playn.core.util.Callback;

import javax.swing.*;


/**
 * Created by all user on 28/1/2557.
 */
public class Rat {

        private Sprite sprite;
        private int spriteIndex =0;
        private boolean hasLoaded = false;

        private int e=0;
        private int offset =0;

        public Rat(final float x,final  float y ){

            sprite = SpriteLoader.getSprite("images/rat.json");


            sprite.addCallback(new Callback<Sprite>() {
                @Override
                public void onSuccess(Sprite result) {
                    int spriteIndex=0;
                    sprite.setSprite(spriteIndex);
                    sprite.layer().setOrigin(sprite.width()/1f,sprite.height()/1f);
                    sprite.layer().setTranslation(x,y);
                    hasLoaded=true;
                }

                @Override
                public void onFailure(Throwable cause) {

                }
            });
        }

    public Layer layer(){
        return sprite.layer();
    }

    public void update(int delta) {
        //update(delta);
        if (!hasLoaded) return;
        e += delta;

        if(e > 170){
            spriteIndex = offset + ((spriteIndex +1) % 2);
            sprite.setSprite(spriteIndex);
            e = 0;
        }
    }
}


