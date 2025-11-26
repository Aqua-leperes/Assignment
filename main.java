import java.util.Scanner;

public class InvoiceGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // BILL TO DETAILS
        System.out.print("Enter Bill To Name: ");
        String billName = sc.nextLine();
        System.out.print("Enter Bill To Address: ");
        String billAddress = sc.nextLine();
        System.out.print("Enter Bill To City: ");
        String billCity = sc.nextLine();
        System.out.print("Enter Bill To Contact: ");
        String billContact = sc.nextLine();
        System.out.print("Enter Bill To Email: ");
        String billEmail = sc.nextLine();
        System.out.print("Enter Bill To GSTIN: ");
        String billGST = sc.nextLine();

        // SHIP TO DETAILS
        System.out.print("Enter Ship To Name: ");
        String shipName = sc.nextLine();
        System.out.print("Enter Ship To Address: ");
        String shipAddress = sc.nextLine();
        System.out.print("Enter Ship To City: ");
        String shipCity = sc.nextLine();
        System.out.print("Enter Ship To Contact: ");
        String shipContact = sc.nextLine();
        System.out.print("Enter Ship To Email: ");
        String shipEmail = sc.nextLine();
        System.out.print("Enter Ship To GSTIN: ");
        String shipGST = sc.nextLine();


        // ================= PRODUCT 1 =================
        System.out.print("Enter Product 1 Code: ");
        String c1 = sc.nextLine();
        System.out.print("Enter Product 1 Name: ");
        String p1 = sc.nextLine();
        System.out.print("Enter Product 1 HSN: ");
        String h1 = sc.nextLine();
        System.out.print("Enter Product 1 Quantity: ");
        int q1 = sc.nextInt();
        System.out.print("Enter Product 1 Units (e.g., nos): ");
        sc.nextLine();
        String u1 = sc.nextLine();
        System.out.print("Enter Product 1 Rate: ");
        double r1 = sc.nextDouble();
        System.out.print("Enter Product 1 Tax %: ");
        double t1 = sc.nextDouble();
        double a1 = q1 * r1;


        sc.nextLine();

        // ================= PRODUCT 2 =================
        System.out.print("Enter Product 2 Code: ");
        String c2 = sc.nextLine();
        System.out.print("Enter Product 2 Name: ");
        String p2 = sc.nextLine();
        System.out.print("Enter Product 2 HSN: ");
        String h2 = sc.nextLine();
        System.out.print("Enter Product 2 Quantity: ");
        int q2 = sc.nextInt();
        System.out.print("Enter Product 2 Units: ");
        sc.nextLine();
        String u2 = sc.nextLine();
        System.out.print("Enter Product 2 Rate: ");
        double r2 = sc.nextDouble();
        System.out.print("Enter Product 2 Tax %: ");
        double t2 = sc.nextDouble();
        double a2 = q2 * r2;


        sc.nextLine();

        // ================= PRODUCT 3 =================
        System.out.print("Enter Product 3 Code: ");
        String c3 = sc.nextLine();
        System.out.print("Enter Product 3 Name: ");
        String p3 = sc.nextLine();
        System.out.print("Enter Product 3 HSN: ");
        String h3 = sc.nextLine();
        System.out.print("Enter Product 3 Quantity: ");
        int q3 = sc.nextInt();
        System.out.print("Enter Product 3 Units: ");
        sc.nextLine();
        String u3 = sc.nextLine();
        System.out.print("Enter Product 3 Rate: ");
        double r3 = sc.nextDouble();
        System.out.print("Enter Product 3 Tax %: ");
        double t3 = sc.nextDouble();
        double a3 = q3 * r3;


        sc.nextLine();

        // ================= PRODUCT 4 =================
        System.out.print("Enter Product 4 Code: ");
        String c4 = sc.nextLine();
        System.out.print("Enter Product 4 Name: ");
        String p4 = sc.nextLine();
        System.out.print("Enter Product 4 HSN: ");
        String h4 = sc.nextLine();
        System.out.print("Enter Product 4 Quantity: ");
        int q4 = sc.nextInt();
        System.out.print("Enter Product 4 Units: ");
        sc.nextLine();
        String u4 = sc.nextLine();
        System.out.print("Enter Product 4 Rate: ");
        double r4 = sc.nextDouble();
        System.out.print("Enter Product 4 Tax %: ");
        double t4 = sc.nextDouble();
        double a4 = q4 * r4;


        sc.nextLine();

        // ================= PRODUCT 5 =================
        System.out.print("Enter Product 5 Code: ");
        String c5 = sc.nextLine();
        System.out.print("Enter Product 5 Name: ");
        String p5 = sc.nextLine();
        System.out.print("Enter Product 5 HSN: ");
        String h5 = sc.nextLine();
        System.out.print("Enter Product 5 Quantity: ");
        int q5 = sc.nextInt();
        System.out.print("Enter Product 5 Units: ");
        sc.nextLine();
        String u5 = sc.nextLine();
        System.out.print("Enter Product 5 Rate: ");
        double r5 = sc.nextDouble();
        System.out.print("Enter Product 5 Tax %: ");
        double t5 = sc.nextDouble();
        double a5 = q5 * r5;


        sc.nextLine();

        // ================= PRODUCT 6 =================
        System.out.print("Enter Product 6 Code: ");
        String c6 = sc.nextLine();
        System.out.print("Enter Product 6 Name: ");
        String p6 = sc.nextLine();
        System.out.print("Enter Product 6 HSN: ");
        String h6 = sc.nextLine();
        System.out.print("Enter Product 6 Quantity: ");
        int q6 = sc.nextInt();
        System.out.print("Enter Product 6 Units: ");
        sc.nextLine();
        String u6 = sc.nextLine();
        System.out.print("Enter Product 6 Rate: ");
        double r6 = sc.nextDouble();
        System.out.print("Enter Product 6 Tax %: ");
        double t6 = sc.nextDouble();
        double a6 = q6 * r6;


        sc.nextLine();

        // ================= PRODUCT 7 =================
        System.out.print("Enter Product 7 Code: ");
        String c7 = sc.nextLine();
        System.out.print("Enter Product 7 Name: ");
        String p7 = sc.nextLine();
        System.out.print("Enter Product 7 HSN: ");
        String h7 = sc.nextLine();
        System.out.print("Enter Product 7 Quantity: ");
        int q7 = sc.nextInt();
        System.out.print("Enter Product 7 Units: ");
        sc.nextLine();
        String u7 = sc.nextLine();
        System.out.print("Enter Product 7 Rate: ");
        double r7 = sc.nextDouble();
        System.out.print("Enter Product 7 Tax %: ");
        double t7 = sc.nextDouble();
        double a7 = q7 * r7;


        // TOTALS
        double total = a1 + a2 + a3 + a4 + a5 + a6 + a7;
        double discount = total * (0.6368 / 100.0);
        double grandTotal = total - discount;


        // ================= PRINT INVOICE =================
        System.out.println("\n\n========================= SALES INVOICE =========================\n");

        System.out.println("Bill To:");
        System.out.println(billName);
        System.out.println(billAddress);
        System.out.println(billCity);
        System.out.println("Contact: " + billContact);
        System.out.println("Email: " + billEmail);
        System.out.println("GSTIN: " + billGST);

        System.out.println("\nShip To:");
        System.out.println(shipName);
        System.out.println(shipAddress);
        System.out.println(shipCity);
        System.out.println("Contact: " + shipContact);
        System.out.println("Email: " + shipEmail);
        System.out.println("GSTIN: " + shipGST);


        System.out.println("\n----------------------------------------------------------------------------------------------------");
        System.out.println("S.No\tCode\tProduct Name\t\tHSN\tQty\tUnits\tRate\tTax%\tAmount");
        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("1\t" + c1 + "\t" + p1 + "\t\t" + h1 + "\t" + q1 + "\t" + u1 + "\t" + r1 + "\t" + t1 + "\t" + a1);
        System.out.println("2\t" + c2 + "\t" + p2 + "\t\t" + h2 + "\t" + q2 + "\t" + u2 + "\t" + r2 + "\t" + t2 + "\t" + a2);
        System.out.println("3\t" + c3 + "\t" + p3 + "\t\t" + h3 + "\t" + q3 + "\t" + u3 + "\t" + r3 + "\t" + t3 + "\t" + a3);
        System.out.println("4\t" + c4 + "\t" + p4 + "\t\t" + h4 + "\t" + q4 + "\t" + u4 + "\t" + r4 + "\t" + t4 + "\t" + a4);
        System.out.println("5\t" + c5 + "\t" + p5 + "\t\t" + h5 + "\t" + q5 + "\t" + u5 + "\t" + r5 + "\t" + t5 + "\t" + a5);
        System.out.println("6\t" + c6 + "\t" + p6 + "\t\t" + h6 + "\t" + q6 + "\t" + u6 + "\t" + r6 + "\t" + t6 + "\t" + a6);
        System.out.println("7\t" + c7 + "\t" + p7 + "\t\t" + h7 + "\t" + q7 + "\t" + u7 + "\t" + r7 + "\t" + t7 + "\t" + a7);

        System.out.println("----------------------------------------------------------------------------------------------------");

        System.out.println("Total:\t\t\t\t\t\t\t\t" + total);
        System.out.println("Discount (0.6368%):\t\t\t\t\t\t" + discount);
        System.out.println("Grand Total:\t\t\t\t\t\t\t" + grandTotal);

        System.out.println("\n================================ END ================================");
    }
}
