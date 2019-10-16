// Description: A very unrealistic GoKart Simulator to demonstate the use of classes in Java
// Licence: None
// Copyright: No
// Author: Vakishna Thayalan
// Email: 19279795@students.latrobe.edu.au
// Email Alt: vakit@live.com
// Date Created: 17/Oct/2019

// General Stats:
//
// Java Version: OpenJDK 8 (LTS) ***https://adoptopenjdk.net/***
// JVM - Hotspot
// OS: Ubuntu Linux 18.04 LTS


import java.util.*;

public class Kart {

    private double speed;
    private double distance;
    private final double maxSpeed;
    private int currentOption;

    Kart(double speed, double maxSpeed) {
        this.speed = speed;
        this.maxSpeed = maxSpeed;
    }

    public void SetSpeed(double speed) {
        if (speed <= this.maxSpeed) {
            this.speed = speed;
        }
        else {
            System.out.println("The speed cannot exceed the maximum speed");
        }
    }

    public void PrintSpeed() {
        System.out.println("The current speed is: " + this.speed);
    }


    public void SetOption() {
        
        System.out.print("Option >> ");
        Scanner optScan = new Scanner(System.in);
        
        int temp = optScan.nextInt();
        
        while (temp > 5) {
            System.out.println("Error! Invalid Option");
            PrintMenu();
            temp = optScan.nextInt();
        }
        this.currentOption = temp;
    }


    public int GetOption() {
        return this.currentOption;
    }

    public void Drive() {
        boolean step = true;
        while (step) {
            System.out.print("Continue? >> ");
            Scanner stepScanner = new Scanner(System.in);
            int cont = stepScanner.nextInt(); 
            if (cont == 1) {
                this.distance += speed;
                System.out.println("Current Distance: " + this.distance + " at speed " + this.speed);
            }
            else {
                step = false;    
            }
        }
    }

    
    public void ProcessOption() {
        switch (this.GetOption()) {
            case 1:
                System.out.print("Please enter the new speed >> ");
                Scanner speedScanner = new Scanner(System.in);
                int newSpeed = speedScanner.nextInt();
                this.SetSpeed(newSpeed);     
                break;
            case 2:
                this.Drive();
                break;
            case 3:
                System.out.println("Stopping...");
                this.SetSpeed(0);
                break;
            case 4:
                System.out.println("Thank you for using the Kart Simulator!");
                break;
        }
    }

    static void PrintMenu() {
           System.out.println("Kart Menu: ");
           System.out.println("1. Change Speed");
           System.out.println("2. Drive");
           System.out.println("3. Stop");
           System.out.println("4. Park");
    }

    public static void main(String[] args) {
        
        Kart myKart = new Kart(50, 200);
        while (myKart.currentOption != 4) {
            PrintMenu();
            myKart.SetOption();
            myKart.ProcessOption();
        }
    }
}
