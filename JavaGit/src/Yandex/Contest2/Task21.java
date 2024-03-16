package Yandex.Contest2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Task21 {
    public static void outlineRectangle() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputK = reader.readLine();
        int k = Integer.parseInt(inputK);

        String[] inputCoordinates = new String[2];

        ArrayList<Integer> coordinatesX = new ArrayList<>();
        ArrayList<Integer> coordinatesY = new ArrayList<>();

        for (int i = 0; i < k; i++) {
            inputCoordinates = reader.readLine().split(" ");
            coordinatesX.add(Integer.parseInt(inputCoordinates[0]));
            coordinatesY.add(Integer.parseInt(inputCoordinates[1]));
        }

        int rectangleLeftX = Collections.min(coordinatesX);
        int rectangleLeftY = Collections.min(coordinatesY);
        int rectangleRightX = Collections.max(coordinatesX);
        int rectangleRightY = Collections.max(coordinatesY);

        System.out.println(rectangleLeftX + " " + rectangleLeftY + " " + rectangleRightX + " " + rectangleRightY);
    }
}
