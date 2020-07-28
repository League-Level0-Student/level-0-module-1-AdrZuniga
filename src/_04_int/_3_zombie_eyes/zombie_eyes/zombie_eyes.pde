
void setup() {

PImage face = loadImage("zombieEyes.png");
size(800, 800);
face.resize(790, 790);
image(face, 0, 0);

}
void draw() {
  if(mousePressed){
    println(mouseX + " " + mouseY);
  }
  fill(mouseX, mouseY, 0);
ellipse(328, 209, 180, 149);

ellipse(493, 208, 132, 105);

fill(#050202);
ellipse(331, 212, 30, 30);

ellipse(500, 215, 35, 35);
}
