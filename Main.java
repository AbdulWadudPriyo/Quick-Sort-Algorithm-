package javaapplication8;

public class Main {
public static void main(String[] args) {

QuickSortExample qse = new QuickSortExample();

int[] arr = {2,8,5,10,3,7};
int n = arr.length;

System.out.println(&quot;Unsorted array:&quot;);
qse.printArray(arr);

qse.quickSort(arr, 0, n - 1);

System.out.println(&quot;Sorted array:&quot;);
qse.printArray(arr);

long startTime = System.nanoTime();
long st = System.currentTimeMillis();
long s = System.nanoTime();

for (int i = 0; i &lt; 1000000; i++) {

Math.sqrt(i);

}

long endTime = System.nanoTime();
long et = System.currentTimeMillis();
long e = System.nanoTime();

long duration = endTime - startTime;
long dt = et - st;
double executionTimeInSeconds = (e - s) / 1000000000.0;

System.out.println(&quot;Execution time in nanoseconds: &quot; + duration);
System.out.println(&quot;Execution time in milliseconds: &quot; + dt);

System.out.println(&quot;Execution time: &quot; + executionTimeInSeconds + &quot;
seconds&quot;);
}

}