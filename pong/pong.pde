int x = 0;
int speedx = 3;
PImage backgroundImage;
void setup() {
  size(500, 500);
  background(#D8D8D8);
}

void draw() {
  fill(#0F0D0E);
  background(#D8D8D8);
  ellipse(x, 20, 20, 20);
   x+=speedx;
  if (x>=width || x<=0) {
    speedx*=-1;
  }
  
image(backgroundImage, 0, 0);
image(backgroundImage, 0, 0, width, height);
}