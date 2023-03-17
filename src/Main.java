import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String serialNumber = "";
        int arrayLength = 0;
        System.out.print("Type serial number: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            serialNumber = scanner.nextLine();
            if (serialNumber.length() < 3) {
                System.out.println("Serial number must be at least 3 characters long.");
                System.exit(255);
            }
        }
        System.out.print("Type array length: ");
        if (scanner.hasNextInt()) {
             arrayLength = scanner.nextInt();
             if (arrayLength > 20) {
                 System.out.println("Size of array can't be bigger then 20");
                 System.exit(256);
             }
        }
        char charTable[] = new char[serialNumber.length()];
        for (int i = 0; i < charTable.length; i++) {
            charTable[i] = serialNumber.charAt(i);
        }

        if (charTable[charTable.length - 1] == 'Z' && charTable[charTable.length - 2] == 'Z') {
            charTable[charTable.length - 1] = '0';
            charTable[charTable.length - 2] = '0';
            charTable[charTable.length - 3] = '1';
            System.out.println(charTable);
        } else {
            int index = 1;
            for (int i = 0; i < arrayLength; i++) {
                System.out.println(charTable);
                charTable[charTable.length - index]++;

                if (charTable[charTable.length - index - 0] == 58) {
                    charTable[charTable.length - index - 0] = 65;
                }
                if (charTable[charTable.length - index - 0] == 73) {
                    charTable[charTable.length - index - 0]++;
                }
                if (charTable[charTable.length - index - 0] == 79) {
                    charTable[charTable.length - index - 0]++;
                }
                if (charTable[charTable.length - index - 0] == 91) {
                    charTable[charTable.length - index - 0] = 48;
                    charTable[charTable.length - index - 1]++;
                }
            }
        }
    }
}