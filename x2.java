//////// Exercise x2:  modularize exercise x1, and add dog to chase hero.
//////// Whoever Whoever  (CST 112; today's date?)

//////// Please change these to your name and today's date.
String author=  "";
String title=  "  ";
String help=  " ";


//// GLOBALS:  coordinates, speed, etc.
float horizon;
float x, y;       // Position.
float dx, dy;     // Speed.
float dogX, dogY;  // Dog
float puppyX, puppyY; /// Puppy



//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
  size( 640,480);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
 
  
}

//// NEXT FRAME:  scene, action, show.
void draw() {
  scene();
  hero();
  dog();
  messages();
  puppy();
 
  
}




//// SCENE:  sky, sun, tree, house, etc.
void scene() {  
  background( 0,0,100 );     //---Sky Color
  fill(255,255,0);
  ellipse( width*3/4, height/7, 45,45 );   /// ---- Sun
  fill(50,100,0);
  rect( 0,horizon, width,height*3/4 );   //---Sky
  
  
  

}

void messages() {
  text( title, width/3, 20 );
  text( help, width*2/3, 30 );
  text( author, 10,height-20 );
}





//// ACTION:  move (x,y) coordinates of hero & dog; show them.
void hero() {
  

  
  //fill(200,100,255);
  
  text( "Gwar", x, y );
  
  fill(0,100,150);     //// body color
  
  rect( x,y, 50,80,15,15,0,0);

  fill(252  , 230 ,  201);
   ellipse(x+25,y-20,60,60);    
   
   fill(255,100,100);
   stroke(2);
 
  ellipse(x+20,y-5,20,(random(0,15)/.5));  //// Mouth
  
  fill(150,200,120);
  ellipse(x+30,y-30 ,12,10);    /////---- Left Eye
  
  ellipse(x+5,y-30 ,12,10);      /////---- Right Eye
  
  x = x + dx/2;
  y = y + dy/2;

}


void dog() {
  dogX=  dogX - (dogX-x+100)/30;
  dogY=  dogY - (dogY-y-40)/40;
  
  noStroke();
  text( dogX, 10, 10 );
  text( dogY, 10, 20 );
  
  fill( 140,90,0 );
  rect(dogX,dogY, 60,30,0,10,0,12);
  
  ellipse(dogX,dogY,10,20); /////Ear
  
  fill(105,100,0);
  
  ellipse(dogX+60,dogY,10,10); /// Dog nose
  
  fill(0);
  ellipse(dogX+10, dogY+10,10,10);   /// dog eye
  
  noStroke();
  fill(50,100,0);   ///// mouth color
  
  triangle(dogX+30,dogY+15,dogX+60,dogY+15,dogX+60,dogY+30);   //// Dogs mouth
  
}

void puppy(){
  puppyX=  dogX - dogX/3  ;
  puppyY=  dogY - (random(-5,5));
  
  fill(200,150,10);
  rect(puppyX,puppyY,40,20,0,0,3,0);    //puppy body
  ellipse(puppyX , puppyY ,10,15);    ////--- Ear
  fill(0);
  ellipse(puppyX , puppyY ,3,6);    /////- inner ear
  
  
  
  text( "Bark!", puppyX + 15, puppyY - 10 );
}



//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random(-3,+3) ;                  // random speed.
  dy=  random( -2, +2 );
  

 
}
  

  
  


void keyReleased() {   ////// Dog Bite
  
  if (key == 'q') {
   
    dogX = x;
    dogY = y+40;
  /// textSize(26);
    text("NOM NOM",x-50,y);
    text("AHHHHH!!!",x+30,y-50);
                  }}
                      
                                    
 void keyPressed() {
  if (key == 'a') {
   dogX = mouseX;
   dogY = mouseY;
   text ( "RAWRRRR" , mouseX + 10, mouseY - 15);
  }                
                               
  
 
   
}
   
   
