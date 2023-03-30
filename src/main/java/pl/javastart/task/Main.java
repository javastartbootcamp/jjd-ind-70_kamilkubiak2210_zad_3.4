package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Category categoryBatony = new Category("Batony", "każdy kocha batony");
        Category categoryZelki = new Category("Żelki", "smak radości dla dzieci i dorosłych");

        Product product1 = new Product("Snickers", 3.6, "Baton z nugatem, orzeszkami ziemnymi w karmelu i czekoladzie.", categoryBatony);
        Product product2 = new Product("Haribo", 10.0,
                "Miks żelków owocowych o smaku truskawkowym, cytrynowym, malinowym, pomarańczowym, ananasowym i jabłkowym.", categoryZelki);
        Product product3 = new Product("Carlsberg", 5.36,
                "duńskie piwo typu lager, dolnej fermentacji, o złocistej barwie, wysublimowanym, chmielowym zapachu i trwałej śnieżnobiałej pianie.", null);
        Product product4 = new Product("Mars", 4.0, "Baton z nugatowego nadzienia oblanego gęstym karmelem i mleczną czekoladą.", categoryBatony);

        System.out.println("Nazawa produktu: " + product1.getName() + "\nCena: " + product1.getPrice() + "zł\nOpis: " + product1.getDescription()
                + "\nKategoria: " + product1.getCategory().getName() + "\n" + product1.getCategory().getDescription());
        System.out.print("\n");
        System.out.println("Nazawa produktu: " + product2.getName() + "\nCena: " + product2.getPrice() + "zł\nOpis: " + product2.getDescription()
                + "\nKategoria: " + product2.getCategory().getName() + "\n" + product2.getCategory().getDescription());
        System.out.print("\n");
        System.out.println("Nazawa produktu: " + product3.getName() + "\nCena: " + product3.getPrice() + "zł\nOpis: " + product3.getDescription());
        System.out.print("\n");
        System.out.println("Nazawa produktu: " + product4.getName() + "\nCena: " + product4.getPrice() + "zł\nOpis: " + product4.getDescription()
                + "\nKategoria: " + product4.getCategory().getName() + "\n" + product4.getCategory().getDescription());
        System.out.print("\n");

        SpecialOffer specialOffer = new SpecialOffer(product2, "oferta limitowana", "od 29.03.2023-05.04.2023", 0.2);

        System.out.println("Specjalna oferta:\n" + specialOffer.getProduct().getName() + "\nCena: " + specialOffer.getProduct().getPrice()
                + "zł\nOpis: " + specialOffer.getProduct().getDescription() + "\nKategoria: " + specialOffer.getProduct().getCategory().getName()
                + "\n" + specialOffer.getProduct().getCategory().getDescription() + "\nOferta: " + specialOffer.getOfferDescription()
                + "\nOferta obowiązuje " + specialOffer.getOfferTime() + "\nRabat wynosi: " + specialOffer.getDiscount());
    }
}
