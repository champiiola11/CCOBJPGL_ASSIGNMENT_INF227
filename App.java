public class App {
    static boolean iwillReview = true;
    static boolean iwillNotFail = true;
    public static void main(String[] args) throws Exception {
        App myApp = new App();

        //precondition
        assert iwillReview == true: "Cellphone pa!";
        
        myApp.Study();
        //postcondition
        assert iwillNotFail == true: "Babagsak ka na dudong";

    System.out.println(iwillReview);
    System.out.println(iwillNotFail);
}

    void Study(){
        iwillReview = false;
        iwillNotFail = false;

    }
}
