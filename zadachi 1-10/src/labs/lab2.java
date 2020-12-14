package labs;
import java.util.*;


public class lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		/*1 часть*/
		
        Scanner in =new Scanner (System.in);
        String[][] ttt = {
                {"United States","45,785,090","19.8","14.3"},
                {"Russia","11,048,064","4.8","7.7"},
                {"Germany","9,845,244","4.3","11.9"},
                {"Saudi Arabia","9,060,433","3.9","31.4"},
                {"United Arab Emirates","7,826,981","3.4","83.7"},
                {"United Kingdom","7,824,131","3.4","12.4"},
                {"France","7,439,086","3.2","11.6"},
                {"Canada","7,284,069","3.1","20.7"},
                {"Australia","6,468,640","2.8","27.7"},
                {"Spain","6,466,605","2.8","13.8"}

        };
        System.out.printf("%-30s%-30s%-30s%-30s","Country","Immigrants","% world total","% population");
        System.out.println();
        for(int i =0;i<10;i++){
            for (int j=0;j<4;j++){
                if (j==1){
                    ttt[i][j]=ttt[i][j].replace(",","");
                }
                System.out.printf("%-30s",ttt[i][j]);
            }
            System.out.println();

        }

        while(true){
            String z1 = in.nextLine();
            int x=0;
            double x1 = 0;
            if (z1.equals("Каково общее количество иммигрантов в этих странах?")){
                for(int i=0;i<10;i++){//преобразование в строковый тип
                	 x+=Integer.parseInt(ttt[i][1]);//сложение 2 столбца
                }
                System.out.println("Total immigrants: "+x);
            }
            if (z1.equals("Какой общий процент иммигрантов в мире приходится на эти страны?")){
                for(int i=0;i<10;i++){//преобразование в double
                    x1+=Double.parseDouble(ttt[i][2]);//сложение 3 столбца
                }
                System.out.println("Total immigrants: "+x1+" %");
            }
            if (z1.equals("В каких странах самый высокий и самый низкий процент иммигрантов?")){
                double max=Double.parseDouble(ttt[0][2]);
                double min=Double.parseDouble(ttt[0][2]);
                for(int i=0;i<10;i++){
                    x1=Double.parseDouble(ttt[i][2]);//сравниваем значения между собой
                    if (x1>max){
                        max=x1;
                    }
                    if (x1<min){
                        min=x1;
                    }
                }
                System.out.println("Total immigrants:");
                System.out.print("max: ");
                for (int i=0;i<10;i++){
                    x1=Double.parseDouble(ttt[i][2]);
                    if (max==x1){
                        System.out.print(ttt[i][0]+" - "+ttt[i][2]+"%; ");//вывод страны и %
                    }
                }
                System.out.println();
                System.out.print("min: ");
                for (int i=0;i<10;i++){
                    x1=Double.parseDouble(ttt[i][2]);
                    if (min==x1){
                        System.out.print(ttt[i][0]+" - "+ttt[i][2]+"%; ");
                    }
                }


            }
            if (z1.equals("Основываясь на этих цифрах, оцените общую численность населения всех десяти стран")){
                double summastran=0;
                for(int i=0;i<10;i++){
                    x=Integer.parseInt(ttt[i][1]);//значения из таблицы 2
                    x1=Double.parseDouble(ttt[i][3]);//значения из таблицы 4
                    summastran+= x/x1*100;//кол-во иммигрантов делим на процент популяции

                }
                System.out.printf("%.0f ",summastran);
            }
            if (z1.equals("end")){
                break;
            }

        }

	}

}
