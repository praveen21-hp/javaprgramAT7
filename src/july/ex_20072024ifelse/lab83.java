package july.ex_20072024ifelse;

import java.util.Scanner;

public class lab83 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the browser name where you want start automation ");
        String browser = sc.next();
        browser = browser.toLowerCase();

        switch (browser)
        {
            case "chrome" :
                System.out.println("Starting form chrome browser");
                break;
            case "firefox":
                System.out.println("Starting form firefox browser");
                break;
            case "edge":
                System.out.println(" Staring form edge");
                break;
            default:
                System.out.println("No we have such browser");
        }
    }
}
