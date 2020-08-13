package SetsAndMapsAdvanced;

import java.util.*;

public class CitiesByContinentndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, Map<String, List<String>>> cards = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] tockens = sc.nextLine().split("\\s+");
            cards.putIfAbsent(tockens[0],new LinkedHashMap<>());
            cards.get(tockens[0]).putIfAbsent(tockens[1], new ArrayList<>());
            cards.get(tockens[0]).get(tockens[1]).add(tockens[2]);
        }

        for (Map.Entry<String, Map<String ,List<String>>> entry: cards.entrySet()) {
            System.out.printf("%s:%n",entry.getKey());
            for (Map.Entry<String, List<String>> countries:entry.getValue().entrySet()) {
                System.out.printf("  %s -> ",countries.getKey());
                for (int i = 0; i <countries.getValue().size() ; i++) {

                    if(i == countries.getValue().size()-1){
                        System.out.printf("%s%n",countries.getValue().get(i));
                    }else{
                        System.out.printf("%s, ", countries.getValue().get(i));
                    }
                }
            }
        }
    }
}
