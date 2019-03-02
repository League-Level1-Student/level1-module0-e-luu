int i = 0;
float x = getWormX(300);
float y = getWormY(300);

void setup(){
size(500,500);
background(#83C8F5);
}

void draw(){
  makeMagical();
   x = random(300);
   y = random(300);
for(i = 0; i < 300; i++){
  stroke(#FCD673);
  fill(#FCD673);
ellipse(x,y,20,20);
x++;
y++;
}
}

float frequency = .001;
float noiseInterval = PI;

void makeMagical() {
     fill( 0, 0, 0, 10 );
     rect(0, 0, width, height);
     noStroke();
}

float getWormX(int i) {
     return map(noise(i*noiseInterval + frameCount * frequency), 0, 1, 0, width);
}

float getWormY(int i) {
     return map(noise(i*noiseInterval+1 + frameCount * frequency), 0, 1, 0, height);
}