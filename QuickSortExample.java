package javaapplication8;

public class QuickSortExample {

public static int partition(int[] arr, int low, int high) {
int pivot = arr[high];
int i = (low - 1);

for (int j = low; j &lt; high; j++) {

if (arr[j] &lt;= pivot) {
i++;

int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;
}
}

int temp = arr[i + 1];

arr[i + 1] = arr[high];
arr[high] = temp;

return i + 1;
}

public static void quickSort(int[] arr, int low, int high) {
if (low &lt; high) {

int pi = partition(arr, low, high);

quickSort(arr, low, pi - 1);
quickSort(arr, pi + 1, high);
}
}

public static void printArray(int[] arr) {
int n = arr.length;
for (int i = 0; i &lt; n; ++i)
System.out.print(arr[i] + &quot; &quot;);
System.out.println();
}

}