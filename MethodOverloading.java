// Objective: Demonstrate Method Overloading.
class Playground {
    public static void main(String[ ] args) {
        System.out.println("Hello Java");
        calculateScore("Christian", 100);
        calculateScore("4", 7);
    }
    
    public static int calculateScore(String player, int points){
        int answer = points * 1000;
        System.out.println("Player: " + player + " scored: " + answer + ".");
        return answer;
    }

    // overloading calculateScore
    // overloaded methods cannot have the same signature
    public static void calculateScore(int z, int y){
        System.out.println(z);
    }
}
