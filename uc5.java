public class uc5 {
      public static void main(String[] args) {
        String[] bannerLines = {
            String.join("", "  OOO    OOO   PPPP   SSSS "),
            String.join("", " O   O  O   O  P   P  S    "),
            String.join("", " O   O  O   O  PPPP    SSS "),
            String.join("", " O   O  O   O  P          S"),
            String.join("", "  OOO    OOO   P      SSSS ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}
