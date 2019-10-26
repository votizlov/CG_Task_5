package com.company;

import java.awt.*;

public class World {
    private Field field;
    private Puck puck;

    public World(Field field, Puck puck) {
        this.field = field;
        this.puck = puck;
        this.puck.setV(new Vector2(1,2));
    }

    public void update(double dt){//todo make bouncing
        Vector2 np = puck.getPos().add(puck.getV().mult(dt).add(puck.getA().mult(dt*dt*0.5)));
        Vector2 nv = puck.getV().add(puck.getA().mult(dt));
        if (puck.getPos().getX() - puck.getR() < 0|| puck.getPos().getX() + puck.getR() > field.getSize().getX()){
            nv = new Vector2(-nv.getX(),-nv.getY());
            np = puck.getPos();
        }
        Vector2 fForce = puck.getV().normalized().mult(-field.getFriction()*field.getG()*puck.getM());
        Vector2 f = new Vector2(0,0);
        Vector2 ff = f.add(fForce);
        Vector2 na = ff.mult(1/puck.getM());
        puck.setPos(new Vector2(np.getX(),np.getY()));
        puck.setV(nv);
        puck.setA(na);
    }

    public void draw(Graphics2D g,ScreenConverter screenConverter){
        g.setColor(Color.CYAN);
        ScreenVector2 point = screenConverter.realToScreen(puck.getPos());
        int screenR = screenConverter.realToScreen(new Vector2(puck.getR(),0)).getI();
        g.fillOval(point.getI() - screenR,point.getJ() -screenR,screenR*2,screenR*2);
    }
}
