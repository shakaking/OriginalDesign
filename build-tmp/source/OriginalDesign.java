import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalDesign extends PApplet {

int hatY =0;

public void setup()
{
size(500,300);
background(215,151,151);
frameRate(25);
}

public void draw()
{
	background(215,151,151);

	perry();
	hat();
	if (hatY >= 20)
 		{
 			textSize(32);
 			text("A", 50,250);
 		}
 	if (hatY >= 60)
 	{
 		text("GENT", 70, 250);
 	}
 	if (hatY >= 90)
 	{
 		text("PEEEEEEEEEE", 250, 250);
 	}
}

public void perry()
{
//tail
fill(255,164,118);
//original x = 370
smooth();
beginShape();
curveVertex(250,125);
curveVertex(250,125);
curveVertex(320,120);
curveVertex(370,140);
curveVertex(350,170);
curveVertex(335,160);
curveVertex(315,155);
curveVertex(290,150);
curveVertex(275,145);
curveVertex(240,140);
curveVertex(240,140);
endShape();
stroke(0);
line(260,155,290,122);
line(285,148,320,121);
line(300,152,345,125);
line(318,156,370,138);
line(285,148,270,121);
line(300,152,290,122);
line(318,156,320,121);
line(350,170,345,125);

//leg1
fill(20,193,180);
triangle(160,120,190,120,180,180);
ellipse(176,178,10,8);

//leg3
fill(255,184,41);
quad(210,170,230,170,235,180,215,180);
fill(20,193,180);
triangle(215,120,245,120,230,175);

//Body
rect(150,100,70,60,10,20,20,20);
quad(270,105,205,100,205,160,270,152);

//leg2
triangle(190,150,205,160,200,180);
ellipse(197,178,10,8);
noStroke();
rect(194,140,20,18);

//leg4
stroke(0,0,0);
fill(255,184,41);
quad(250,175,270,175,275,185,255,185);
fill(20,193,180);
triangle(250,130,270,130,270,180);
noStroke();
rect(250,110,20,25);
stroke(0,0,0);

//hair
fill(0,0,0);
triangle(165,100,162,100,150,91);
triangle(150,83,156,85,165,100);
beginShape();
curveVertex(165,100);
curveVertex(165,100);
curveVertex(166,99);
curveVertex(167,98);
curveVertex(168,96);
curveVertex(169,94);
curveVertex(169,92);
curveVertex(167,85);
curveVertex(167,85);
endShape();


//beak
fill(20,193,180);
noStroke();
rect(200,101,10,59);
stroke(0,0,0);
fill(255,184,41);
triangle(180,160,150,160,160,130);
rect(118,145,50,10,10,10,15,15);
noStroke();
rect(158,145,12,10);
fill(255,255,255);
stroke(0,0,0);

//eyes
ellipse(149,122,24,16);
ellipse(185,124,26,18);
fill(31,22,5);
ellipse(145,121,10,8);
ellipse(188,123,12,8);
fill(255,255,255);
noStroke();
ellipse(143,120,2,2);
ellipse(187,122,2,2);
}

public void hat()
{
 	if(hatY < 100)
 	{
 		hatY = hatY + 2;
 		
 	}
	fill(139,69,19);
	stroke(0);
	//ridge
	rect(145,hatY,70,7);
	triangle(146,hatY,146,hatY+7,130,hatY);
	noStroke();
	rect(145,hatY+1,6,6);
	stroke(0);
	//head
	triangle(145,hatY-7,158,hatY-30,200,hatY);
	triangle(153,hatY,190, hatY-23, 210, hatY);
	noStroke();
	quad(146,hatY-7,211,hatY, 180,hatY-9,160,hatY-12);
	//black strip
	stroke(0);
	fill(0);
	quad(145,hatY-7,142,hatY,190,hatY+7,210,hatY);

}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalDesign" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
