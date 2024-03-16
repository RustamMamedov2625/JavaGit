package Yandex.Contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task25 {
    static class Cherry implements Comparable<Cherry>{
        private int number;
        private int up;
        private int down;

        public Cherry(int up, int down, int number){
            this.up = up;
            this.down = down;
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public int getDown() {
            return down;
        }
        public int getUp(){
            return up;
        }

        @Override
        public int compareTo(Cherry object){
            if(this.up != object.up){
                return Integer.compare(this.up, object.up);
            }
            else {
                return Integer.compare(this.up - this.down, this.up - this.down);
            }
        }

    }
    public static void findMaxWay() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputN = reader.readLine();
        int n = Integer.parseInt(inputN);
        int sumWays = 0;
        int maxWay = 0;
        ArrayList<Cherry> waysList = new ArrayList<>();

        for (int i = 1; i < n + 1; i++) {
            String[] inputWays = reader.readLine().split(" ");
            waysList.add(new Cherry(Integer.parseInt(inputWays[0]), Integer.parseInt(inputWays[1]), i));
        }

        Collections.sort(waysList);

        for(int i = waysList.size() - 1; i >= 0; i--){
            sumWays += waysList.get(i).getUp();
            if(sumWays > maxWay)
                maxWay = sumWays;
            sumWays -= waysList.get(i).getDown();
        }

        System.out.println(maxWay);
        for(int i = waysList.size() - 1; i >= 0; i--){
            System.out.print(waysList.get(i).getNumber() + " ");
        }
    }

}
