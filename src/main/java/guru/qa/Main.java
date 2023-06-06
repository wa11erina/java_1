package guru.qa;

public class Main {


    public static void main(String[] args) {

        System.out.println("Integer data type addition 50 + 30: " + sumInt(50, 30));
        System.out.println("Integer data type addition overflow 2147483647 + 2147483647: " + sumInt(2147483647, 2147483647));
        System.out.println("Integer data type substraction 50 - 30: " + subInt(50, 30));
        System.out.println("Integer data type multiplication 50 * 30: " + multInt(50, 30));
        System.out.println("Integer data type multiplication overflow 2147483647 * 2147483647: " + multInt(2147483647, 2147483647));
        System.out.println("Integer data type division 50/30: " + divInt(50, 30));
        System.out.println("Integer data type division remainder 50 - (30 * 1): " + divremInt(50, 30));

        System.out.println("Double data type addition 20.5 + 15.4 = " + sumDouble(20.5, 15.4));
        System.out.println("Double data type substraction 20.5 - 15.4: " + subDouble(20.5, 15.4));
        System.out.println("Double data type multiplication 20.5 * 15.4: " + multDouble(20.5, 15.4));
        System.out.println("Double data type division 20.5/15.4: " + divDouble(20.5, 15.4));

        System.out.println("Integer and double data types addition 25 + 20.5: " + intSumDouble(25, 20.5));
        System.out.println("Integer and double data types substraction 25 - 20.5: " + intSubDouble(25, 20.5));
        System.out.println("Integer and double data types multiplication 25 * 20.5: " + intMultDouble(25, 20.5));
        System.out.println("Integer and double data types division 25/20.5: " + intDivDouble(25, 20.5));


        System.out.println("Prefix increment 25 + 1 : " + preInc(25));
        System.out.println("Postfix increment 25: " + postInc(25));
        System.out.println("Prefix decrement 25-1: " + preDec(25));
        System.out.println("Postfix increment 25: " + postDec(25));

        System.out.println("Compare integer data type 50>30 = " + compareInt(50, 30));
        System.out.println("Compare integer and double data types 21>15.4 = " + compareIntDouble(21, 15.4));

        System.out.println(getProfession("AQA-Engineer"));
        System.out.println(getProfession("QA-Engineer"));
        System.out.println(getProfession("Developer"));

        System.out.println(getMusicSubGenre("Electronic Rock"));
        System.out.println(getMusicSubGenre("EDM"));
        System.out.println(getMusicSubGenre("Metalcore"));
    }

    public static int sumInt(int num1, int num2) {
        return num1 + num2;
    }

    public static int subInt(int num1, int num2) {
        return num1 - num2;
    }

    public static int multInt(int num1, int num2) {
        return num1 * num2;
    }

    public static int divInt(int num1, int num2) {
        return num1 / num2;
    }

    public static int divremInt(int num1, int num2) {
        return num1 % num2;
    }

    public static double sumDouble(double num1, double num2) {
        return num1 + num2;
    }

    public static double subDouble(double num1, double num2) {
        return num1 - num2;
    }

    public static double multDouble(double num1, double num2) {
        return num1 * num2;
    }

    public static double divDouble(double num1, double num2) {
        return num1 / num2;
    }


    public static double intSumDouble(int num1, double double1) {
        return num1 + double1;
    }

    public static double intSubDouble(int num1, double double1) {
        return num1 - double1;
    }

    public static double intMultDouble(int num1, double double1) {
        return num1 - double1;
    }

    public static double intDivDouble(int num1, double double1) {
        return num1 / double1;
    }

    public static int preInc(int num) {
        return ++num;
    }

    public static int postInc(int num) {
        return num++;
    }

    public static int preDec(int num) {
        return --num;
    }

    public static int postDec(int num) {
        return num++;
    }

    public static boolean compareInt(int num1, int num2) {
        return num1 > num2;
    }

    public static boolean compareIntDouble(int num1, double double1) {
        return num1 > double1;
    }

    public static String getProfession(String profession) {

        if (profession != null && profession.equals("AQA-Engineer")) {
            return "AQA-Engineer";
        } else if (profession != null && profession.equals("QA-Engineer")) {
            return "QA-Engineer";
        } else {
            return "Developer";
        }
    }

    public static String getMusicSubGenre(String musicSubGenre) {
        switch (musicSubGenre) {
            case "Alternative Rock":
            case "Electronic Rock":
                System.out.println("You prefer rock music");
                break;
            case "Metalcore":
            case "Post-Hardcore":
                System.out.println("You prefer core music");
                break;
            case "Synthwave":
            case "EDM":
                System.out.println("You prefer electronica");
                break;
            default:
                System.out.println("You don't know what you like yet so go and listen to Spotify playlists");
                break;
        }
        return musicSubGenre;
    }
}



