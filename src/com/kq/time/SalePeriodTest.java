package com.kq.time;

/**
 * SalePeriodTest
 *
 * @author kq
 * @date 2023-05-19 23:04
 * @since 1.0.0
 */
import java.util.ArrayList;
import java.util.List;

class SalePeriod {
    private String name;
    private String startTime;
    private String endTime;

    public SalePeriod(String name, String startTime, String endTime) {
        this.name = name;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public String getName() {
        return name;
    }

    public String getStartTime() {
        return startTime;
    }

    public String getEndTime() {
        return endTime;
    }
}

public class SalePeriodTest {
    public static void main(String[] args) {
        List<SalePeriod> salePeriods = new ArrayList<>();

        // 添加销售时段
        salePeriods.add(new SalePeriod("Sale Period 1", "09:00", "12:00"));
        salePeriods.add(new SalePeriod("Sale Period 2", "14:00", "16:00"));
        salePeriods.add(new SalePeriod("Sale Period 3", "17:00", "19:00"));
        salePeriods.add(new SalePeriod("Sale Period 4", "20:00", "22:00"));
        salePeriods.add(new SalePeriod("Sale Period 4", "08:00", "10:00"));

        // 检查销售时段的开始和结束时间是否重叠
        if (checkNonOverlapping(salePeriods)) {
            System.out.println("所有销售时段的时间都不重叠。");
        } else {
            System.out.println("存在时间重叠的销售时段。");
        }
    }

    public static boolean checkNonOverlapping(List<SalePeriod> salePeriods) {
        for (int i = 0; i < salePeriods.size(); i++) {
            SalePeriod currentSalePeriod = salePeriods.get(i);
            for (int j = i + 1; j < salePeriods.size(); j++) {
                SalePeriod otherSalePeriod = salePeriods.get(j);
                if (isOverlapping(currentSalePeriod, otherSalePeriod)) {
                    return false; // 时间重叠
                }
            }
        }
        return true; // 所有销售时段的时间都不重叠
    }

    public static boolean isOverlapping(SalePeriod salePeriod1, SalePeriod salePeriod2) {
        // 将时分格式的时间转换为分钟表示
        int start1 = convertToMinutes(salePeriod1.getStartTime());
        int end1 = convertToMinutes(salePeriod1.getEndTime());
        int start2 = convertToMinutes(salePeriod2.getStartTime());
        int end2 = convertToMinutes(salePeriod2.getEndTime());

        // 检查时间是否重叠
        return start1 <= end2 && end1 >= start2;
        // this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime)
    }

    public static int convertToMinutes(String time) {
        String[] parts = time.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return hours * 60 + minutes;
    }
}
