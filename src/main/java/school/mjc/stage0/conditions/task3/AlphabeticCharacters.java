package school.mjc.stage0.conditions.task3;

public class AlphabeticCharacters {
    public void vowelDeterminer(char character) {
        String vowels = "AEIOUYaeyuio";
        String consonant = "QWSDRFTGHJKLPZXCVBNMqwsdrftghjklpzxcvbnm";
        if(vowels.indexOf(character) != -1){
            System.out.println("Vowel");
        } else if (consonant.indexOf(character) != -1) {
            System.out.println("Consonant");
        }else {
            System.out.println("wrong alphabet!");
        }
    }
}
