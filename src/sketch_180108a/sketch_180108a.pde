int frames = 0;
int mouthW = 20;
int mouthH = 5;
int derp = 0;
void draw() {

/* Use the method below to put moles in the holes. */
drawMole(200,200);
drawMole(70,119);
drawMole(300,60);
drawMole(297,350);

if(mousePressed){
  fill(255,255,255);
  ellipse(mouseX,mouseY, random(10), random(10));
  ellipse(400 - mouseX,400 - mouseY, random(10), random(10));
  ellipse(mouseX,400 - mouseY, random(10), random(10));
  ellipse(400 - mouseX, mouseY, random(10), random(10));
  if(frames == 5){
  mouthW = (int)random(30 + derp);
  mouthH = (int)random(20 + derp);
  frames = 0;
  derp += 1;
  }
  frames += 1;
}
}
void mouseReleased(){
  mouthW = 20;
  mouthH = 5;

}

void drawMole(int moleX, int moleY) {

     noStroke();
     fill(125, 93, 43);
     ellipse(moleX, moleY, 60, 60); // face
     fill(255, 237, 209);
     ellipse(moleX, moleY+10, 33, 28); 
     fill(0, 0, 0);
     ellipse(moleX-10, moleY-15, 10, 10); // eyes
     ellipse(moleX+10, moleY-15, 10, 10);
     ellipse(moleX, moleY-5, 10, 10); // nose
     ellipse(moleX, moleY+10, mouthW, mouthH); // mouth
}

void setup() {
    
  size(400, 400);
     background(78, 166, 51); // green grass
     fill(0, 0, 0);
     ellipse(200, 200, 100, 30); // holes!
     ellipse(70, 119, 100, 30);
     ellipse(300, 60, 100, 30);
     ellipse(297, 350, 100, 30);
  
  

     
}