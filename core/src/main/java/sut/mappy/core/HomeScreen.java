package sut.mappy.core;

import playn.core.Font;
import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.PlayN;
import react.UnitSlot;
import playn.core.util.CallbackList;
import tripleplay.game.ScreenStack;
import tripleplay.game.UIScreen;
import tripleplay.ui.Button;
import tripleplay.ui.Root;
import tripleplay.ui.SimpleStyles;
import tripleplay.ui.layout.AxisLayout;
import tripleplay.ui.*;
import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;

/**
* Created by Clickmycom on 10/2/2557.
*/
public class HomeScreen extends UIScreen {

    public static final Font TITLE_FONT= PlayN.graphics().createFont("Helvetica", Font.Style.BOLD,24);

    private Root root;
    private final ScreenStack ss;
    public HomeScreen(ScreenStack ss){
        this.ss=ss;
    }
    // ประกาศ public HomeScreen มารับ ScreenStack


    public void wasShown(){
        super.wasShown();
        // create and add background image layer
        Image bgImage = assets().getImage("images/bg.jpg");
        ImageLayer bgLayer = graphics().createImageLayer(bgImage);
        layer.add(bgLayer);

        Image logoBall = assets().getImage("images/logo1.png");
        ImageLayer logoLayer = graphics().createImageLayer(logoBall);
        layer.add(logoLayer);

        //เริ่ม ทำการสร้างปุ่ม
        root = iface.createRoot(AxisLayout.vertical().gap(15), SimpleStyles.newSheet(),layer);
        root.setSize(width(),height());

        //สร้างข้อมูลประเภท Label ชื่อ Event Driven Programming
        root.add(new Button("Start Game").onClick(new UnitSlot(){
            public void onEmit(){
                ss.push(new GamePlay (ss));
                //เมื่อคลิกปุ่มจะเข้าสู่หน้า GamePlay
            }
        }));
        //จบ สร้างปุ่ม



        root.add(new Button("Help Game").onClick(new UnitSlot(){
            public void onEmit(){
                ss.push(new GamePlay (ss));
                //เมื่อคลิกปุ่มจะเข้าสู่หน้า GamePlay
            }
        }));
        //จบ สร้างปุ่ม

        root.add(new Button("HighScores").onClick(new UnitSlot(){
            public void onEmit(){
                ss.push(new GamePlay (ss));
                //เมื่อคลิกปุ่มจะเข้าสู่หน้า GamePlay
            }
        }));
        //จบ สร้างปุ่ม

    }

}
