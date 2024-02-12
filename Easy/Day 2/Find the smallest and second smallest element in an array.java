
class Compute {
    public long[] minAnd2ndMin(long a[], long n) {
        long arr[] = { -1, -1 };
        long min = Long.MAX_VALUE;
        long secMin = Long.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] < min) {
                secMin = min;
                min = a[i];
            } else if (a[i] != min && a[i] <= secMin) {
                secMin = a[i];
            }
        }

        if (secMin == Long.MAX_VALUE) {
            secMin = -1;
            min = -1;

        }
        arr[0] = min;
        arr[1] = secMin;

        return arr;
    }
}
