public class uc3 {
    public static void main(String[] args) {
        // Define the lines of the banner as individual strings
        String line1 = "  OOO    OOO   PPPP   SSSS ";
        String line2 = " O   O  O   O  P   P  S    ";
        String line3 = " O   O  O   O  PPPP    SSS ";
        String line4 = " O   O  O   O  P          S";
        String line5 = "  OOO    OOO   P      SSSS ";

        // UC3 Implementation: 
        // Using String.join to manage memory efficiently instead of using '+' 
        // The first argument System.lineSeparator() ensures cross-platform compatibility
        String banner = String.join(System.lineSeparator(), line1, line2, line3, line4, line5);

        // Render the banner
        System.out.println(banner);
    }
}