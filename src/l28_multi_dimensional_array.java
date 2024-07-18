public class l28_multi_dimensional_array {
    public static void main(String[] args) {
        System.out.println("MULTI DIMENSIONAL ARRAY");
//  2-D Array
        int [] marks;   // 1-D Array
        float [][] floors = {{1.1f,1.2f,1.3f,1.4f,1.5f},
                            {2.1f,2.2f,2.3f,2.4f,2.5f},
                            {3.1f,3.2f,3.3f,3.4f,3.5f},
                            {4.1f,4.2f,4.3f,4.4f,4.5f}}; // 2-D Array
        System.out.println("Length of the Array-floors is : "+floors.length);
        for (int i=0; i<= floors.length; i++){
            for (int j=0; j<=4; j++){
            System.out.print(floors[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println("------------------------");
        int [][] flats = new int[2][3];
        flats[0][0]=101;
        flats[0][1]=102;
        flats[0][2]=103;
        flats[1][0]=201;
        flats[1][1]=202;
        flats[1][2]=203;
        for (int i=0; i<= flats.length; i++){
            for (int j=0; j<=3;j++){
            System.out.print(flats[i][j]+", ");
            }
        }
    }
}
