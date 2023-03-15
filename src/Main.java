public class Main {
    public static void main(String[] args) {

            System.out.println("Домашняя работа № 13");
            Author bulgakov = new Author("Михаил ", "Булгаков");
            Author tolstoy = new Author("Лев ", "Толстой");
            System.out.println("Булгаков не Толстой " + bulgakov.equals(tolstoy));
            Book masterAndMargarita =  new Book("Мастер и Маргарита", bulgakov, 2022);
            System.out.println(masterAndMargarita);
            Book annaKarenina = new Book("Анна Каренина", tolstoy , 1907);
            System.out.println(annaKarenina);
            masterAndMargarita.setYearPublication(1940);
            System.out.println("masterAndMargarita.setYearPublication = " + masterAndMargarita.getYearPublication());
            }

    }
