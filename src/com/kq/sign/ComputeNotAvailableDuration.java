package com.kq.sign;

/**
 * @author kq
 * @date 2021-07-06 18:49
 * @since 2020-0630
 */
public class ComputeNotAvailableDuration {

    private static long[] latencyMax = {50L, 100L, 550L, 1000L, 2000L, 3000L, 15000L}; /**单位 ms */
    private static long[] notAvailableDuration = {0L, 0L, 30000L, 60000L, 120000L, 180000L, 600000L};

    private static long computeNotAvailableDuration(final long currentLatency) { // TODO updateFaultItem
        for (int i = latencyMax.length - 1; i >= 0; i--) { // 假设3500   notAvailableDuration是180000L
            if (currentLatency >= latencyMax[i]) // latencyMax: {50L, 100L, 550L, 1000L, 2000L, 3000L, 15000L}
                return notAvailableDuration[i]; // {0L, 0L, 30000L, 60000L, 120000L, 180000L, 600000L} // ms
        }

        return 0;
    }


    public static void main(String[] args) {
        long currentLatency = 3500;
        System.out.println("currentLatency="+currentLatency+" , "+computeNotAvailableDuration(currentLatency));

        currentLatency = 2000L;
        System.out.println("currentLatency="+currentLatency+" , "+computeNotAvailableDuration(currentLatency));

    }


}
