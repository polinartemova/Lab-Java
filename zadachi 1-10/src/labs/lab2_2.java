package labs;
import java.io.*;
import java.util.*;
import java.util.regex.*;


public class lab2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

      /*2 часть*/
		
        var list2 = new ArrayList<ArrayList<String>>();
        try (FileReader reader = new FileReader("E:\\fail_test.txt");
             BufferedReader br = new BufferedReader(reader)) {

            String line;
            while ((line = br.readLine()) != null) {
                ArrayList<String> list1 = new ArrayList<>();
                String x1="";
                String x2="";
                String x3="";
                Pattern pat = Pattern.compile("([a-zA-z]+)");
                Pattern pat1 = Pattern.compile("\\d+[,.]\\d++[,.]\\d+");
                Pattern pat2 = Pattern.compile("\\d+[.]\\d+");
                Matcher matcher = pat.matcher(line);
                Matcher matcher1 = pat1.matcher(line);
                Matcher matcher2 = pat2.matcher(line);
                while (matcher.find()) {
                    x1+=matcher.group()+" ";

                }
                list1.add(x1);
                while (matcher1.find()) {
                    String line2=matcher1.group();
                    for (String i :line2.split(",")){
                        x2+=i;
                    }
                    list1.add(x2);
                }
                while (matcher2.find()) {
                    x3=matcher2.group();
                    list1.add(x3);
                }
                list2.add(list1);

            }


        } catch (IOException e) {
            e.printStackTrace();
        }
        double[] max=new double[10];
        for(int i =0;i<10;i++){

              max[i]= Double.parseDouble(list2.get(i).get(3));

        }
        boolean sorted = false;
        double temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < max.length - 1; i++) {
                if (max[i] < max[i+1]) {
                    temp = max[i];
                    max[i] = max[i+1];
                    max[i+1] = temp;
                    sorted = false;
                }
            }
        }
        System.out.printf("%-30s%-30s%-30s%-30s","Country","Immigrants","% world total","% population");
        System.out.println();
        for(int i =0;i<10;i++){
            for(int j =0;j<10;j++){
                if (max[i]== Double.parseDouble(list2.get(j).get(3))){
                    for(int h=0;h<4;h++){
                        System.out.printf("%-30s",list2.get(j).get(h));
                    }
                    System.out.println();
                }
            }

        }

    }
	

}
