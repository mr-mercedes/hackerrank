# Repository for training to solve tasks to Java #
*All task get from web site https://www.hackerrank.com/*

**Structure of repo**

1. Date of solve the task
2. Name of the task with link
3. Description to solve the task


16.03.2023
--
__[Java Stdin and Stdout I](https://www.hackerrank.com/challenges/java-stdin-and-stdout-1)__
* Simple solve without using add component of Java

__[Plus Minus](https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus)__
* Solve with cycle for, in [Discussion](https://www.hackerrank.com/challenges/one-week-preparation-kit-plus-minus/forum)
is the solve with Java Stream API (forEach) 
``public static void plusMinus(List<Integer> arr) {
  AtomicInteger negatives = new AtomicInteger(0);
  AtomicInteger zeros = new AtomicInteger(0);
  AtomicInteger positives = new AtomicInteger(0);
  arr.forEach(n -> {
  if (n<0) negatives.getAndIncrement();
  else if (n==0) zeros.getAndIncrement();
  else positives.getAndIncrement();
  });
  printRatio(positives.get() / (float)arr.size());
  printRatio(negatives.get() / (float)arr.size());
  printRatio(zeros.get() / (float)arr.size());
  }
  private static void printRatio(Float f) {
  System.out.printf("%.6f\n", f);
  }``

__[Mini-Max Sum](https://www.hackerrank.com/challenges/one-week-preparation-kit-mini-max-sum)__
* Solve with Collections.sort and add custom function sum with 2 arguments List<Integer> and boolean marker

__[Time Conversion](https://www.hackerrank.com/challenges/one-week-preparation-kit-time-conversion)__
* Solve with if-else construction and String.format

__[Find_Median](https://www.hackerrank.com/test/eoipgdk427n/login?b=eyJocnNjIjp0cnVlLCJocnNjX3NyYyI6ImpvYnNhcHAiLCJoaWRlIjp0cnVlLCJqb2JfaWQiOm51bGwsInVzZXJuYW1lIjoiZWt5ZDkxQG1haWwucnUiLCJwYXNzd29yZCI6ImJhNjVlMzJkIiwiaGlkZVN3aXRjaEFjY291bnQiOnRydWUsImhpZGVTaGFyZUhhY2tlclByb2ZpbGUiOnRydWUsImFjY29tbW9kYXRpb25zIjpudWxsfQ==)__
* Simple solve with Collections.sort

