package Weekly196;

public class LC1503 {
    //数学问题, 判断朝向离终点最远的何时到达
    public int getLastMoment(int n, int[] left, int[] right) {
        int leftMax = 0, rightMin = n;
        for (int l : left) leftMax = Math.max(l, leftMax);
        for (int r : right) rightMin = Math.min(r, rightMin);
        return Math.max(leftMax, n - rightMin);
    }
}
