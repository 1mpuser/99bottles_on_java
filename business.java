public class business {
    public static void main(String[] args) {
        int beerNum = 99;
        String word;
        while (beerNum > 0) {
            int lastIndex = lastNumberOfInt(beerNum);
            word = bottleOrBottlesInRussian(lastIndex);
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива на стене");
            System.out.println("Возьми одну");
            System.out.println("Пусти по кругу");
            beerNum--;
            lastIndex = lastNumberOfInt(beerNum);
            word = bottleOrBottlesInRussian(lastIndex);
            if (beerNum > 0)
                System.out.println(beerNum + " " + word + " пива на стене");
            else
                System.out.println("Нет бутылок пива на стене");
            System.out.println("");
        }
    }

    public static int lastNumberOfInt(int num) {
        String tmpStr = Integer.toString(num);
        String[] arr = tmpStr.split("");
        int lastIndex = Integer.parseInt(arr[arr.length - 1]);
        return lastIndex;
    }

    public static String bottleOrBottlesInRussian(int num) {
        String rusWord;
        if (num == 2 || num == 3 || num == 4)
            rusWord = "бутылки";
        else if (num == 1)
            rusWord = "бутылка";
        else
            rusWord = "бутылок";
        return rusWord;

    }
}
