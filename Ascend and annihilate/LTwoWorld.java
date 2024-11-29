import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class LTwoWorld extends World
{

    /**
     * Constructor for objects of class LTwoWorld.
     */
    public LTwoWorld()
    {
        super(1252, 698, 1);
        prepare();
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
    }
}
