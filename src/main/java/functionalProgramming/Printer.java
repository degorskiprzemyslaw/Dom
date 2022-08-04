package functionalProgramming;

public interface Printer {
    public String print(String text);




    public static void main(String[] args) {

        Printer shout = (text) -> text.toUpperCase() + "!";
        System.out.println(shout.print("Wykrzycz ten tekst"));

        Printer firstLetterSentence = (String text) ->{
            String result = "";
            String[] textArray = text.split(" ");
            for (int i = 0; i < textArray.length; i++) {
                result+=textArray[i].charAt(0);
            }
        return result;
        };

        System.out.println(firstLetterSentence.print("Stworz tekst z pierwszych liter"));

    }
}






   /* Stwórz interfejs Printer, posiadający jedną metodę, print, przyjmującą argument typu String,
   wykorzystaj ten interfejs do zaimplementowania lambdą funkcji:

        funkcja krzycząca, która wyświetla tekst wielkimi literami i dodaje wykrzyknik
        funkcja wyświetlająca napis stworzony z pierwszej litery każdego słowa (trudne)*/

