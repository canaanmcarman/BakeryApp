import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class BakeryApp {
    public static void main(String[] args){
        String answer;
        String sort;

        Scanner keyboard = new Scanner(System.in);

        ArrayList<BakedGoods> bakery = new ArrayList<BakedGoods>();
        ArrayList<String> dietMuffin = new ArrayList<String>();
        dietMuffin.add("Soybean");
        dietMuffin.add("Sugar");
        dietMuffin.add("Eggs");
        dietMuffin.add("Gluten");

        BakedGoods muffin = new BakedGoods("Muffin", 3.0, 2, "07132021", dietMuffin);
        bakery.add(muffin);

        ArrayList<String> dietBananaBread = new ArrayList<String>();
        dietBananaBread.add("Sorghum");
        dietBananaBread.add("Potato");
        dietBananaBread.add("Tapioca Flowers");
        dietBananaBread.add("Banana");
        dietBananaBread.add("Canola Oil");
        dietBananaBread.add("Evaporated Cane Juice");
        dietBananaBread.add("Corn Starch");
        dietBananaBread.add("Eggs");
        BakedGoods bananaBread = new BakedGoods("Banana Bread", 5.95, 5, "08132022", dietBananaBread);
        bakery.add(bananaBread);

        ArrayList<String> dietCinnamonRaisinBread = new ArrayList<String>();
        dietCinnamonRaisinBread.add("Gluten-free flour blend");
        dietCinnamonRaisinBread.add("evaporated cane juice");
        dietCinnamonRaisinBread.add("palm oil");
        dietCinnamonRaisinBread.add("raisins");
        dietCinnamonRaisinBread.add("canola oil");
        dietCinnamonRaisinBread.add("cornstarch");
        dietCinnamonRaisinBread.add("cinnamon");
        dietCinnamonRaisinBread.add("salt");

        BakedGoods cinnamonRaisinBread = new BakedGoods("Cinnamon Raisin Bread", 5.15, 7, "07172021", dietCinnamonRaisinBread);
        bakery.add(cinnamonRaisinBread);

        ArrayList<String> dietHamburgerBuns = new ArrayList<String>();
        dietHamburgerBuns.add("Gluten-free flour blend");
        dietHamburgerBuns.add("evaporated cane juice");
        dietHamburgerBuns.add("cornstarch");
        dietHamburgerBuns.add("yeast");
        dietHamburgerBuns.add("salt");
        dietHamburgerBuns.add("palm oil");
        dietHamburgerBuns.add("xanthan gum");

        BakedGoods hamburgerBuns = new BakedGoods("Hamburger Buns", 5.99, 15, "08012021", dietHamburgerBuns);
        bakery.add(hamburgerBuns);

        ArrayList<String> dietSavoryRolls = new ArrayList<String>();
        dietSavoryRolls.add("Gluten-free flour blend");
        dietSavoryRolls.add("evaporated cane juice");
        dietSavoryRolls.add("cornstarch");
        dietSavoryRolls.add("yeast");
        dietSavoryRolls.add("salt");
        dietSavoryRolls.add("xanthan gum");
        dietSavoryRolls.add("canola oil");
        dietSavoryRolls.add("olive oil");

        BakedGoods savoryRolls = new BakedGoods("Savory Rolls", 3, 5, "08282021",dietSavoryRolls);
        bakery.add(savoryRolls);

        ArrayList<String> dietWhiteBread = new ArrayList<String>();
        dietWhiteBread.add("Gluten-free flour blend");
        dietWhiteBread.add("evaporated cane juice");
        dietWhiteBread.add("aluminium-free");
        dietWhiteBread.add("sodium bicarbonate");
        dietWhiteBread.add("yeast");
        dietWhiteBread.add("palm oil");

        BakedGoods whiteBread = new BakedGoods("White Bread", 11.95, 18, "09012021",dietWhiteBread);
        bakery.add(whiteBread);

        ArrayList<String> dietChocolateCake = new ArrayList<>();
        dietChocolateCake.add("rice flour");
        dietChocolateCake.add("potato starch");
        dietChocolateCake.add("eggs");
        dietChocolateCake.add("sugar");
        dietChocolateCake.add("banana");
        dietChocolateCake.add("cocoa");
        dietChocolateCake.add("vanilla");
        dietChocolateCake.add("alcohol");

        BakedGoods chocolateCake = new BakedGoods("Chocolate Cake", 64.95, 10, "08112021", dietChocolateCake);
        bakery.add(chocolateCake);

        ArrayList<String> dietRedVelvetCake = new ArrayList<>();
        dietRedVelvetCake.add("red dye");
        dietRedVelvetCake.add("banana");
        dietRedVelvetCake.add("corn starch");
        dietRedVelvetCake.add("tapioca flour");
        dietRedVelvetCake.add("eggs");
        dietRedVelvetCake.add("vanilla");

        BakedGoods redVelvetCake = new BakedGoods("Red Velvet Cake", 64.95, 4, "07282021", dietRedVelvetCake);
        bakery.add(redVelvetCake);

        ArrayList<String> dietLemonCake = new ArrayList<>();
        dietLemonCake.add("lemon");
        dietLemonCake.add("banana");
        dietLemonCake.add("corn starch");
        dietLemonCake.add("tapioca flour");
        dietLemonCake.add("eggs");
        dietLemonCake.add("vanilla");

        BakedGoods lemonCake = new BakedGoods("Lemon Cake", 64.95, 7, "07282021", dietLemonCake);
        bakery.add(lemonCake);

        ArrayList<String> dietStrawberryCake = new ArrayList<>();
        dietStrawberryCake.add("eggs");
        dietStrawberryCake.add("strawberry");
        dietStrawberryCake.add("rice flour");
        dietStrawberryCake.add("potato starch");
        dietStrawberryCake.add("vanilla");
        dietStrawberryCake.add("alcohol");

        BakedGoods strawberryCake = new BakedGoods("Strawberry Cake", 64.95, 8, "07302021", dietStrawberryCake);
        bakery.add(strawberryCake);

        ArrayList<String> dietMintChocolateCookie = new ArrayList<String>();
        dietMintChocolateCookie.add("mint");
        dietMintChocolateCookie.add("chocolate");
        dietMintChocolateCookie.add("blue dye");
        dietMintChocolateCookie.add("sugar");
        dietMintChocolateCookie.add("eggs");
        dietMintChocolateCookie.add("flour");

        BakedGoods mintChocolateCookie = new BakedGoods("Mint Chocolate Cookies", 19.95, 3, "07302021", dietMintChocolateCookie);
        bakery.add(mintChocolateCookie);

        ArrayList<String> dietSnowballCookies = new ArrayList<String>();
        dietSnowballCookies.add("rice flour");
        dietSnowballCookies.add("potato starch");
        dietSnowballCookies.add("sugar ");
        dietSnowballCookies.add("apple cider vinegar");
        dietSnowballCookies.add("baking soda");
        dietSnowballCookies.add("salt");

        BakedGoods snowballCookies = new BakedGoods("Snowball Cookies", 19.95, 4, "07282021", dietSnowballCookies);
        bakery.add(snowballCookies);

        ArrayList<String> dietCookieDoughTruffles = new ArrayList<>();
        dietCookieDoughTruffles.add("white rice");
        dietCookieDoughTruffles.add("tapioca");
        dietCookieDoughTruffles.add("sugar");
        dietCookieDoughTruffles.add("evaporated can juice");
        dietCookieDoughTruffles.add("chocolate");
        dietCookieDoughTruffles.add("salt");
        dietCookieDoughTruffles.add("potato flour");

        BakedGoods cookieDoughTruffles = new BakedGoods("Cookie Dough Truffles", 19.95, 6, "07282021", dietCookieDoughTruffles);
        bakery.add(cookieDoughTruffles);

        ArrayList<String> dietPumpkinDonut = new ArrayList<>();
        dietPumpkinDonut.add("potato starch");
        dietPumpkinDonut.add("tapioca flour");
        dietPumpkinDonut.add("sugar");
        dietPumpkinDonut.add("pumpkin");
        dietPumpkinDonut.add("corn starch");
        dietPumpkinDonut.add("cinnamon");
        dietPumpkinDonut.add("vanilla");
        dietPumpkinDonut.add("palm oil");

        BakedGoods pumpkinDonut = new BakedGoods("Pumpkin Donut", 14.95, 1, "07232021", dietPumpkinDonut);
        bakery.add(pumpkinDonut);

        ArrayList<String> dietTealOmbreCake = new ArrayList<>();
        dietTealOmbreCake.add("gluten free flours");
        dietTealOmbreCake.add("sugar");
        dietTealOmbreCake.add("cocoa powder");
        dietTealOmbreCake.add("palm oil");
        dietTealOmbreCake.add("canola oil");
        dietTealOmbreCake.add("sodium bicarbonate");
        dietTealOmbreCake.add("banana");
        dietTealOmbreCake.add("pure vanilla extract");

        BakedGoods tealOmbreCake = new BakedGoods("Teal Ombre Cake", 27.00, 3, "07182021", dietTealOmbreCake);
        bakery.add(tealOmbreCake);

        ArrayList<String> dietWonderWomanCake = new ArrayList<>();
        dietWonderWomanCake.add("Gluten free flours");
        dietWonderWomanCake.add("sugar");
        dietWonderWomanCake.add("cocoa powder");
        dietWonderWomanCake.add("palm oil");
        dietWonderWomanCake.add("sodium bicarbonate");
        dietWonderWomanCake.add("cornstarch");
        dietWonderWomanCake.add("xanthan gum");

        BakedGoods wonderWomanCake = new BakedGoods("Wonder Woman Cake", 29.00, 5, "07212021", dietWonderWomanCake);
        bakery.add(wonderWomanCake);





        System.out.println("Would you like to sort by diet restriction? (yes/no)"); //asking user if they have any diet restrictions
        answer = keyboard.nextLine();

        if (answer.equalsIgnoreCase("yes")){                             //if user answers yes
            System.out.println("What ingredients would you like to sort by?");
            sort = keyboard.nextLine();
            for (int i = 0; i < bakery.size(); i++){
                BakedGoods temp = bakery.get(i);
                ArrayList<String> tempArray = temp.getDiet();
                for (String tempString: tempArray){
                    if (tempString.equalsIgnoreCase(sort)){
                        System.out.println(temp.getName());
                    }
                }
            }

        }else {
            for (int i = 0; i < bakery.size(); i++ ){
                BakedGoods temp = bakery.get(i);
                System.out.println(temp.getName());
            }

        }

    }
}
