import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.IOException;

public class Key {

    //declare variables
    static int position;

    //return the event from a given roll and the worksheet the event belongs to
    public static void returnEvent(int roll, String worksheet) throws IOException {

        System.out.println(ReadCellData(getRow(roll, worksheet), 1, getPosition(worksheet)));
    }

    //get the position of the worksheet
    public static int getPosition(String worksheet) {
        if (worksheet.equalsIgnoreCase("hit magic")) {
            position = 2;
        } else if (worksheet.equalsIgnoreCase("hit melee")) {
            position = 0;
        } else if (worksheet.equalsIgnoreCase("miss magic")) {
            position = 3;
        } else if (worksheet.equalsIgnoreCase("miss melee")) {
            position = 1;
        } else {
            System.out.println("Worksheet not found");
            System.exit(-1);
        }
        return position;
    }

    //get the row of the event based on the row and the worksheet's name
    public static int getRow(int roll, String worksheet) {
        int row = 0;
        if (worksheet.equalsIgnoreCase("hit melee")) {
            if (roll >= 1 && roll <= 50) {
                row = 1;
            } else if (roll >= 51 && roll <= 70) {
                row = 2;
            } else if (roll >= 71 && roll <= 80) {
                row = 3;
            } else if (roll >= 81 && roll <= 85) {
                row = 4;
            } else if (roll >= 86 && roll <= 88) {
                row = 5;
            } else if (roll >= 89 && roll <= 92) {
                row = 6;
            } else if (roll >= 93 && roll <= 95) {
                row = 7;
            } else if (roll == 96) {
                row = 8;
            } else if (roll == 97) {
                row = 9;
            } else if (roll == 98) {
                row = 10;
            } else if (roll == 99) {
                row = 11;
            } else if (roll == 100) {
                row = 12;
            } else {
                System.out.println("Unlucky Roll Again");
                System.exit(0);
            }
        }
        if (worksheet.equalsIgnoreCase("hit magic")) {
            if (roll >= 1 && roll <= 19) {
                row = 1;
            } else if (roll >= 20 && roll <= 34) {
                row = 2;
            } else if (roll >= 35 && roll <= 44) {
                row = 3;
            } else if (roll >= 45 && roll <= 54) {
                row = 4;
            } else if (roll >= 55 && roll <= 69) {
                row = 5;
            } else if (roll >= 70 && roll <= 84) {
                row = 6;
            } else if (roll >= 85 && roll <= 94) {
                row = 7;
            } else if (roll == 95) {
                row = 8;
            } else if (roll == 96) {
                row = 9;
            } else if (roll == 97) {
                row = 10;
            } else if (roll == 98) {
                row = 11;
            } else if (roll == 99) {
                row = 12;
            } else if (roll == 100) {
                row = 13;
            } else {
                System.out.println("Unlucky Roll Again");
                System.exit(0);
            }
        }
        if (worksheet.equalsIgnoreCase("miss melee")) {
            if (roll >= 51 && roll <= 100) {
                row = 1;
            } else if (roll >= 41 && roll <= 50) {
                row = 2;
            } else if (roll >= 31 && roll <= 40) {
                row = 3;
            } else if (roll >= 21 && roll <= 30) {
                row = 4;
            } else if (roll >= 11 && roll <= 20) {
                row = 5;
            } else if (roll >= 8 && roll <= 10) {
                row = 6;
            } else if (roll >= 6 && roll <= 7) {
                row = 7;
            } else if (roll >= 4 && roll <= 5) {
                row = 8;
            } else if (roll == 3) {
                row = 9;
            } else if (roll == 2) {
                row = 10;
            } else if (roll == 1) {
                row = 11;
            } else {
                System.out.println("Unlucky Roll Again");
                System.exit(0);
            }
        }
        if (worksheet.equalsIgnoreCase("miss magic")) {
            if (roll >= 91 && roll <= 100) {
                row = 1;
            } else if (roll >= 81 && roll <= 90) {
                row = 2;
            } else if (roll >= 71 && roll <= 80) {
                row = 3;
            } else if (roll >= 61 && roll <= 70) {
                row = 4;
            } else if (roll >= 51 && roll <= 60) {
                row = 5;
            } else if (roll >= 41 && roll <= 50) {
                row = 6;
            } else if (roll >= 31 && roll <= 40) {
                row = 7;
            } else if (roll >= 21 && roll <= 30) {
                row = 8;
            } else if (roll >= 11 && roll <= 20) {
                row = 9;
            } else if (roll >= 6 && roll <= 10) {
                row = 10;
            } else if (roll >= 1 && roll <= 5) {
                row = 11;
            } else {
                System.out.println("Unlucky Roll Again");
                System.exit(0);
            }
        }
        return row;
    }

    //get the event from the worksheet(position) based on its row and column
    public static String ReadCellData(int vRow, int vColumn, int position) throws IOException {
        FileInputStream fs = new FileInputStream("CriticalRoll.xlsx");
        XSSFWorkbook wbl = new XSSFWorkbook(fs);
        XSSFSheet sheet = wbl.getSheetAt(position);
        XSSFRow row = sheet.getRow(vRow);
        XSSFCell cell = row.getCell(vColumn);

        return cell.getStringCellValue();
    }
}


