public class Quinary {
    public static void main(String[] args) {
        int initialNum = 97;
        String answer = "";
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;
        int threeCount = 0;
        int fourCount = 0;
        int currentNum = initialNum;

        while ( currentNum > 0){
            int digit = currentNum % 5;

            if (digit == 0){
                zeroCount++;
            }
            else if (digit == 1) {
                oneCount++;
            }
            else if (digit == 2) {
                twoCount++;
            }
            else if (digit == 3) {
                threeCount++;
            }
            else if (digit == 4) {
                fourCount++;
            }

            answer = digit + answer;
            currentNum /= 5;
        }
        System.out.println("Decimal representation: " + initialNum);
        System.out.println("Quinary representation: " + answer);
        System.out.println(zeroCount + " zero(s), " + oneCount + " one(s), " + twoCount + " two(s), " + threeCount + " three(s), " + fourCount + " four(s)");

        int digitSum = 0 * zeroCount + 1 * oneCount + 2 * twoCount + 3 * threeCount + 4 * fourCount;

        switch (digitSum % 5) {
            case 0:
                System.out.println("The Quinary digits sum to a multiple of 5!");
                break;
            case 1:
                System.out.println("The Quinary digits almost summed to a multiple of 5!");
                break;
            case 4:
                System.out.println("So close!");
                break;
            default:
                System.out.println("Nope!");
        }
        String result = (zeroCount > oneCount && zeroCount > twoCount && zeroCount > threeCount && zeroCount > fourCount) ? "Zero if the most used digit.": "Zero is not the most used digit.";
        System.out.println(result);
    }
}
