public class PossiblePath{
    public static boolean canReachPoint(int a, int b, int x, int y) {
        // Base case: If Adam is already at the target point (x, y), return true
        if (a == x && b == y) {
            return true;
        }

        // If Adam has moved beyond the target point, or if the target point is unreachable
        if (a > x || b > y) {
            return false;
        }

        // Recursive calls for each possible move
        return canReachPoint(a + b, b, x, y) || canReachPoint(a, a + b, x, y) ||
                canReachPoint(a - b, b, x, y) || canReachPoint(a, b - a, x, y);
    }

    public static void main(String[] args) {
        int startX = 1, startY = 1;
        int targetX = 4, targetY = 5;

        boolean reachable = canReachPoint(startX, startY, targetX, targetY);
        System.out.println("Can Adam reach point (" + targetX + ", " + targetY + ")? " + reachable);
    }
}

