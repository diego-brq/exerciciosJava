public class Annalyn {
    public static void main(String[] args) {

        boolean knightIsAwake = true;
        boolean archerIsAwake = true;
        boolean prisionerIsAwake = true;
        boolean haveDog = true;

        // Condição para fast attack

        if (!knightIsAwake) {
            System.out.println("Can fast attack");
        } else {
            System.out.println("Can't fast attack");
        }

        // Condição para canSpy

        if (knightIsAwake || !archerIsAwake) {
            System.out.println("Can't spy");
        } else {
            System.out.println("Can spy");
        }

        // Condição para canSignal

        if (prisionerIsAwake && !archerIsAwake) {
            System.out.println("Can signal");
        } else {
            System.out.println("Can't signal");
        }

        // Condição para can escape

        boolean canFree = false;
        if (haveDog) {
            canFree = !archerIsAwake;
        } else {
            canFree = prisionerIsAwake && !knightIsAwake && !archerIsAwake;
        }

        if (canFree) {
            System.err.println("Can free prisioner!");
        } else {
            System.out.println("Can't free prisioner");
        }
    }

}