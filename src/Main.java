public class Main {
    public static void main(String[] args) {

        int [][] table= {
                {2, 4, 3, 4, 5, 8, 8},
                {7, 3, 4, 3, 3, 4, 4},
                {3, 3, 4, 3, 3, 2, 2},
                {9, 3, 4, 7, 3, 4, 1},
                {3, 5, 4, 3, 6, 3, 8},
                {3, 4, 4, 6, 3, 4, 4},
                {3, 7, 4, 8, 3, 8, 4},
                {6, 3, 5, 9, 2, 7, 9}
        };

        String [] employe={"Oliver","Rasmus","Robert","Mikkel","Jonas","Andreas","Alexander","Mathias"};

        int sumTimer=0;

        for(int i=0;i<8;i++){
            for(int j=0;j<7;j++){
                sumTimer+=table[i][j];
            }
            System.out.println(employe[i]+" har arbejdet "+sumTimer+" timer");
            sumTimer=0;
        }
    }
}