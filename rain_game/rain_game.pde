int y = 0;
int randomNumber = (int) random(width);
int x = randomNumber;
int score = 0;
void setup(){
size(500,500);
background(#AAA1A1);
}

void draw(){
  int randomNumber = (int) random(width);
  background(#AAA1A1);
fill(#5CB0F7);
stroke(#0066BC);
y+=2;
ellipse(x,y,10,10);
if(y>500){
y = 0;
x = randomNumber;
}
fill(#0B0D0F);
rect( mouseX,400, 50, 50);
if(y == 400){
checkCatch(x);

}
fill(0, 0, 0);
textSize(16);
text("Score: " + score, 20, 20);

}

void checkCatch(int x){
     if (x > mouseX && x < mouseX+100 ){
     score++;
       y = 0;
x = randomNumber;
     }
     else if (score > 0) 
          score--;
     println("Your score is now: " + score); }