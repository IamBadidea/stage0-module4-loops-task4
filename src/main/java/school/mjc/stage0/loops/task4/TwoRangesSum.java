package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int summUntil = 0;
        int summAfter = 0;

        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bigger then the last");
        }

        if (numberToSkip <= lastInRow) {
            for (int i = 1; i <= numberToSkip; i++) {
                summUntil += i;
            }
            for (int i = numberToSkip + 1; i <= lastInRow; i++) {
                summAfter += i;
            }
            System.out.printf("skipped sum is %d\ncounted sum is %d\n", summUntil, summAfter);
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        }

    }
}
