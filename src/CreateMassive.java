public class CreateMassive {
    int sumMain;
    int sumOth;
    public void printMassive(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < arr.length; i++, System.out.println()) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }

    public void diagMainSum(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    sumMain = sumMain + arr[i][j];
                }
            }
        }
        System.out.println("Сумма элементов на главной диагонали = " + sumMain);
    }
    public void diagOthSum(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i ==(arr.length -j-1)) {
                    sumOth = sumOth + arr[i][j]; // a [i, (n + 1 - i)]
                }
            }
        }
        System.out.println("Сумма элементов на побочной диагонали = " + sumOth);
    }
    public void diagBothSum(){
        System.out.println("Сумма элементов на двух диагоналях = " + (sumMain+sumOth));
    }
}





