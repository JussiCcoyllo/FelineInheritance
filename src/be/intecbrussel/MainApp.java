package be.intecbrussel;

public class MainApp {
    public static void main(String[] args) {

        Animal animal = new Animal();

        Panthera pant = new Panthera('M','M',"black",150);
        Acinonyx aci = new Acinonyx('L','L',"gray",140);
        NorwegianForestCat nc = new NorwegianForestCat('M','M',"brown",130);
        PersianCat pc = new PersianCat(333, 543); //gets shelterNo: 333 and badgeNo: 543
        SiameseCat sc= new SiameseCat(333, 543); //get shelterNo: 333 and badgeNo: 543
        TurkishVanCat tk = new TurkishVanCat('M','M',"Black",125);
        AndeanMountainCat ac = new AndeanMountainCat('L','L',"Gray",123);

        Felis felis01 = new Felis("Mimi", 4, 333, 345);
        Felis felis02 = new Felis("Michi", 2, 334, 346);
        Felis felis03 = new Felis("Momo", 4,333,765);
        Felis felis04 = new Felis("Michifus",6,356,134);
        Felis felis05 = new Felis("Manito", 2, 345, 322);
        Felis felis06 = new Felis("Miaomiao", 5, 341,246);
        Felis felis07 = new Felis("Pupus", 1, 333,765);

        Felis[] race = {felis01, felis02, felis03, felis04, felis05, felis06, felis07};

        for(Felis r: race) {
            System.out.println(r);
        }

        System.out.println(felis03.equals(felis07));
        System.out.println(pc.equals(sc));

        System.out.println(Animal.animalCount);
        System.out.println(Felis.getVaccinationCats());

        System.out.println(pant);
        pant.hunt();
        pant.roar();

        System.out.println(aci);
        aci.run(7);
        aci.kiauuww();

        System.out.println(nc);
        nc.toString();

        System.out.println(ac);
        ac.miauw();
        ac.isAlive();

        System.out.println(sc);

        System.out.println(pc);
        pc.miauw();

        System.out.println(tk);
        System.out.println(tk.nickname());

    }
}
