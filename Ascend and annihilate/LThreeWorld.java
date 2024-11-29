import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LThreeWorld extends World
{

    /**
     * Constructor for objects of class LThreeWorld.
     */
    public LThreeWorld()
    {
        super(1286, 842, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall =  new  Wall("horizontal", 600);
        addObject(wall, 274, 47);
        Wall wall2 =  new  Wall("vertical", 500);
        addObject(wall2, 6, 244);
        wall2.setLocation(6, 281);
        Wall wall3 =  new  Wall("vertical", 200);
        addObject(wall3, 444, 127);
        wall3.setLocation(435, 83);
        wall3.setLocation(436, 110);
        removeObject(wall3);
        Wall wall4 =  new  Wall("vertical", 500);
        addObject(wall4, 568, 213);
        wall4.setLocation(568, 160);
        removeObject(wall4);
        Wall wall5 =  new  Wall("vertical", 400);
        addObject(wall5, 564, 246);
        wall5.setLocation(568, 208);
        wall5.setLocation(565, 322);
        wall5.setLocation(565, 310);
        removeObject(wall5);
        Wall wall6 =  new  Wall("vertical", 350);
        addObject(wall6, 574, 256);
        wall6.setLocation(566, 200);
        wall6.setLocation(563, 292);
        wall6.setLocation(563, 313);
        wall6.setLocation(568, 206);
        wall6.setLocation(568, 241);
        wall6.setLocation(566, 222);
        Wall wall7 =  new  Wall("horizontal", 250);
        addObject(wall7, 423, 396);
        removeObject(wall7);
        Wall wall8 =  new  Wall("horizontal", 400);
        addObject(wall8, 421, 400);
        wall8.setLocation(486, 394);
        removeObject(wall8);

        Wall wall9 = new Wall("horizontal", 350);
        addObject(wall9,426,397);
        wall9.setLocation(448,408);
        wall9.setLocation(451,396);
        wall9.setLocation(394,395);
        wall9.setLocation(282,399);
        wall9.setLocation(284,397);
        removeObject(wall9);
        Wall wall10 = new Wall("horizontal", 350);
        addObject(wall10,463,397);
        wall10.setLocation(438,395);
        Wall wall11 = new Wall("vertical", 200);
        addObject(wall11,430,130);
        wall11.setLocation(440,72);
        Wall wall12 = new Wall("vertical", 130);
        addObject(wall12,441,298);
        wall12.setLocation(438,289);
        wall12.setLocation(439,283);
        Wall wall13 = new Wall("horizontal", 350);
        addObject(wall13,290,352);
        wall13.setLocation(268,350);
        Wall wall14 = new Wall("horizontal", 40);
        addObject(wall14,18,350);
        Wall wall15 = new Wall("vertical", 40);
        addObject(wall15,93,367);
        wall15.setLocation(92,367);
        Wall wall16 = new Wall("horizontal", 270);
        addObject(wall16,142,480);
        wall16.setLocation(135,482);
        Wall wall17 = new Wall("vertical", 50);
        addObject(wall17,95,466);
        wall17.setLocation(91,460);
        Wall wall18 = new Wall("vertical", 400);
        addObject(wall18,266,556);
        wall18.setLocation(266,643);
        Wall wall19 = new Wall("vertical", 900);
        addObject(wall19,612,367);
        wall19.setLocation(612,244);
        Wall wall20 = new Wall("horizontal", 200);
        addObject(wall20,355,739);
        wall20.setLocation(309,737);
        wall20.setLocation(339,739);
        wall20.setLocation(376,738);
        removeObject(wall20);
        Wall wall21 = new Wall("horizontal", 200);
        addObject(wall21,332,739);
        wall21.setLocation(328,738);
        Wall wall22 = new Wall("vertical", 50);
        addObject(wall22,396,766);
        wall22.setLocation(395,765);
        Wall wall23 = new Wall("horizontal", 400);
        addObject(wall23,554,784);
        wall23.setLocation(591,784);
        Wall wall24 = new Wall("horizontal", 260);
        addObject(wall24,606,738);
        wall24.setLocation(606,740);
        Wall wall25 = new Wall("vertical", 50);
        addObject(wall25,737,721);
        wall25.setLocation(740,714);
        wall24.setLocation(733,742);
        Wall wall26 = new Wall("horizontal", 270);
        addObject(wall26,493,623);
        removeObject(wall24);
        wall26.setLocation(668,740);
        wall26.setLocation(764,740);
        removeObject(wall26);
        Wall wall27 = new Wall("horizontal", 270);
        addObject(wall27,603,741);
        wall27.setLocation(608,738);
        Wall wall28 = new Wall("horizontal", 80);
        addObject(wall28,649,697);
        Wall wall29 = new Wall("horizontal", 270);
        addObject(wall29,829,696);
        wall29.setLocation(872,695);
        Wall wall30 = new Wall("horizontal", 350);
        addObject(wall30,770,6);
        wall30.setLocation(782,6);
        Wall wall31 = new Wall("vertical", 100);
        addObject(wall31,957,49);
        wall31.setLocation(957,46);
        Wall wall32 = new Wall("horizontal", 250);
        addObject(wall32,710,310);
        wall32.setLocation(695,310);
        Wall wall33 = new Wall("horizontal", 400);
        addObject(wall33,1049,94);
        wall33.setLocation(1106,90);
        Wall wall34 = new Wall("vertical", 130);
        addObject(wall34,910,167);
        wall34.setLocation(912,149);
        Wall wall35 = new Wall("vertical", 90);
        addObject(wall35,911,304);
        wall35.setLocation(912,310);
        Wall wall36 = new Wall("horizontal", 40);
        addObject(wall36,888,310);
        wall36.setLocation(891,308);
        Wall wall37 = new Wall("vertical", 60);
        addObject(wall37,912,418);
        wall37.setLocation(912,423);
        Wall wall38 = new Wall("horizontal", 250);
        addObject(wall38,1019,440);
        wall38.setLocation(1034,440);
        removeObject(wall37);
        Wall wall39 = new Wall("horizontal", 60);
        addObject(wall39,1240,439);
        wall39.setLocation(1240,436);
        Wall wall40 = new Wall("vertical", 40);
        addObject(wall40,912,410);
        wall40.setLocation(912,420);
        Wall wall41 = new Wall("vertical", 800);
        addObject(wall41,1248,416);
        wall41.setLocation(1259,433);
        Wall wall42 = new Wall("vertical", 500);
        addObject(wall42,997,623);
        wall42.setLocation(998,711);
        wall42.setLocation(998,571);
        removeObject(wall42);
        Wall wall43 = new Wall("vertical", 400);
        addObject(wall43,1001,595);
        wall43.setLocation(997,664);
        wall43.setLocation(998,566);
        removeObject(wall43);
        Wall wall44 = new Wall("vertical", 350);
        addObject(wall44,999,648);
        wall44.setLocation(997,628);
        wall44.setLocation(997,632);
        wall44.setLocation(998,615);
        wall44.setLocation(997,514);
        removeObject(wall44);
        Wall wall45 = new Wall("horizontal", 400);
        addObject(wall45,1138,822);
        wall45.setLocation(1138,826);
        Wall wall46 = new Wall("vertical", 100);
        addObject(wall46,784,739);
        wall46.setLocation(785,731);
        wall46.setLocation(782,741);
        Wall wall47 = new Wall("vertical", 340);
        addObject(wall47,996,632);
        wall47.setLocation(998,596);
        wall47.setLocation(997,586);
        wall47.setLocation(996,592);
        Wall wall48 = new Wall("vertical", 50);
        addObject(wall48,1052,644);
        removeObject(wall47);
        wall48.setLocation(997,650);
        wall48.setWallSize("vertical", 345);
        Elevator3ToBoss elevator3ToBoss = new Elevator3ToBoss();
        addObject(elevator3ToBoss,1100,292);
        Player3 player3 = new Player3();
        addObject(player3,131,303);
        elevator3ToBoss.setLocation(1128,294);
        removeObject(elevator3ToBoss);
        player3.setLocation(127,305);
        removeObject(player3);
        Player3 player32 = new Player3();
        addObject(player32,140,272);
        Elevator3ToBoss elevator3ToBoss2 = new Elevator3ToBoss();
        addObject(elevator3ToBoss2,792,547);
    }
}
