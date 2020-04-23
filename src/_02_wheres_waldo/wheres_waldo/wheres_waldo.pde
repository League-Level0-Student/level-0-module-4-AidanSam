
void setup() {
  PImage waldo = loadImage("download.jpeg"); // Change this to match your file name.
  size(300, 170);
  image(waldo, 0, 0);
  }

void draw() {
      // Use this print statement to find out the coordinates of Waldo
      // println("X: " + mouseX + " Y: " + mouseY); 
if(mousePressed){
  if(mouseX<210 && mouseX>200 && mouseY<140 && mouseY>100){
    playWoohoo();
  }else{
    playDoh();
    println(mouseX);
  }
}
      // If the mouse is on Waldo, print “Waldo found!”

      // If Waldo is found, also use the method below to play “Woohoo”
      // Change the name of the sound file if you need to 
      // If the mouse is pressed and they’re not on Waldo, play “Doh”
      // Change the name of the sound file if you need to 
}

void playWoohoo() {
     println("woohoo");
}


void playDoh() {
     println("doh");
}
