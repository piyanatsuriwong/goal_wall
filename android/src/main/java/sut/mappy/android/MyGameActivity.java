package sut.mappy.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import sut.mappy.core.MyGame;

public class MyGameActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new MyGame());
  }
}
