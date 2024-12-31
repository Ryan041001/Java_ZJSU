package Point;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Point> pointList = new ArrayList<Point>();
        Point p1 = new Point(10, 5, 7);
        Point p2 = new Point(6, 15, 12);
        Point p3 = new Point(3, 7, 6);
        Point p4 = new Point(24, 15, 16);
        Point p5 = new Point(31, 17, 26);

        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);
        pointList.add(p4);
        pointList.add(p5);

        List<Double> distanceList = new ArrayList<>();
        distanceList.add(p1.distance());
        distanceList.add(p2.distance());
        distanceList.add(p3.distance());
        distanceList.add(p4.distance());
        distanceList.add(p5.distance());
        Collections.sort(distanceList);
        System.out.println("按到圆心距离排序（升序）：");
        for (double distance : distanceList) {
            System.out.println(distance);
        }
    }
}
