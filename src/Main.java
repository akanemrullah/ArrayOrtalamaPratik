public class Main {
    public static void main(String[] args) {

        // Degiskenler ve varsayilan atamalari gerceklestirildi.
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0, counter = 1;

        // Istenen sonuca ulasabilmek adina gerekli dongu ve mantiksal islemler gerceklestirildi.
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers.length/(1/counter);
        }
        // Mantiksal islemler ardindan sonuc kullanici ile paylasildi.
        System.out.println(sum / numbers.length);
    }
}