package tdd;

public class Sort {
    private int sorted;
    private String sorting;

    //public Sort(int number1,int number2,int number3){

    //}


    public void setSorted(int number1,int number2, int number3) {
        int highestNumber = number1;
        int middleNumber = number1;
        int smallestNumber = number1;
        if (number1 > highestNumber){
            highestNumber = number1;
        }
        if (number2 > highestNumber){
            highestNumber = number2;
        }
        if (number3 > highestNumber){
            highestNumber = number3;
        }
        if (number1 < smallestNumber){
            smallestNumber = number1;
        }
        if (number2 < smallestNumber){
            smallestNumber = number2;
        }
        if (number3 < smallestNumber){
            smallestNumber = number3;
        }
        if (number1 > smallestNumber && number1 < highestNumber){
            middleNumber = number1;
        }
        if (number2 > smallestNumber && number2 < highestNumber){
            middleNumber = number2;
        }
        if (number3 > smallestNumber && number3 < highestNumber){
            middleNumber = number3;
        }
        sorting = smallestNumber+","+middleNumber+","+highestNumber;
    }

    public int getSorted() {
        return sorted;
    }

    public void setSorting(String sorting) {
        this.sorting = sorting;
    }

    public String getSorting() {
        return sorting;
    }
}
