package multidimensionalArray;

public class ExoM8 {

    public static void main(String[] args) {
        char[][] chars = new char[][]{{'b','a','c'},{'f','h','g'},{'z','x','y'}};
        for (int i = 0; i < chars.length; i++) {
            for (int j = i+1; j <chars[i].length ; j++) {
                if (chars[i][j]>chars[i][j]){
                    char temp=chars[i][j];
                    chars[i][j]=chars[i][j+1];
                    chars[i+1][j+1]=temp;
                }
                System.out.println("args = " + chars[i][j]);
            }
        }

    }
}
