package ihablab3;

public class UML {
    int GCD(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        if (b == 0) return a;
        return GCD(b, a % b);
    }

    int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 1;
        return n * factorial(n - 1);
    }

    int fibonacci(int n) {
        if (n < 0) return -1;
        if (n < 2) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    double power(double x, int n) {
        if (n == 0) return 1;
        if (n < 0) return 1 / power(x, -n);
        return x * power(x, n - 1);
    }

    int sumofdigits(int n) {
        n = Math.abs(n);
        if (n < 10) return n;
        return n % 10 + sumofdigits(n / 10);
    }

    void recursivelinearsearch(int[] arr, int index, int x) {
        if (index >= arr.length) {
            System.out.println("Not found (-1)");
            return;
        }
        if (arr[index] == x) {
            System.out.println(x + " is found at index " + index);
            return;
        }
        recursivelinearsearch(arr, index + 1, x);
    }

    void BinarySearch(int[] arr, int left, int right, int x) {
        if (left > right) {
            System.out.println("Not found (-1)");
            return;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == x) {
            System.out.println(x + " is found at index " + mid);
        } else if (x < arr[mid]) {
            BinarySearch(arr, left, mid - 1, x);
        } else {
            BinarySearch(arr, mid + 1, right, x);
        }
    }

    boolean issorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    int arraysum(int[] arr, int n) {
        if (n <= 0) return 0;
        return arr[n - 1] + arraysum(arr, n - 1);
    }
}
