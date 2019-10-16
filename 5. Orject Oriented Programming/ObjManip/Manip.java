public class Manip {

    int x = 10;
    
    
    
    public static void main(String[] args) {
        
        Manip myObj = new Manip();
       
        // myObj.x attrib at initialization
        System.out.println("x at init: " + myObj.x);

        // Manipulating myObj.x value
        myObj.x = 5;
        
        // myObj.x attrib after manipulating value
        System.out.println("x after manipulating value: " + myObj.x);


    }




}
