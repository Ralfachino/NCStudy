package com.myCompany.service;

import java.io.*;
import java.util.ArrayList;
import java.sql.Array;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileIO {

    public static List<String> fileRead(File uploadDir) throws FileNotFoundException {

        Scanner scanner = new Scanner(uploadDir);

        List<String> stringList = new ArrayList<String>();

        while (scanner.hasNextLine()) {
            stringList.add(scanner.nextLine());
        }

        scanner.close();
        return stringList;
    }

    public static List<String> fileSearch(String firstName, String lastName) throws FileNotFoundException {
        String path = "C:\\Users\\ralfp\\Desktop\\Java\\ThymeleafTask\\CustomerInfo.txt";
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        List<String> stringList = new ArrayList<String>();

        Pattern pattern = Pattern.compile("\\D" + firstName + ".." + lastName + ".*");
        Matcher matcher;
        boolean found;
        String str;
        while (scanner.hasNextLine()) {
            matcher = pattern.matcher(str = scanner.nextLine());
            found = matcher.matches();
            if (found) {
                stringList.add(str);
            }
        }

        scanner.close();
        return stringList;


    }

    public static void fileWrite(List<String> userInfo) throws IOException {
        File file = new File("C:\\Users\\ralfp\\Desktop\\Java\\ThymeleafTask\\CustomerInfo.txt");
        FileWriter writer = new FileWriter(file, true);
        BufferedWriter bufferWriter = new BufferedWriter(writer);
        bufferWriter.write(userInfo.toString());
        bufferWriter.newLine();
        bufferWriter.close();

    }
}
