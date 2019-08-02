import java.util.Random;
  
void setup(){
 

   size(500 , 500);
}

void draw(){
   int x = 500;
  int y = 400;
  for(int i=0;i<5;i++){
  x-=100;
  y-=100;

    if (i % 2 == 0) {
    //red
      fill(#FFFFFF);
       ellipse(250, 250, x, x);
    }
    else {
      //white
      fill(#FF0900);
       ellipse(250, 250, x, x);
    }
    fill(#1A99FF);
ellipse(250, 250, 50, 50);
   
    
}

   star(250, 250, 25, 50,5 );
}
void star(float x, float y, float radius1, float radius2, int npoints) {
  float angle = TWO_PI / npoints;
  float halfAngle = angle/2.0;
  beginShape();
  for (float a = 0; a < TWO_PI; a += angle) {
    float sx = x + cos(a) * radius2;
    float sy = y + sin(a) * radius2;
    vertex(sx, sy);
    sx = x + cos(a+halfAngle) * radius1;
    sy = y + sin(a+halfAngle) * radius1;
    vertex(sx, sy);
  }
  endShape(CLOSE);
}
