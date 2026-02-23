public class uc6 {

    // Helper method to return the pattern for character 'O'
    static String[] getOPattern() {
        return new String[] {
            String.join("", "  OOO  "),
            String.join("", " O   O "),
            String.join("", " O   O "),
            String.join("", " O   O "),
            String.join("", "  OOO  ")
        };
    }

    // Helper method to return the pattern for character 'P'
    static String[] getPPattern() {
        return new String[] {
            String.join("", " PPPP  "),
            String.join("", " P   P "),
            String.join("", " PPPP  "),
            String.join("", " P     "),
            String.join("", " P     ")
        };
    }

    // Helper method to return the pattern for character 'S'
    static String[] getSPattern() {
        return new String[] {
            String.join("", " SSSS "),
            String.join("", " S    "),
            String.join("", "  SSS "),
            String.join("", "     S"),
            String.join("", " SSSS ")
        };
    }

    public static void main(String[] args) {
        String[] o1 = getOPattern();
        String[] o2 = getOPattern();
        String[] p  = getPPattern();
        String[] s  = getSPattern();

        String[] bannerLines = {
            String.join("", o1[0], o2[0], p[0], s[0]),
            String.join("", o1[1], o2[1], p[1], s[1]),
            String.join("", o1[2], o2[2], p[2], s[2]),
            String.join("", o1[3], o2[3], p[3], s[3]),
            String.join("", o1[4], o2[4], p[4], s[4])
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}