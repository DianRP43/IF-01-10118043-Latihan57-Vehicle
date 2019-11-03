/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bicycle b = new Bicycle();
        b.setMyBrand("Trek BIKE");
        b.setMyModel("7.4FX");
        b.setMyGearCount(23);
        
        Skateboard s = new Skateboard();
        s.setMyModel("Rocket");
        s.setMyBrand("Ally Skate");
        s.setMyBoardLength(54.5);
        
        System.out.println("Bicycle ");
        System.out.println("Brand: "+b.getMyBrand());
        System.out.println("Model: "+b.getMyModel());
        System.out.println("Gear : "+b.getMyGearCount()+"\n");
        
        System.out.println("Bicycle ");
        System.out.println("Brand: "+s.getMyBrand());
        System.out.println("Model: "+s.getMyModel());
        System.out.println("L Board: "+s.getMyBoardLength());
    }
    
}
