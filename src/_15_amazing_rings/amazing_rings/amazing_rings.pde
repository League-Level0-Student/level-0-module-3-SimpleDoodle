import java.util.Random;
  
void setup(){
 

   size(1000 , 1000);
}
int b = 990;
int y = 10;
void draw(){
  
b-=1;

y+=1;
  background(#FFF700);
   int x = 500;
  
  for(int i=0;i<100;i++){
  x-=10;
  

    if (i % 2 == 0) {
    //red
      noFill();
      stroke(#3FFA0D);
       ellipse(y, 500, x, x);
    }
    else {
      //white
      noFill();
      stroke(#3FFA0D);
       ellipse(y, 500, x, x);
    }  
    
}
 int a = 500;
  
  for(int i=0;i<100;i++){
  a-=10;
  

    if (i % 2 == 0) {
    //red
      noFill();
      stroke(#00FFF0);
       ellipse(b, 500, a , a);
    }
    else {
      //white
      noFill();
      stroke(#00FFF0);
       ellipse(b, 500, a, a);
    }  
    
}
}
