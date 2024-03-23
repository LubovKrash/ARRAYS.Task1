package ru.netology.stats;

public class StatsService {
    public long sumSales(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales;
    }

    public long averageSales(long[] sales) {
        long totalSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
        }
        return totalSales / sales.length;
    }

    public int monthMaxSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthMinSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthBelowAverageSales(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale < averageSales) {
                counter++;
            }
        }
        return counter;
    }

    public int monthAboveAverageSales(long[] sales) {
        int counter = 0;
        long averageSales = averageSales(sales);
        for (long sale : sales) {
            if (sale > averageSales) {
                counter++;
            }
        }
        return counter;
    }
}


