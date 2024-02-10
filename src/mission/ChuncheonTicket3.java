package mission;

public class ChuncheonTicket3 {
    public static void main(String[] args){
        int ageOfAlice = 70;
        String countryOfAlice = "USA";

        int ageOfKim = 65;
        String countryOfKim = "Korea";

        int ageOfYoo = 42;
        String countryOfYoo = "Korea";

        boolean isHalfPriceForAlice = (ageOfAlice >= 65) && (countryOfAlice == "Korea");
        boolean isHalfPriceForKim = (ageOfKim >= 65) && (countryOfKim == "Korea");
        boolean isHalfPriceForYoo = (ageOfYoo >= 65) && (countryOfYoo == "Korea");

        System.out.println("Alice는 적용 대상자인가?");
        System.out.println(isHalfPriceForAlice);
        System.out.println("Kim는 적용 대상자인가?");
        System.out.println(isHalfPriceForKim);
        System.out.println("Yoo는 적용 대상자인가?");
        System.out.println(isHalfPriceForYoo);
    }
}