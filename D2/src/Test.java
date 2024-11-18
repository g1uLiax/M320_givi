public class Test {

    private int totalPoints;

    Test(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public float calculateGrade(int points) {
        return points * 5 / totalPoints + 1;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}
