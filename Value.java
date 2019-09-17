import java.util.Scanner;

class Value {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = null, name2 = null, name3 = null;
        int score1 = 0, score2 = 0, score3 = 3;
        int banyak = in.nextInt();

        if (banyak >= 3) {
            for (int i = 0; i < banyak; i++) {
                String candidate = in.next();
                int candidatescore = in.nextInt();
                if (name1 == null) {
                    name1 = candidate;
                    score1 = candidatescore;
                } else if (name2 == null) {
                    if (candidatescore > score1) {
                        name2 = name1;
                        score2 = score1;
                        name1 = candidate;
                        score1 = candidatescore;
                    } else {
                        name2 = candidate;
                        score2 = candidatescore;
                    }
                } else if (name3 == null) {
                    if (candidatescore > score1) {
                        name3 = name2;
                        score3 = score2;
                        name2 = name1;
                        score2 = score1;
                        name1 = candidate;
                        score1 = candidatescore;
                    } else if (candidatescore > score2) {
                        name3 = name2;
                        score3 = score2;
                        name2 = candidate;
                        score2 = candidatescore;
                    } else {
                        name3 = candidate;
                        score3 = candidatescore;
                    }
                } else {
                    if (candidatescore > score1) {
                        name3 = name2;
                        score3 = score2;
                        name2 = name1;
                        score2 = score1;
                        name1 = candidate;
                        score1 = candidatescore;
                    } else if (candidatescore > score2) {
                        name3 = name2;
                        score3 = score2;
                        name2 = name1;
                        score2 = score1;
                        name2 = candidate;
                        score2 = candidatescore;
                    } else if (candidatescore > score3) {
                        name3 = candidate;
                        score3 = candidatescore;
                    }
                }
            }
            System.out.println(score1 + score2 + score3);
            System.out.printf("%s\n%s\n%s\n", name1, name2, name3);
        } else {
            System.out.println("...");
        }
    }
}