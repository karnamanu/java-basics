public class jaggedArray {
    public static int[][]  jagArr(){
        int [][] obj= new int[3][];

        obj[0] = new int[4];
        obj[1] = new int[2];
        obj[2] = new int[3];

        for (int[] obj1 : obj) {
            for (int j = 0; j < obj1.length; j++) {
                obj1[j] = (int)(Math.random()*10);
            }
        }
        
        return obj;
    }
    public static void main(String[] args) {
        int [][] v = jagArr();

        for (int[] v1 : v) {
            for (int j = 0; j < v1.length; j++) {
                System.out.print(v1[j]+ " ");
            }
            System.out.println();
        }
    }
}
