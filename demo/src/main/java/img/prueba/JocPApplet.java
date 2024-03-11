package img.prueba;

import processing.core.PApplet;

public class JocPApplet extends PApplet {
    @Override
    public void settings() {
        this.size(1000,900);  
    }
    @Override
    public void setup(){
        this.fill(255,125,0);
        this.ellipse(100,100,100,100);
    }

    @Override
    public void draw(){
        this.ellipse(this.mouseX, mouseY, 100, 100);
    }
    public static void main (String[]args){
        JocPApplet pApplet= new JocPApplet();
        JocPApplet.runSketch(new String[]{ "bon", "dia"}, pApplet);
    }
}