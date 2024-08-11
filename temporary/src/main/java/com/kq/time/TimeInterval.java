package com.kq.time;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TimeInterval {
    private LocalTime startTime;
    private LocalTime endTime;

    public TimeInterval(LocalTime startTime, LocalTime endTime) {
        if (startTime.isAfter(endTime)) {
            throw new IllegalArgumentException("开始时间不能晚于结束时间");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public boolean overlaps(TimeInterval other) {
        return (this.startTime.isBefore(other.endTime) && this.endTime.isAfter(other.startTime));
    }

    public static void main(String[] args) {
        TimeIntervalManager manager = new TimeIntervalManager();
        TimeInterval interval1 = new TimeInterval(LocalTime.of(9, 0), LocalTime.of(12, 0));
        TimeInterval interval2 = new TimeInterval(LocalTime.of(13, 0), LocalTime.of(18, 0));
        TimeInterval interval3 = new TimeInterval(LocalTime.of(18, 30), LocalTime.of(22, 0));

        manager.addTimeInterval(interval1);
        manager.addTimeInterval(interval2);
        manager.addTimeInterval(interval3);

        System.out.println(manager.checkConflicts()); // 输出: false

//        TimeInterval overlappingInterval = new TimeInterval(LocalTime.of(11, 0), LocalTime.of(14, 0));
        TimeInterval overlappingInterval = new TimeInterval(LocalTime.of(8, 0), LocalTime.of(11, 30));
        manager.addTimeInterval(overlappingInterval);

        System.out.println(manager.checkConflicts()); // 输出: true
    }
}

class TimeIntervalManager {
    private List<TimeInterval> timeIntervals;

    public TimeIntervalManager() {
        timeIntervals = new ArrayList<>();
    }

    public void addTimeInterval(TimeInterval newInterval) {
        timeIntervals.add(newInterval);
    }

    public boolean checkConflicts() {
        for (int i = 0; i < timeIntervals.size(); i++) {
            for (int j = i + 1; j < timeIntervals.size(); j++) {
                if (timeIntervals.get(i).overlaps(timeIntervals.get(j))) {
                    return true;
                }
            }
        }
        return false;
    }


}
