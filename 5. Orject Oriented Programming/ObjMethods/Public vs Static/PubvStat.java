public class PubvStat {

    public void Public() {
        System.out.println("Public Method");
    }
    

    static void Static() {
        System.out.println("Static");
    }


    public static void main(String[] args) {
        // Calling static method, no object initialization required.
        Static();
        
        // Calling public method, object initialization required.
        PubvStat callingPublic = new PubvStat();
        callingPublic.Public();

    }



}
