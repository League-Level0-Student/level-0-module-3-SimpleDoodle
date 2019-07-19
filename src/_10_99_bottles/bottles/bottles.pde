void setup(){
  int i = 99;
  int j = i-1;
  while(i>0){
  print(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down and pass it around, " + j + "bottles of beer on the wall. \n");
  i--;
  j--;
 }
 print("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy some more, 99 bottles of beer on the wall. ");
 
}
