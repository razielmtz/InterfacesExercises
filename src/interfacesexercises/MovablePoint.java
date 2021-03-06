/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesexercises;

/**
 *
 * @author Lab Interfaces
 */
public class MovablePoint implements Movable{
    int x;
    int y;
    int xSpeed;
    int ySpeed;
    
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }
    @Override
    public void moveUp(){
        y += ySpeed;
    }
    @Override
    public void moveDown(){
      y -= ySpeed;  
    }
    public void moveLeft(){
        x -= xSpeed;
    }
    public void moveRight(){
        x += xSpeed;
    }
}
