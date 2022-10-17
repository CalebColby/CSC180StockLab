package com.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        String jsonData = GetJsonDataAsString("C:\\Users\\Ccolby\\OneDrive - Neumont College of Computer Science\\Desktop\\stock_transations-3.by.account.holder.json");
        

    }

    private static String GetJsonDataAsString(String filePath) throws FileNotFoundException{
        File file = new File(filePath);
        Scanner sc = new Scanner(file);

        StringBuilder sb = new StringBuilder();

        while(sc.hasNextLine()){
            sb.append(sc.nextLine());
        }
        sc.close();
        
        return sb.toString();
    }
}
