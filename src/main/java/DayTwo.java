import java.util.ArrayList;
import java.util.Arrays;

public class DayTwo {

    private int doubleCount = 0;
    private int tripleCount = 0;

    public int getScore(String input) {

        for(String s : input.split("\n")) {
            char[] sequence = s.toCharArray();
            Arrays.sort(sequence);
            if(countTriples(sequence)) {
                tripleCount++;
            }
            if(countDoubles(sequence)) {
                doubleCount++;
            }
        }
        return calculateScore();

    }

    private boolean countDoubles(char[] sequence) {
        for(int i = 0; i + 1 < sequence.length; i++) {
            char characterA = sequence[i];
            char characterB = sequence[i + 1];
            if(characterA == characterB) {
                if(i + 2 < sequence.length) {
                    char characterC = sequence[i + 2];
                    if(characterA == characterB && characterB != characterC) {
                        return true;
                    } else {
                        i++;
                    }
                } else {
                    return true;
                }
            }

        }
        return false;
    }

    private boolean countTriples(char[] sequence) {
        for(int i = 0; i + 2 < sequence.length; i++) {
            char characterA = sequence[i];
            char characterB = sequence[i + 1];
            char characterC = sequence[i + 2];
            if(characterA == characterB && characterB == characterC) {
                return true;
            }
        }
        return false;
    }

    private int calculateScore() {
        if(doubleCount > 0 && tripleCount > 0) {
            return doubleCount * tripleCount;
        } else if(doubleCount == 0 && tripleCount > 0) {
            return tripleCount;
        } else if(doubleCount > 0 && tripleCount == 0) {
            return doubleCount;
        }
        return 0;
    }

    public int getDoubleCount() {
        return doubleCount;
    }

    public int getTripleCount() {
        return tripleCount;
    }

    public String getMostCommonIDString(String input) {
        String[] values = input.split("\n");
        System.out.println(Arrays.toString(values));
        hasMoreThanOneMatch(values);
        return "";
    }

    private void hasMoreThanOneMatch(String[] lines) {
        for(int i = 0; i < lines.length; i++) {
            System.out.println(lines[i].toCharArray()[0]);
        }
    }

    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        System.out.println(dayTwo.getScore(puzzleInput));
    }
    private static String puzzleInput = "xrysntkqrduheficajodiglvzw\n" +
                                        "xzymntkqrbuhefmcajodiflvzw\n" +
                                        "xpysetkyrbuhefmcajodiglvgw\n" +
                                        "xtysnykqrbuhefmczjodiglvzw\n" +
                                        "xpysntkqyvuhefmjajodiglvzw\n" +
                                        "xpysntkqrbuqjfmcajodiglvzu\n" +
                                        "xpysntkqrbuhefmvaoodimlvzw\n" +
                                        "xplsntkqrbuhefmcajohimlvzw\n" +
                                        "cpysntkqrbuhefmcajodiglpmw\n" +
                                        "xpysndkqrbuhefmcajzdiglmzw\n" +
                                        "xpysntkqrbuhsfmctjoqiglvzw\n" +
                                        "xpysztkkrbuhewmcajodiglvzw\n" +
                                        "xpysntkguzuhefmcajodiglvzw\n" +
                                        "xpysnbkvrbuhyfmcajodiglvzw\n" +
                                        "xpgsntkqrbphefmcajodzglvzw\n" +
                                        "xpysntkqrbdhefmcajodvgqvzw\n" +
                                        "xpmsntkqrbuhedmcajodiglvnw\n" +
                                        "wpysntkqmbuheemcajodiglvzw\n" +
                                        "xpysntdvrbuhdfmcajodiglvzw\n" +
                                        "xpbsetkqrbuhefmcayodiglvzw\n" +
                                        "xpasntkqrbuhefmcajydigovzw\n" +
                                        "xpylntkqrbuhefmcajudiglnzw\n" +
                                        "xpysqtkqrbuoefmcrjodiglvzw\n" +
                                        "xlysntkqrbuhefmuejodiglvzw\n" +
                                        "xpysntkqrzuhewmcajodaglvzw\n" +
                                        "xpysotkqrbuhefmxajowiglvzw\n" +
                                        "xpysntkqrbuhefmcajodinlyza\n" +
                                        "xpysntkqrbuhemmmajofiglvzw\n" +
                                        "xpysntkqcbuhezmcyjodiglvzw\n" +
                                        "xpysntyqrbuhefmcajodiglvfn\n" +
                                        "xpysntkqrbudefmcarodcglvzw\n" +
                                        "xpysntkqrjuhefkcajodiglvzg\n" +
                                        "xpysntkqrbuhefmcahooiglvow\n" +
                                        "xpysntkqrqfhevmcajodiglvzw\n" +
                                        "xpysntlqrbuhefmcajodivlvzu\n" +
                                        "xpyjotkqrbuhefmcavodiglvzw\n" +
                                        "xpysntqqrbuhebmcgjodiglvzw\n" +
                                        "xpjsnikqbbuhefmcajodiglvzw\n" +
                                        "xpysntkqrbuhefmcalodeflvzw\n" +
                                        "xpysntktrbuhefmcaqoviglvzw\n" +
                                        "xpysntkqrbuhefmcrjogiglvzk\n" +
                                        "xpysntkqrjuhekmcajodixlvzw\n" +
                                        "xpypntyqrbuhefmcajodigzvzw\n" +
                                        "cpysnwkqrbuhefmcajodiglvww\n" +
                                        "xpysntkqqbuqefmcajodiglvlw\n" +
                                        "xpysntkqrbuhvfmcajldiglvzh\n" +
                                        "xpysntkqrbuhefmzmjodislvzw\n" +
                                        "xpysnnkqrbuhefmcajodjplyzw\n" +
                                        "xpysntdqobuhefmcajbdiglvzw\n" +
                                        "xpyzntknrbuhefmcajodigtvzw\n" +
                                        "xpysntkqbbohefmcajodialvzw\n" +
                                        "xpysntkqryuhefmcayoxiglvzw\n" +
                                        "xxysntkqrbuhefmcajodiglgzl\n" +
                                        "jzysntkqrbuhmfmcajodiglvzw\n" +
                                        "xpysntocrbuhefmcakodiglvzw\n" +
                                        "xpysntkqrbuheomrgjodiglvzw\n" +
                                        "xpysntkerbuhefmxajoduglvzw\n" +
                                        "xpysntkqobuhefpcajodiglvzd\n" +
                                        "xpysntkqrbvhefmcajopislvzw\n" +
                                        "xpysntkqrbuhefucqjodiglvqw\n" +
                                        "xpysvtkqrbuhdfmcajokiglvzw\n" +
                                        "xqysnjkqrbuhemmcajodiglvzw\n" +
                                        "xpysnteqxbuhefmcajodiglvdw\n" +
                                        "xpysntkqrbuhefzcajodignvzc\n" +
                                        "xpysntkqrbuledmcajoyiglvzw\n" +
                                        "xpysntkqrbuhofmcajkdigpvzw\n" +
                                        "xpysmtkqrbuhefmcajodaglvze\n" +
                                        "xlysntiqrbuhefmqajodiglvzw\n" +
                                        "xpysntvqrbugefmcajodiglizw\n" +
                                        "xpysntkqrbuhefmuwjndiglvzw\n" +
                                        "ypysntkqrbuhefmbajodislvzw\n" +
                                        "xpycntkqrbuhemmcaqodiglvzw\n" +
                                        "xpysntkqrbuhefmcajobivdvzw\n" +
                                        "xpysnfkprbuhefmcajodiglvkw\n" +
                                        "xtysntkwrjuhefmcajodiglvzw\n" +
                                        "xpysntkqrbqhefmcaxodiulvzw\n" +
                                        "xpysntkqrbuhefmcajsdigkvkw\n" +
                                        "xpysnekqrbugefmcajwdiglvzw\n" +
                                        "xpysntkqjbuhefmcajoduglbzw\n" +
                                        "xpysntkqrbohlfmcajodiggvzw\n" +
                                        "xpysntkqrbfhefmcajodiglhnw\n" +
                                        "xpmsntkirbusefmcajodiglvzw\n" +
                                        "xpnsntkqrbehefmcajodigrvzw\n" +
                                        "xpytntgqrbuhefmcajodigllzw\n" +
                                        "xpysntkqrbuhefmcejodiglvvm\n" +
                                        "xpyvntkqrbuhefmmajodiglmzw\n" +
                                        "rpysntkirbuhefmcajodiglyzw\n" +
                                        "xpysntkqrbuhefmcajoznglvzz\n" +
                                        "xpysntkqrbmhefmcafodigwvzw\n" +
                                        "xpysntkqrbuhetmcarodiglvzx\n" +
                                        "xpysntnqrbuhefmcajogiglfzw\n" +
                                        "xpysutkqjbuheomcajodiglvzw\n" +
                                        "xpysnqkprbuhefkcajodiglvzw\n" +
                                        "xpysntuqrbuhemmcajodyglvzw\n" +
                                        "spysntkqrbupefmcajodigpvzw\n" +
                                        "qpygntkqrbuhefmcajodqglvzw\n" +
                                        "xpysnteqrbuhefmcatodiylvzw\n" +
                                        "xpysntkqrbusefsckjodiglvzw\n" +
                                        "xpysntkqrbubeflcajodiglvcw\n" +
                                        "xpysntwqrbuhefmcajodigekzw\n" +
                                        "xpysntkqrbuhefmcnjodiguvtw\n" +
                                        "xpysntkqrbqhefmkasodiglvzw\n" +
                                        "xmysntkqrbuhefmkcjodiglvzw\n" +
                                        "xpysntkqrquhefmcajodiouvzw\n" +
                                        "xpysnnkqrbuhefmcajodiplyzw\n" +
                                        "xpysntkorbuhefaqajodiglvzw\n" +
                                        "npysntkqobuhefmcajodiglvfw\n" +
                                        "xlysntkqrbuhefmcazbdiglvzw\n" +
                                        "xpysftkqrbihefmcajodiglezw\n" +
                                        "xpysolqqrbuhefmcajodiglvzw\n" +
                                        "xpysntkqrwuheixcajodiglvzw\n" +
                                        "xoysntkqibuhefmcqjodiglvzw\n" +
                                        "xpysntkqrbupefmcajodtulvzw\n" +
                                        "xpyentkqrbuhvfmcajudiglvzw\n" +
                                        "xpysntksrbuhefmgajodqglvzw\n" +
                                        "xpysntkqrbuhcfmcvjodigldzw\n" +
                                        "gpyrntdqrbuhefmcajodiglvzw\n" +
                                        "vpysntvqrbuhefmcajndiglvzw\n" +
                                        "xpvsntkqrbuhefvcajhdiglvzw\n" +
                                        "xpysntkqrbubefmcajowiglvzl\n" +
                                        "xpysndkqibuhefmcajodiblvzw\n" +
                                        "xpysntkqrbuhefmldjodjglvzw\n" +
                                        "xpysntzqrbuhefmcyjomiglvzw\n" +
                                        "xpysntkqrbuhefmedjodiwlvzw\n" +
                                        "xpysntklrbuhefmcyjodiglvjw\n" +
                                        "xpypnlkqrbehefmcajodiglvzw\n" +
                                        "xpysntkqrbuhefycacodiglvzz\n" +
                                        "ypysntkqrbuhefmcajadiglvew\n" +
                                        "xpysntkqobuhefmcajadiglhzw\n" +
                                        "xpysbtxlrbuhefmcajodiglvzw\n" +
                                        "xpysntkqrbuhefdcajoviglvww\n" +
                                        "xpysntkqrbuhefmcaaodiblvzc\n" +
                                        "wpysntkqrbuhefmcajddiglvbw\n" +
                                        "wpysntmqrbuhefmcajodiglvza\n" +
                                        "epysntkqrbuhemmcajoniglvzw\n" +
                                        "vpysntkqrbuhejmcajodiglvzo\n" +
                                        "xpysntkqrbuhebmmajodiglazw\n" +
                                        "lpysntkqrguhtfmcajodiglvzw\n" +
                                        "xpksndkqpbuhefmcajodiglvzw\n" +
                                        "xpydnukqrbuhefmcajmdiglvzw\n" +
                                        "xpysnmkqrbuhefioajodiglvzw\n" +
                                        "xpysntkqruuhefmcajodyglvzx\n" +
                                        "xpysntkqrmuhefmcmjidiglvzw\n" +
                                        "xpysntksrbupefmcajodiplvzw\n" +
                                        "xpykntkqrbuhefmmajodiglxzw\n" +
                                        "xpssntkqrbuhefmzajodiglvgw\n" +
                                        "xpysntkqrbuhefmcrjodigovzd\n" +
                                        "xpysntkqrbuhefmpajodirlvqw\n" +
                                        "xpysnskqrruhefmtajodiglvzw\n" +
                                        "xpysnzkqrbuhezmcajodiglvzj\n" +
                                        "xpysntkcrburefmckjodiglvzw\n" +
                                        "xpysntkqrbuhefecpoodiglvzw\n" +
                                        "xpysnjkqrbuhexmcajodigrvzw\n" +
                                        "xpysztkqhbuhefmcanodiglvzw\n" +
                                        "xpysntkqrbuhefmcajozyelvzw\n" +
                                        "xpyuntkmrbuhefmcajodigcvzw\n" +
                                        "xpysnykmrbuhefmaajodiglvzw\n" +
                                        "jpysntkqrbuhefmcajodigumzw\n" +
                                        "xtysntkqhbuhefmcajodiglvzz\n" +
                                        "xpysntkqrbqhefmcxjouiglvzw\n" +
                                        "xpysntkqreujefmmajodiglvzw\n" +
                                        "xnysntzqrbuhefacajodiglvzw\n" +
                                        "xpysntkqriuhefmcajkdiqlvzw\n" +
                                        "xposntkqrbuheffcajodihlvzw\n" +
                                        "xpysntkqpquhefmcajodrglvzw\n" +
                                        "xpysjtkqrbudefmcajouiglvzw\n" +
                                        "xpysnxkqrbulefmcacodiglvzw\n" +
                                        "xpygntkqrbuhefmfajzdiglvzw\n" +
                                        "xpysntkqrbuhefmuayodiglyzw\n" +
                                        "xpysnbksrbuhefmcajediglvzw\n" +
                                        "xkyzntkqrbuhefmcajodiglvzz\n" +
                                        "xpysntkqrbehlxmcajodiglvzw\n" +
                                        "xpysntkqryuhefmcaxodiklvzw\n" +
                                        "xpysntdqrbuhefmcjjodiglvzt\n" +
                                        "xpysntkqrbuhefmcauodigqvzy\n" +
                                        "xpysftkqrbuhefmcajodrgvvzw\n" +
                                        "xpysntkqrbuhefmczjodiglivw\n" +
                                        "xpysatkorbuhefmcyjodiglvzw\n" +
                                        "xhysntkqrbthefmcajodxglvzw\n" +
                                        "xpysnpkqrbuhefmcajoqyglvzw\n" +
                                        "xpyyntkqrbuhefmcjjodxglvzw\n" +
                                        "xpysntkqrozhefhcajodiglvzw\n" +
                                        "xpymftkqrbuhefmcajodiglvzo\n" +
                                        "xpysntkqrbuhvfmcajodiyllzw\n" +
                                        "xpysatsqrbuhefmcajodiglvzo\n" +
                                        "cpysntkqqbuhefmcajodlglvzw\n" +
                                        "xpysntkyrblhefmcajodiglvzz\n" +
                                        "xpysntkfrbuhefbcajodiglbzw\n" +
                                        "upysotkqrbuhpfmcajodiglvzw\n" +
                                        "xpysdokqrbuheflcajodiglvzw\n" +
                                        "xrysntkqrbuhefpcanodiglvzw\n" +
                                        "xdysntkqrbuhefpcajodiglmzw\n" +
                                        "xpyynteqrbjhefmcajodiglvzw\n" +
                                        "xpysntkqrbuhefkcajodielvhw\n" +
                                        "xplsktkqrbuhefmcajodtglvzw\n" +
                                        "xpysrtkqrbuhefmcdjodiglvzx\n" +
                                        "upysntkmrbuhefmcajodiglvzt\n" +
                                        "xnysnpkqrbusefmcajodiglvzw\n" +
                                        "xtysntnqrbuhexmcajodiglvzw\n" +
                                        "xpysngkmrbfhefmcajodiglvzw\n" +
                                        "xpysnhkhrbuhefmcajodiplvzw\n" +
                                        "xpysntvqrbuhefmcaoodsglvzw\n" +
                                        "xpyzntkqrbuhefmcajlviglvzw\n" +
                                        "xpysndkqrbuievmcajodiglvzw\n" +
                                        "xpysntkqrsuhcfzcajodiglvzw\n" +
                                        "xpysntkqlbuhefmcajjdlglvzw\n" +
                                        "xpysntkqrbuhifmcajoliylvzw\n" +
                                        "xpysntkqxbphefmcajodialvzw\n" +
                                        "bnyswtkqrbuhefmcajodiglvzw\n" +
                                        "upysatkqrbuhefmcajodvglvzw\n" +
                                        "xpysntkqqbuhefmcajodxglzzw\n" +
                                        "xpysntkqryuhefmcafodinlvzw\n" +
                                        "xpzsntkqrcuhefmcajokiglvzw\n" +
                                        "xpynntkqrbuheimccjodiglvzw\n" +
                                        "xpysnfkqduuhefmcajodiglvzw\n" +
                                        "xpywntkqrbuhefmcajodigllzz\n" +
                                        "xpysftkqrbahefmcajsdiglvzw\n" +
                                        "xpysntkkrbutefmcljodiglvzw\n" +
                                        "xfysntkqrbbhkfmcajodiglvzw\n" +
                                        "xpysgtksrbuhefkcajodiglvzw\n" +
                                        "xpysntyqrbuhefmcajodijlvzg\n" +
                                        "xpysnpkqobuhefmcljodiglvzw\n" +
                                        "xvysntkqrbuhefmcsjodiclvzw\n" +
                                        "xpysntkqrtuhwfmcajodillvzw\n" +
                                        "xpysntkprbuhejmcajouiglvzw\n" +
                                        "apysntkqrbuhefmcaboviglvzw\n" +
                                        "xpysqykqrbuhefmcajodirlvzw\n" +
                                        "xpysntkqrluhefmcajowiglvzf\n" +
                                        "dpysnokqrbuhefmcajoaiglvzw\n" +
                                        "xppsntkqmbuheumcajodiglvzw\n" +
                                        "xpysntkqrbuhlymcaoodiglvzw\n" +
                                        "dpysntkqrbuhmfmcajodiglvzt\n" +
                                        "xpysltbqrbuhefmcajoliglvzw\n" +
                                        "xpysntpqrbuhefmcnjoniglvzw\n" +
                                        "xpysntpqrbuhektcajodiglvzw\n" +
                                        "xpysntkhrbshefmqajodiglvzw\n" +
                                        "zpysntuqrbuhefmcajmdiglvzw\n" +
                                        "xpysxtdqrbuhefmcajoyiglvzw\n" +
                                        "xpysntkubbumefmcajodiglvzw\n" +
                                        "xpysntkqzouhefmcajsdiglvzw\n" +
                                        "xpysntkqrbuhefmcojoziglvyw\n" +
                                        "jpysntkqrmuhefmcajodidlvzw\n" +
                                        "xpmsttkqrhuhefmcajodiglvzw\n" +
                                        "xpysntkqlbuhefmcajgdiflvzw\n" +
                                        "xpysntxkrbuhefmcauodiglvzw\n" +
                                        "xpysotkqubuhefscajodiglvzw\n" +
                                        "xjysntkqrbvheemcajodiglvzw\n" +
                                        "xpykntkqrbuhefmcpjodiglvow\n" +
                                        "xplsntkqrbuvefmcajediglvzw\n" +
                                        "upysntwqrbuhefmfajodiglvzw";
}
