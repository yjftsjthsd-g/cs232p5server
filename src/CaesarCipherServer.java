
/**
 * Caesar Cipher Server Service :) For CS 232, project 5
 *
 * @author Brian Cole
 */
public class CaesarCipherServer {

    /**
     * @param args Command line arguments; if there is one, the first arg is taken as port number to listen on
     */
    public static void main(String[] args) {
        System.out.println("Starting server");

        // set port to listen on
        int myPortNumber;
        if (args.length == 0) {
            myPortNumber = 1234;
        } else {
            myPortNumber = Integer.parseInt(args[0]);
        }

        System.out.println("Port #" + myPortNumber);
        MainServerLoop myMainLoop = new MainServerLoop(myPortNumber);
        myMainLoop.run();
    }
}
