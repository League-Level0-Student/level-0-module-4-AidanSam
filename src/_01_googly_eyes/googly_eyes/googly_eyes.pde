PImage face;

void setup() {
face = loadImage("sponge.jpeg");
    size(800,600);
    face.resize(width,height);
     background(face);
}

void draw() {
 if(mousePressed){
  fill(#FFFFFF);
  ellipse(mouseX, mouseY, 85, 85);
  fill(#000000);
  ellipse(mouseX, mouseY, 20, 20);
 }
}
