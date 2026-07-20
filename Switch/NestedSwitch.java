package Switch;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID) {
            case 1:
                System.out.println("nitya hiray");
                break;
            case 2:
                System.out.println("Nitts");
                break;
            case 3:
                switch (department) {
                    case "IT":
                        System.out.println("IT Department");
                        break;
                    case "Management":
                        System.out.println("management department");
                        break;
                    default:
                        System.out.println("No department employee");

                }
            default:
                System.out.println("Enter employee ID");
        }
    }
}
