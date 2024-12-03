import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LTwoWorld extends World
{
    private GreenfootSound gameMusic;
    /**
     * Constructor for objects of class LTwoWorld.
     */
    public LTwoWorld()
    {
        super(1252, 698, 1);
        gameMusic =  new  GreenfootSound("lvl2.mp3");
        prepare();
    }
    
    public void started()
    {
        gameMusic.playLoop();
    }

    public void stopped()
    {
        gameMusic.stop();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player2 player2 = new Player2();
        addObject(player2,154,616);
        Wall wall =  new  Wall("horizontal", 400);
        addObject(wall, 294, 31);
        wall.setWallSize("horizontal", 600);
        wall.setWallSize("horizontal", 500);
        Wall wall2 =  new  Wall("vertical", 300);
        addObject(wall2, 42, 143);
        wall2.setLocation(44, 178);
        Wall wall3 =  new  Wall("horizontal", 200);
        addObject(wall3, 83, 258);
        wall3.setLocation(143, 258);
        wall3.setLocation(143, 258);
        wall3.setLocation(318, 250);
        removeObject(wall3);
        Wall wall4 =  new  Wall("horizontal", 50);
        addObject(wall4, 85, 259);
        wall4.setLocation(89, 256);
        wall4.setLocation(89, 259);
        removeObject(wall4);
        Wall wall5 =  new  Wall("horizontal", 80);
        addObject(wall5, 79, 257);
        wall5.setLocation(89, 261);
        wall5.setLocation(91, 259);
        wall5.setLocation(74, 256);
        wall5.setLocation(90, 257);
        wall5.setLocation(75, 270);
        wall5.setLocation(72, 260);
        Wall wall6 =  new  Wall("horizontal", 300);
        addObject(wall6, 308, 258);
        wall6.setLocation(333, 259);
        Wall wall7 =  new  Wall("horizontal", 500);
        addObject(wall7, 90, 408);
        wall7.setLocation(170, 410);
        removeObject(wall7);
        Wall wall8 =  new  Wall("vertical", 500);
        addObject(wall8, 88, 418);
        wall8.setLocation(88, 504);
        wall8.setLocation(85, 425);
        wall8.setLocation(87, 477);
        wall8.setLocation(90, 357);
        wall8.setLocation(89, 219);
        removeObject(wall8);
        Wall wall9 =  new  Wall("vertical", 300);
        addObject(wall9, 88, 444);
        wall9.setLocation(89, 464);
        wall9.setWallSize("vertical", 450);
        wall9.setLocation(88, 405);
        wall9.setLocation(90, 407);
        wall9.setLocation(88, 417);
        wall9.setLocation(84, 410);
        wall9.setLocation(84, 222);
        removeObject(wall9);
        Wall wall10 =  new  Wall("vertical", 300);
        addObject(wall10, 542, 145);
        wall10.setLocation(540, 24);
        wall10.setLocation(546, 100);
        removeObject(wall10);
        Wall wall11 =  new  Wall("vertical", 150);
        addObject(wall11, 544, 132);
        wall11.setLocation(542, 125);
        wall11.setLocation(542, 125);
        removeObject(wall11);
        Wall wall12 =  new  Wall("vertical", 180);
        addObject(wall12, 542, 155);
        wall12.setLocation(543, 118);
        removeObject(wall5);
        Wall wall13 =  new  Wall("horizontal", 90);
        addObject(wall13, 84, 258);
        Wall wall14 =  new  Wall("vertical", 200);
        addObject(wall14, 91, 449);
        wall14.setLocation(90, 455);
        wall14.setLocation(87, 421);
        removeObject(wall14);
        Wall wall15 =  new  Wall("vertical", 500);
        addObject(wall15, 90, 460);
        wall15.setLocation(90, 507);
        Wall wall16 =  new  Wall("horizontal", 200);
        addObject(wall16, 154, 668);
        Wall wall17 =  new  Wall("vertical", 150);
        addObject(wall17, 224, 558);
        wall17.setLocation(230, 558);
        wall17.setWallSize("vertical", 170);
        wall17.setWallSize("vertical", 180);
        wall17.setLocation(225, 590);
        wall17.setLocation(222, 548);
        removeObject(wall17);
        Wall wall18 =  new  Wall("vertical", 190);
        addObject(wall18, 226, 567);
        wall18.setLocation(226, 573);
        Wall wall19 =  new  Wall("vertical", 190);
        addObject(wall19, 226, 363);
        wall19.setLocation(226, 351);
        wall19.setLocation(225, 369);
        wall18.setLocation(225, 508);
        wall19.setLocation(225, 331);
        wall18.setLocation(226, 595);
        removeObject(wall19);
        removeObject(wall18);
        Wall wall20 =  new  Wall("horizontal", 150);
        addObject(wall20, 613, 78);
        Wall wall21 =  new  Wall("vertical", 160);
        addObject(wall21, 676, 117);
        wall21.setLocation(680, 73);
        wall21.setLocation(680, 102);
        removeObject(wall21);
        wall20.setLocation(662, 77);
        removeObject(wall20);
        Wall wall22 =  new  Wall("horizontal", 145);
        addObject(wall22, 607, 77);
        wall22.setLocation(613, 77);
        Wall wall23 =  new  Wall("vertical", 150);
        addObject(wall23, 680, 95);
        wall23.setLocation(679, 86);
        Wall wall24 =  new  Wall("horizontal", 500);
        addObject(wall24, 880, 32);
        Wall wall25 =  new  Wall("vertical", 400);
        addObject(wall25, 1090, 228);
        wall25.setLocation(1089, 182);
        Wall wall26 =  new  Wall("horizontal", 200);
        addObject(wall26, 1160, 305);
        wall26.setLocation(1178, 304);
        wall26.setLocation(1139, 304);
        removeObject(wall26);
        Wall wall27 =  new  Wall("horizontal", 400);
        addObject(wall27, 890, 532);
        removeObject(wall27);
        Wall wall28 =  new  Wall("horizontal", 450);
        addObject(wall28, 867, 532);
        wall28.setLocation(877, 532);
        Wall wall29 =  new  Wall("vertical", 300);
        addObject(wall29, 678, 397);
        wall29.setLocation(679, 456);
        Wall wall30 =  new  Wall("horizontal", 300);
        addObject(wall30, 490, 394);
        wall30.setLocation(562, 392);
        wall30.setLocation(562, 392);
        removeObject(wall30);
        Wall wall31 =  new  Wall("horizontal", 330);
        addObject(wall31, 507, 393);
        wall31.setLocation(515, 394);
        Wall wall32 =  new  Wall("vertical", 200);
        addObject(wall32, 362, 326);
        wall32.setLocation(361, 356);
        removeObject(wall32);
        Wall wall33 =  new  Wall("vertical", 180);
        addObject(wall33, 357, 331);
        wall33.setLocation(361, 350);
        Wall wall34 =  new  Wall("horizontal", 200);
        addObject(wall34, 361, 439);
        removeObject(wall34);
        Wall wall35 =  new  Wall("horizontal", 300);
        addObject(wall35, 371, 440);
        removeObject(wall35);
        Wall wall36 =  new  Wall("horizontal", 380);
        addObject(wall36, 374, 440);
        wall36.setLocation(412, 442);
        Wall wall37 =  new  Wall("vertical", 180);
        addObject(wall37, 226, 363);
        wall37.setLocation(222, 353);
        removeObject(wall37);
        Wall wall38 =  new  Wall("vertical", 190);
        addObject(wall38, 226, 352);
        wall38.setLocation(223, 338);
        wall38.setLocation(228, 383);
        wall38.setLocation(227, 351);
        Wall wall39 =  new  Wall("vertical", 190);
        addObject(wall39, 227, 572);
        wall39.setLocation(226, 576);
        wall39.setLocation(224, 578);
        Wall wall40 =  new  Wall("horizontal", 380);
        addObject(wall40, 376, 578);
        wall40.setLocation(412, 579);
        Wall wall41 =  new  Wall("vertical", 150);
        addObject(wall41, 542, 506);
        wall41.setLocation(542, 510);
        Wall wall42 =  new  Wall("horizontal", 50);
        addObject(wall42, 558, 260);
        wall42.setLocation(558, 259);
        Wall wall43 =  new  Wall("horizontal", 60);
        addObject(wall43, 661, 257);
        wall43.setLocation(659, 257);
        Wall wall44 =  new  Wall("vertical", 60);
        addObject(wall44, 680, 233);
        wall44.setLocation(680, 235);
        Wall wall45 =  new  Wall("vertical", 90);
        addObject(wall45, 1089, 480);
        wall45.setLocation(1089, 492);
        removeObject(wall45);
        Wall wall46 =  new  Wall("vertical", 110);
        addObject(wall46, 1093, 486);
        wall46.setLocation(1091, 492);
        Wall wall47 =  new  Wall("horizontal", 130);
        addObject(wall47, 1160, 443);
        wall47.setLocation(1157, 440);
        Wall wall48 =  new  Wall("vertical", 140);
        addObject(wall48, 1229, 380);
        wall48.setLocation(1225, 375);
        Wall wall49 =  new  Wall("horizontal", 130);
        addObject(wall49, 1156, 305);
        removeObject(wall49);
        Wall wall50 =  new  Wall("horizontal", 140);
        addObject(wall50, 1157, 304);
        EnemyWhiteRifle enemyWhiteRifle =  new  EnemyWhiteRifle();
        addObject(enemyWhiteRifle, 1042, 84);
        EnemyBluRifle enemyBluRifle =  new  EnemyBluRifle();
        addObject(enemyBluRifle, 138, 101);
        EnemyWhiteRifle enemyWhiteRifle2 =  new  EnemyWhiteRifle();
        addObject(enemyWhiteRifle2, 609, 134);
        EnemyBluRifle enemyBluRifle2 =  new  EnemyBluRifle();
        addObject(enemyBluRifle2, 481, 338);
        EnemyBluRifle enemyBluRifle3 =  new  EnemyBluRifle();
        addObject(enemyBluRifle3, 755, 482);
        EnemyBluRifle enemyBluRifle4 =  new  EnemyBluRifle();
        addObject(enemyBluRifle4, 481, 513);
        EnemyWhitePistol enemyWhitePistol =  new  EnemyWhitePistol();
        addObject(enemyWhitePistol, 896, 244);
        Elevator2To3 elevator2To3 = new Elevator2To3();
        addObject(elevator2To3,1169,375);
        elevator2To3.setLocation(1186,373);
        removeObject(player2);
        Player3 player3 = new Player3();
        addObject(player3,144,571);
        removeObject(enemyBluRifle3);
        removeObject(enemyWhitePistol);
        removeObject(enemyWhiteRifle);
        removeObject(enemyWhiteRifle2);
        removeObject(enemyBluRifle2);
        removeObject(enemyBluRifle4);
        EnemyBluPistol enemyBluPistol = new EnemyBluPistol();
        addObject(enemyBluPistol,266,134);
        removeObject(enemyBluRifle);
        enemyBluPistol.setLocation(268,128);
        removeObject(enemyBluPistol);
        EnemyBluSmg enemyBluSmg = new EnemyBluSmg();
        addObject(enemyBluSmg,426,533);
        EnemyBluSmg enemyBluSmg2 = new EnemyBluSmg();
        addObject(enemyBluSmg2,281,545);
        enemyBluSmg.setLocation(479,510);
        enemyBluSmg2.setLocation(280,548);
        EnemyBluSmg enemyBluSmg3 = new EnemyBluSmg();
        addObject(enemyBluSmg3,77,238);
        EnemyBluSmg enemyBluSmg4 = new EnemyBluSmg();
        addObject(enemyBluSmg4,493,221);
        EnemyBluSmg enemyBluSmg5 = new EnemyBluSmg();
        addObject(enemyBluSmg5,414,341);
        EnemyBluSmg enemyBluSmg6 = new EnemyBluSmg();
        addObject(enemyBluSmg6,478,95);
        enemyBluSmg2.setLocation(285,544);
        enemyBluSmg2.setLocation(289,515);
        removeObject(enemyBluSmg2);
        EnemyBluSmg enemyBluSmg12 = new EnemyBluSmg();
        addObject(enemyBluSmg12,76,77);
        EnemyBluSmg enemyBluSmg7 = new EnemyBluSmg();
        addObject(enemyBluSmg7,744,484);
        EnemyBluSmg enemyBluSmg8 = new EnemyBluSmg();
        addObject(enemyBluSmg8,1015,486);
        EnemyBluSmg enemyBluSmg9 = new EnemyBluSmg();
        addObject(enemyBluSmg9,1019,98);
        EnemyBluSmg enemyBluSmg10 = new EnemyBluSmg();
        addObject(enemyBluSmg10,728,92);
        EnemyBluSmg enemyBluSmg11 = new EnemyBluSmg();
        addObject(enemyBluSmg11,883,280);
        EnemyWhiteSmg enemyWhiteSmg = new EnemyWhiteSmg();
        addObject(enemyWhiteSmg,447,340);
        enemyBluSmg5.setLocation(407,340);
        removeObject(enemyBluSmg5);
        enemyWhiteSmg.setLocation(419,335);
        enemyBluSmg12.setLocation(880,291);
        EnemyWhiteSmg enemyWhiteSmg2 = new EnemyWhiteSmg();
        addObject(enemyWhiteSmg2,880,291);
        enemyBluSmg12.setLocation(839,261);
        removeObject(enemyBluSmg12);
        enemyBluSmg9.setLocation(1014,484);
        removeObject(enemyBluSmg9);
        removeObject(enemyBluSmg10);
        EnemyWhiteSmg enemyWhiteSmg3 = new EnemyWhiteSmg();
        addObject(enemyWhiteSmg3,1019,486);
        EnemyWhiteSmg enemyWhiteSmg4 = new EnemyWhiteSmg();
        addObject(enemyWhiteSmg4,1024,104);
        EnemyWhiteSmg enemyWhiteSmg5 = new EnemyWhiteSmg();
        addObject(enemyWhiteSmg5,272,525);
        enemyWhiteSmg5.setLocation(270,525);
        removeObject(enemyWhiteSmg5);
        enemyBluSmg12.setLocation(733,112);
        enemyBluSmg12.setLocation(85,81);
        enemyWhiteSmg2.setLocation(766,138);
        enemyWhiteSmg2.setLocation(746,98);
        enemyBluSmg12.setLocation(88,79);
        exit exit = new exit();
        addObject(exit,282,594);
        exit.setLocation(155,629);
        plant plant = new plant();
        addObject(plant,207,586);
        plant plant2 = new plant();
        addObject(plant2,104,587);
        boz boz = new boz();
        addObject(boz,201,277);
        messyfloor messyfloor = new messyfloor();
        addObject(messyfloor,489,339);
        desk4 desk4 = new desk4();
        addObject(desk4,393,288);
        desk4 desk42 = new desk4();
        addObject(desk42,441,288);
        desk4.setLocation(416,276);
        book book = new book();
        addObject(book,416,276);
        desk42.setLocation(434,295);
        book book2 = new book();
        addObject(book2,434,295);
        boz boz2 = new boz();
        addObject(boz2,658,378);
        dresser dresser = new dresser();
        addObject(dresser,562,277);
        circletable circletable = new circletable();
        addObject(circletable,610,133);
        printer printer = new printer();
        addObject(printer,663,94);
        plant plant3 = new plant();
        addObject(plant3,562,93);
        sink sink = new sink();
        addObject(sink,506,459);
        sink sink2 = new sink();
        addObject(sink2,477,459);
        sink sink3 = new sink();
        addObject(sink3,446,459);
        toilet toilet = new toilet();
        addObject(toilet,246,555);
        removeObject(toilet);

        addObject(toilet,399,463);
        toilet toilet2 = new toilet();
        addObject(toilet2,380,465);
        removeObject(toilet2);
        removeObject(toilet);

        addObject(toilet,399,463);

        addObject(toilet2,376,464);
        toilet toilet3 = new toilet();
        addObject(toilet3,356,466);
        removeObject(toilet3);
        removeObject(toilet2);

        addObject(toilet2,375,463);

        addObject(toilet3,352,465);
        removeObject(toilet3);

        addObject(toilet3,357,464);
        removeObject(toilet3);
        removeObject(toilet2);
        removeObject(toilet);
        boz boz3 = new boz();
        addObject(boz3,249,559);
        addObject(toilet,394,462);
        addObject(toilet2,379,462);
        plant plant4 = new plant();
        addObject(plant4,529,562);
        plant plant5 = new plant();
        addObject(plant5,528,455);
        couch couch = new couch();
        addObject(couch,309,459);
        messyfloor messyfloor2 = new messyfloor();
        addObject(messyfloor2,617,196);
        circletable.setLocation(610,122);
        book book3 = new book();
        addObject(book3,610,122);
        couch couch2 = new couch();
        addObject(couch2,123,50);
        couch couch3 = new couch();
        addObject(couch3,170,49);
        table2 table2 = new table2();
        addObject(table2,96,109);
        table3 table3 = new table3();
        addObject(table3,97,181);
        removeObject(table2);
        table3 table32 = new table3();
        addObject(table32,96,100);
        table3 table33 = new table3();
        addObject(table33,206,100);
        table3 table34 = new table3();
        addObject(table34,209,178);
        table3 table35 = new table3();
        addObject(table35,317,98);
        table3 table36 = new table3();
        addObject(table36,310,179);
        table3 table37 = new table3();
        addObject(table37,424,99);
        table3 table38 = new table3();
        addObject(table38,423,177);
        removeObject(desk4);
        removeObject(desk42);
        addObject(desk4,394,287);
        addObject(desk42,442,287);
        table2 table22 = new table2();
        addObject(table22,652,242);
        printer printer2 = new printer();
        addObject(printer2,61,49);
        dresser dresser2 = new dresser();
        addObject(dresser2,520,49);
        messyfloor messyfloor3 = new messyfloor();
        addObject(messyfloor3,261,132);
        circletable circletable2 = new circletable();
        addObject(circletable2,794,113);
        circletable circletable3 = new circletable();
        addObject(circletable3,973,111);
        removeObject(table22);
        circletable circletable4 = new circletable();
        addObject(circletable4,790,251);
        circletable circletable5 = new circletable();
        addObject(circletable5,988,255);
        circletable circletable6 = new circletable();
        addObject(circletable6,788,395);
        circletable circletable7 = new circletable();
        addObject(circletable7,997,397);
        circletable circletable8 = new circletable();
        addObject(circletable8,884,337);
        circletable circletable9 = new circletable();
        addObject(circletable9,863,178);
        addObject(table22,710,515);
        table2 table23 = new table2();
        addObject(table23,756,516);
        table2 table24 = new table2();
        addObject(table24,805,515);
        table2 table25 = new table2();
        addObject(table25,854,515);
        plant plant6 = new plant();
        addObject(plant6,1074,517);
        plant plant7 = new plant();
        addObject(plant7,1075,50);
        plant plant8 = new plant();
        addObject(plant8,690,49);
        removeObject(circletable9);
        removeObject(circletable8);
    }
}
