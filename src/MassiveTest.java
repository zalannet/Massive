public class MassiveTest {
    public static void main(String[] args) {
        CreateMassive createMassive = new CreateMassive();
        int a = (int) (Math.random()*10);
        int[][] arr = new int[a][a];
        createMassive.printMassive(arr);
        createMassive.diagMainSum(arr);
        createMassive.diagOthSum(arr);
        createMassive.diagBothSum();

    }
}

