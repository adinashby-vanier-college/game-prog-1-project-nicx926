import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LOneWorld extends World
{

    /**
     * Constructor for objects of class LOneWorld.
     */
    public LOneWorld()
    {
        super(830, 800, 1);
        prepare();
    }

    /**
     * 
     */
    private void prepare()
    {

        EnemyBluPistol enemyBluPistol =  new  EnemyBluPistol();
        addObject(enemyBluPistol, 296, 412);
        enemyBluPistol.setLocation(143, 377);
        Player1 player1 =  new  Player1();
        addObject(player1, 127, 136);
        EnemyWhitePistol enemyWhitePistol =  new  EnemyWhitePistol();
        addObject(enemyWhitePistol, 345, 371);
        EnemyWhitePistol enemyWhitePistol2 =  new  EnemyWhitePistol();
        addObject(enemyWhitePistol2, 248, 711);
        EnemyBluPistol enemyBluPistol2 =  new  EnemyBluPistol();
        addObject(enemyBluPistol2, 567, 387);
        EnemyWhitePistol enemyWhitePistol3 =  new  EnemyWhitePistol();
        addObject(enemyWhitePistol3, 624, 575);
        EnemyBluPistol enemyBluPistol3 =  new  EnemyBluPistol();
        addObject(enemyBluPistol3, 512, 589);
        EnemyBluRifle enemyBluRifle =  new  EnemyBluRifle();
        addObject(enemyBluRifle, 160, 650);
        enemyBluPistol.setLocation(142, 377);
        removeObject(enemyBluPistol);
        enemyWhitePistol2.setLocation(244, 720);
        removeObject(enemyWhitePistol2);
        enemyBluPistol2.setLocation(559, 389);
        enemyBluPistol2.setLocation(559, 389);
        enemyBluPistol2.setLocation(559, 389);
        enemyBluPistol2.setLocation(563, 393);
        enemyBluPistol2.setLocation(563, 393);
        enemyBluPistol2.setLocation(563, 393);
        enemyBluPistol2.setLocation(563, 391);
        removeObject(enemyBluPistol2);
        enemyBluPistol3.setLocation(514, 584);
        removeObject(enemyBluPistol3);
        enemyWhitePistol3.setLocation(618, 578);
        enemyWhitePistol3.setLocation(618, 578);
        removeObject(enemyWhitePistol3);
        Player2 player2 =  new  Player2();
        addObject(player2, 132, 221);
        player1.setLocation(125, 129);
        player1.setLocation(125, 129);
        player1.setLocation(134, 145);
        removeObject(player1);
        Player4 player4 =  new  Player4();
        addObject(player4, 145, 165);
        player2.setLocation(138, 207);
        player2.setLocation(131, 217);
        removeObject(player2);
        satan satan =  new  satan();
        addObject(satan, 300, 676);
        Wall wall = new Wall("horizontal", 400);
        addObject(wall,408,730);
        wall.setLocation(426,729);
        wall.setLocation(454,733);
        wall.setLocation(405,735);
        wall.setLocation(393,736);
        wall.setLocation(354,738);
        wall.setLocation(353,736);
        wall.setWallSize("horizontal", 500);
        wall.setLocation(479,734);
        wall.setWallSize("horizontal", 600);
        wall.setLocation(580,732);
        wall.setLocation(387,735);
        wall.setLocation(457,731);
        wall.setLocation(492,733);
        wall.setLocation(444,735);
        wall.setLocation(407,734);
        wall.setWallSize("horizontal", 620);
        wall.setLocation(522,733);
        wall.setWallSize("horizontal", 650);
        wall.setLocation(435,734);
        wall.setLocation(431,735);
        wall.setWallSize("horizontal", 660);
        wall.setLocation(301,734);
        wall.setLocation(541,732);
        wall.setLocation(312,731);
        wall.setLocation(563,739);
        wall.setLocation(456,733);
        wall.setLocation(456,733);
        removeObject(wall);
        Wall wall2 = new Wall("horizontal", 100);
        addObject(wall2,409,733);
        wall2.setLocation(411,733);
        wall2.setWallSize("horizontal", 660);
        Wall wall3 = new Wall("vertical", 100);
        addObject(wall3,743,632);
        wall3.setLocation(743,649);
        wall3.setLocation(743,609);
        wall3.setLocation(742,628);
        wall3.setLocation(744,596);
        wall3.setWallSize("vertical", 250);
        wall3.setLocation(746,567);
        wall3.setLocation(743,515);
        wall3.setWallSize("vertical", 200);
        wall3.setLocation(746,555);
        wall3.setLocation(742,578);
        wall3.setLocation(740,604);
        wall3.setLocation(741,599);
        wall3.setLocation(745,562);
        wall3.setLocation(744,509);
        removeObject(wall3);
        Wall wall4 = new Wall("vertical", 50);
        addObject(wall4,92,529);
        wall4.setLocation(92,527);
        wall4.setLocation(93,519);
        wall4.setLocation(90,495);
        wall4.setLocation(91,493);
        wall4.setLocation(90,515);
        wall4.setLocation(88,512);
        wall4.setWallSize("vertical", 600);
        wall4.setLocation(135,439);
        wall4.setLocation(135,435);
        removeObject(wall4);
        Wall wall5 = new Wall("vertical", 50);
        addObject(wall5,96,515);
        wall5.setLocation(93,520);
        wall5.setLocation(90,520);
        wall5.setWallSize("vertical", 400);
        wall5.setLocation(90,516);
        wall5.setWallSize("vertical", 430);
        Wall wall6 = new Wall("vertical", 50);
        addObject(wall6,744,632);
        wall6.setLocation(743,633);
        wall6.setLocation(744,626);
        wall6.setWallSize("vertical", 200);
        wall6.setLocation(744,641);
        Wall wall7 = new Wall("horizontal", 100);
        addObject(wall7,712,545);
        wall7.setLocation(713,543);
        Wall wall8 = new Wall("vertical", 50);
        addObject(wall8,702,516);
        wall8.setLocation(705,520);
        Wall wall9 = new Wall("horizontal", 150);
        addObject(wall9,649,504);
        wall9.setLocation(664,499);
        Wall wall10 = new Wall("vertical", 200);
        addObject(wall10,591,427);
        wall10.setLocation(593,404);
        Wall wall11 = new Wall("horizontal", 100);
        addObject(wall11,565,348);
        wall11.setLocation(557,347);
        Wall wall12 = new Wall("vertical", 100);
        addObject(wall12,513,303);
        wall12.setLocation(517,334);
        wall12.setLocation(514,300);
        wall12.setWallSize("vertical", 110);
        wall12.setLocation(512,327);
        wall12.setLocation(513,310);
        wall11.setLocation(555,348);
        wall11.setLocation(544,348);
        wall11.setWallSize("horizontal", 95);
        wall12.setLocation(513,332);
        wall12.setLocation(513,332);
        wall12.setLocation(512,311);
        wall12.setWallSize("vertical", 115);
        wall12.setLocation(510,295);
        wall12.setWallSize("vertical", 125);
        wall12.setLocation(511,324);
        removeObject(wall12);
        wall11.setLocation(569,350);
        wall11.setLocation(590,346);
        wall11.setLocation(535,352);
        wall11.setLocation(570,346);
        wall11.setLocation(557,345);
        wall11.setLocation(609,347);
        removeObject(wall11);
        Wall wall13 = new Wall("horizontal", 110);
        addObject(wall13,554,348);
        wall13.setLocation(563,350);
        Wall wall14 = new Wall("vertical", 125);
        addObject(wall14,515,325);
        wall14.setLocation(514,311);
        Wall wall15 = new Wall("horizontal", 100);
        addObject(wall15,455,273);
        wall15.setLocation(453,273);
        wall15.setLocation(452,271);
        wall15.setWallSize("horizontal", 120);
        wall15.setLocation(474,271);
        wall15.setLocation(456,271);
        Wall wall16 = new Wall("vertical", 55);
        addObject(wall16,402,293);
        wall16.setLocation(399,288);
        Wall wall17 = new Wall("horizontal", 40);
        addObject(wall17,376,312);
        wall17.setLocation(315,311);
        wall17.setLocation(318,308);
        wall17.setWallSize("horizontal", 125);
        wall17.setLocation(321,310);
        wall17.setWallSize("horizontal", 130);
        wall17.setWallSize("horizontal", 140);
        wall17.setLocation(309,308);
        wall17.setWallSize("horizontal", 150);
        wall17.setLocation(325,312);
        wall17.setLocation(315,312);
        wall17.setWallSize("horizontal", 160);
        wall17.setLocation(339,312);
        wall17.setLocation(324,315);
        Wall wall18 = new Wall("vertical", 300);
        addObject(wall18,363,190);
        wall18.setLocation(359,182);
        wall18.setLocation(362,213);
        wall18.setLocation(363,221);
        removeObject(wall18);

        Wall wall19 = new Wall("vertical", 50);
        addObject(wall19,364,190);
        wall19.setLocation(362,193);
        wall19.setLocation(362,184);
        wall19.setLocation(357,161);
        wall19.setLocation(357,161);
        wall19.setLocation(362,184);
        wall19.setLocation(359,181);
        wall19.setWallSize("vertical", 280);
        wall19.setLocation(361,169);
        wall19.setLocation(363,291);
        wall19.setLocation(362,149);
        wall19.setLocation(363,188);
        wall19.setWallSize("vertical", 300);
        wall19.setLocation(358,167);
        wall19.setLocation(362,166);
        Wall wall20 = new Wall("horizontal", 300);
        addObject(wall20,209,47);
        wall20.setLocation(212,45);
        wall20.setLocation(209,44);
        wall20.setWallSize("horizontal", 310);
        Wall wall21 = new Wall("vertical", 300);
        addObject(wall21,59,190);
        wall21.setLocation(52,175);
        Wall wall22 = new Wall("horizontal", 60);
        addObject(wall22,75,315);
        wall22.setLocation(80,313);
        wall22.setLocation(80,313);
        wall22.setWallSize("horizontal", 110);
        wall22.setLocation(117,340);
        wall22.setLocation(130,311);
        wall22.setLocation(103,312);
        wall5.setLocation(88,403);
        wall5.setWallSize("vertical", 410);
        wall5.setLocation(89,462);
        wall5.setLocation(89,462);
        wall5.setWallSize("vertical", 420);
        wall5.setLocation(92,509);
        wall5.setLocation(93,506);
        removeObject(wall5);
        Wall wall23 = new Wall("vertical", 50);
        addObject(wall23,96,537);
        wall23.setLocation(92,532);
        wall23.setLocation(92,492);
        wall23.setLocation(92,510);
        wall23.setWallSize("vertical", 430);
        wall23.setWallSize("vertical", 420);
        wall23.setLocation(93,520);
        Elevator elevator = new Elevator();
        addObject(elevator,678,674);
        elevator.setLocation(668,697);
        Wall wall24 = new Wall("vertical", 50);
        addObject(wall24,209,286);
        wall24.setLocation(208,288);
        wall24.setLocation(207,287);
        wall24.setWallSize("vertical", 30);
        wall24.setLocation(207,291);
        Wall wall25 = new Wall("horizontal", 110);
        addObject(wall25,148,270);
        wall25.setLocation(156,275);
        wall25.setWallSize("horizontal", 120);
        wall25.setLocation(166,274);
        wall25.setLocation(192,272);
        wall25.setLocation(126,269);
        wall25.setLocation(176,275);
        wall25.setLocation(222,272);
        removeObject(wall25);
        Wall wall26 = new Wall("horizontal", 30);
        addObject(wall26,153,273);
        wall26.setWallSize("horizontal", 110);
        wall17.setLocation(277,312);
        wall17.setWallSize("horizontal", 110);
        wall17.setWallSize("horizontal", 140);
        wall17.setWallSize("horizontal", 150);
        wall17.setLocation(373,312);
        wall17.setLocation(366,313);
        wall17.setLocation(333,313);
        wall17.setLocation(297,312);
        wall17.setLocation(310,313);
        wall17.setLocation(327,314);
        Wall wall27 = new Wall("vertical", 150);
        addObject(wall27,399,411);
        wall27.setLocation(396,402);
        wall27.setWallSize("vertical", 130);
        wall27.setLocation(396,412);
        wall27.setWallSize("vertical", 120);
        wall27.setLocation(398,413);
        wall27.setWallSize("vertical", 110);
        wall27.setLocation(399,401);
        wall27.setLocation(396,381);
        wall27.setWallSize("vertical", 100);
        wall27.setLocation(394,403);
        wall27.setLocation(402,403);
        Wall wall28 = new Wall("horizontal", 35);
        addObject(wall28,333,427);
        wall28.setLocation(335,427);
        Wall wall29 = new Wall("vertical", 130);
        addObject(wall29,323,493);
        wall29.setLocation(321,513);
        wall29.setLocation(324,488);
        wall29.setLocation(323,487);
        wall29.setWallSize("vertical", 200);
        wall29.setLocation(325,452);
        wall29.setLocation(325,450);
        wall29.setLocation(324,453);
        wall29.setLocation(322,453);
        wall29.setWallSize("vertical", 140);
        wall29.setLocation(324,497);
        wall29.setLocation(324,497);
        wall29.setLocation(321,496);
        wall29.setWallSize("vertical", 150);
        wall29.setLocation(322,483);
        wall29.setLocation(323,509);
        wall29.setLocation(322,509);
        wall29.setLocation(322,509);
        wall29.setLocation(320,509);
        wall29.setWallSize("vertical", 155);
        wall29.setLocation(319,502);
        wall29.setLocation(321,525);
        wall29.setLocation(323,538);
        wall29.setLocation(318,517);
        wall29.setLocation(318,510);
        wall29.setLocation(321,514);
        wall29.setLocation(321,494);
        wall29.setLocation(322,501);
        Wall wall30 = new Wall("horizontal", 50);
        addObject(wall30,294,468);
        wall30.setLocation(305,462);
        wall30.setLocation(302,465);
        wall30.setLocation(300,464);
        wall30.setWallSize("horizontal", 40);
        Wall wall31 = new Wall("vertical", 50);
        addObject(wall31,279,499);
        wall31.setLocation(286,504);
        wall31.setLocation(286,501);
        wall31.setLocation(281,499);
        wall31.setLocation(278,492);
        wall31.setWallSize("vertical", 60);
        wall31.setLocation(280,492);
        wall31.setWallSize("vertical", 70);
        wall31.setLocation(281,510);
        wall31.setLocation(279,482);
        wall31.setLocation(282,506);
        wall31.setLocation(282,500);
        Wall wall32 = new Wall("horizontal", 70);
        addObject(wall32,238,581);
        wall32.setLocation(249,578);
        wall32.setLocation(253,575);
        wall32.setLocation(232,580);
        wall32.setLocation(232,580);
        wall32.setLocation(245,578);
        wall32.setWallSize("horizontal", 80);
        Wall wall33 = new Wall("vertical", 120);
        addObject(wall33,205,667);
        wall33.setLocation(207,673);
        Wall wall34 = new Wall("horizontal", 80);
        addObject(wall34,359,578);
        wall34.setLocation(362,579);
        Wall wall35 = new Wall("vertical", 70);
        addObject(wall35,402,615);
        wall35.setLocation(399,612);
        Wall wall36 = new Wall("vertical", 40);
        addObject(wall36,397,713);
        wall36.setLocation(395,705);
        wall36.setLocation(401,707);
        wall36.setLocation(397,710);
        Wall wall37 = new Wall("horizontal", 30);
        addObject(wall37,418,694);
        wall37.setLocation(412,693);
        Wall wall38 = new Wall("vertical", 80);
        addObject(wall38,444,568);
        wall38.setLocation(435,589);
        wall29.setLocation(321,508);
        wall29.setLocation(323,509);
        wall29.setLocation(320,493);
        wall29.setWallSize("vertical", 105);
        wall29.setLocation(319,502);
        wall29.setWallSize("vertical", 205);
        wall29.setLocation(320,512);
        wall29.setWallSize("vertical", 200);
        wall29.setLocation(321,501);
        wall29.setWallSize("vertical", 180);
        wall29.setLocation(320,515);
        wall29.setWallSize("vertical", 160);
        wall29.setLocation(322,529);
        wall29.setLocation(325,520);
        wall29.setLocation(322,491);
        wall29.setLocation(320,557);
        wall29.setLocation(318,534);
        removeObject(wall29);
        Wall wall39 = new Wall("vertical", 120);
        addObject(wall39,326,515);
        wall39.setLocation(323,517);
        wall39.setLocation(320,497);
        wall39.setWallSize("vertical", 140);
        wall39.setWallSize("vertical", 160);
        wall39.setLocation(321,515);
        wall39.setLocation(321,536);
        wall39.setLocation(318,549);
        wall39.setLocation(320,516);
        wall39.setLocation(320,525);
        wall39.setLocation(321,514);
        wall39.setLocation(320,551);
        removeObject(wall39);
        Wall wall40 = new Wall("vertical", 50);
        addObject(wall40,324,509);
        wall40.setLocation(325,504);
        wall40.setWallSize("vertical", 140);
        wall40.setLocation(324,498);
        wall40.setLocation(323,541);
        wall40.setWallSize("vertical", 150);
        wall40.setLocation(321,518);
        wall40.setLocation(321,526);
        wall40.setLocation(321,538);
        wall40.setLocation(324,516);
        wall40.setLocation(324,520);
        wall40.setLocation(324,508);
        wall40.setLocation(320,509);
        wall40.setLocation(320,509);
        wall40.setWallSize("vertical", 150);
        wall40.setLocation(321,501);
        wall40.setWallSize("vertical", 160);
        wall40.setLocation(320,544);
        wall40.setLocation(324,489);
        wall40.setLocation(322,492);
        Wall wall41 = new Wall("horizontal", 120);
        addObject(wall41,454,504);
        wall40.setLocation(320,528);
        wall40.setLocation(319,517);
        removeObject(wall40);
        wall38.setLocation(435,573);
        wall38.setWallSize("vertical", 180);
        wall38.setLocation(435,601);
        wall38.setWallSize("vertical", 150);
        wall38.setLocation(436,535);
        wall38.setWallSize("vertical", 140);
        wall38.setLocation(437,546);
        wall38.setLocation(436,561);
        wall38.setLocation(439,520);
        wall38.setLocation(437,532);
        wall38.setLocation(439,526);
        wall38.setLocation(437,559);
        wall38.setLocation(435,580);
        wall38.setLocation(435,556);
        wall38.setWallSize("vertical", 155);
        wall38.setLocation(435,544);
        wall38.setWallSize("vertical", 160);
        wall38.setLocation(434,593);
        wall38.setWallSize("vertical", 150);
        wall38.setWallSize("vertical", 145);
        removeObject(player4);
        Player2 player22 = new Player2();
        addObject(player22,170,188);
        wall38.setLocation(432,550);
        removeObject(wall38);
        Wall wall42 = new Wall("vertical", 80);
        addObject(wall42,515,462);
        wall42.setLocation(515,467);
        Wall wall43 = new Wall("vertical", 120);
        addObject(wall43,477,565);
        wall43.setLocation(475,561);
        Wall wall44 = new Wall("vertical", 150);
        addObject(wall44,436,556);
        wall44.setLocation(438,580);
        Wall wall45 = new Wall("vertical", 120);
        addObject(wall45,325,501);
        wall45.setLocation(323,500);
        wall45.setLocation(322,501);
        wall45.setLocation(322,494);
        removeObject(wall45);
        Wall wall46 = new Wall("vertical", 160);
        addObject(wall46,321,514);
        wall46.setLocation(323,507);
        wall46.setLocation(324,499);
        wall46.setLocation(323,496);
        wall46.setLocation(322,544);
        wall46.setLocation(321,502);
        Wall wall47 = new Wall("vertical", 160);
        addObject(wall47,595,654);
        wall47.setLocation(591,656);
        Wall wall48 = new Wall("horizontal", 80);
        addObject(wall48,551,617);
        Wall wall49 = new Wall("horizontal", 40);
        addObject(wall49,606,539);
        wall49.setLocation(606,540);
        wall49.setLocation(609,542);
        Wall wall50 = new Wall("vertical", 80);
        addObject(wall50,516,696);
        wall50.setLocation(512,691);
        wall47.setLocation(592,597);
        removeObject(wall47);
        wall48.setLocation(536,614);
        removeObject(wall48);
        Wall wall51 = new Wall("vertical", 100);
        addObject(wall51,588,649);
        wall51.setLocation(589,646);
        wall51.setLocation(590,643);
        wall51.setLocation(587,636);
        removeObject(wall51);

        Wall wall52 = new Wall("vertical", 150);
        addObject(wall52,589,652);
        wall52.setLocation(590,659);
        Wall wall53 = new Wall("horizontal", 70);
        addObject(wall53,555,619);
        wall53.setLocation(538,615);
        wall53.setLocation(560,617);
        satan.setLocation(305,672);
        removeObject(satan);
    }
}
