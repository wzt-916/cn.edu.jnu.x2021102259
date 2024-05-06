package cn.edu.jnu.cnedujnux2021102259;
public class Game {
    private int score = 0;

    public void roll(int pins) {
        score += pins;
    }

    public int score() {
        return score;
    }
}

