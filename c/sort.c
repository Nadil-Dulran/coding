#include <stdio.h>

int main() {
    int arr1[] = {2, 6, 3, 4, 9, 2, 7, 4};
    int n = sizeof(arr1) / sizeof(arr1[0]);

    // Simple bubble sort
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (arr1[j] > arr1[j + 1]) {
                int temp = arr1[j];
                arr1[j] = arr1[j + 1];
                arr1[j + 1] = temp;
            }
        }
    }

    printf("Sorted Array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr1[i]);
    }

    return 0;
}
