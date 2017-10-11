/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alext
 */

import java.util.Random;
public class Randomizer {
    Random rand;
    public Randomizer(){
        rand = new Random(System.currentTimeMillis());
        
    }
    
    public double normalDistribution(double mean, double sd, int x){
        return (1 / (sd * Math.sqrt(2 * Math.PI))) * Math.exp(-1 * ((Math.pow(x - mean, 2)) / (2 * Math.pow(sd, 2))));
    }
    
}
