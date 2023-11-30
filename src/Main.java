public class Main {
    public Main() {
    }

    public static void main() {
        Author malyshev = new Author("Ростислав", "Малышев");
        Author lebedeva = new Author("Кристина", "Лебедева");
        Book smallAndRemote = new Book("Маленький, да удаленький", 2000, malyshev);
        Book swanLake = new Book("Лебединое озеро", 2020, lebedeva);
        swanLake.setYear(1996);
    }
}
