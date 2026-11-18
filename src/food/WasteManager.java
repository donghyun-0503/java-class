package food;

import java.util.ArrayList;

public class WasteManager {
    private ArrayList<Food> foods = new ArrayList<>();
    public static final double TARGET_RATE = 20.0;

    public void addFood(Food food) {
        foods.add(food);
    }

    public void printReport() {
        if (foods.isEmpty()) {
            System.out.println("등록된 음식이 없습니다.");
            return;
        }

        System.out.println("===== 학교 급식 잔반 분석 결과 =====");
        double totalServed = 0;
        double totalWaste = 0;

        for (Food f : foods) {
            System.out.println("음식명: " + f.getName());
            System.out.printf("배식량: %.1fg%n", f.getServedGrams());
            System.out.printf("잔반량: %.1fg%n", f.getWasteGrams());
            System.out.printf("잔반율: %.1f%%%n", f.getWasteRate());
            System.out.println("개선 안내: " + f.getAdvice()); // 다형성
            System.out.println();
            totalServed += f.getServedGrams();
            totalWaste += f.getWasteGrams();
        }

        double totalRate = totalWaste / totalServed * 100;
        System.out.println("===== 전체 잔반 분석 =====");
        System.out.printf("전체 배식량: %.1fg%n", totalServed);
        System.out.printf("전체 잔반량: %.1fg%n", totalWaste);
        System.out.printf("전체 잔반율: %.1f%%%n", totalRate);

        if (totalRate <= TARGET_RATE) {
            System.out.println("목표 잔반율을 달성했습니다.");
        } else {
            System.out.println("잔반을 줄이기 위한 개선이 필요합니다.");
        }
    }
}
