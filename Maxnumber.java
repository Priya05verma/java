public class Maxnumber {
    public static void main(String[] args) {
        int [] marks = {89,67,45,99,90};
        int max = Integer.MIN_VALUE;
        for(int element : marks){
            if(element>max){
                max = element;
            }
        }
        System.out.println(max);
    }
}
