package btu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String pathForDir = "C:\\Users\\99555\\Desktop\\luka\\myFiles";
        String pathForFile = "C:\\Users\\99555\\Desktop\\luka\\myFiles\\data0";
        File f = new File(pathForDir);
        f.mkdir();
        String text = "programmer";
        String substring = pathForFile.substring(0, pathForFile.length() - 1);




        try {

            for(int i=1; i <= 31; i++){
                BufferedWriter bf = new BufferedWriter(new FileWriter(pathForFile));
                bf.write(text);
                bf.close();
                pathForFile = substring + i;


            }

        } catch (IOException e) {
            e.printStackTrace();
        }
//        String integer = "9023  7889 90";
//        System.out.println(Integer.valueOf(integer));
    }
}
