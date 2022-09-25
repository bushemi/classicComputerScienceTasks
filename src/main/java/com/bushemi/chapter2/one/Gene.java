package com.bushemi.chapter2.one;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Getter
public class Gene {
    private final List<Codon> codons = new ArrayList<>();

    public Gene(String geneStr) {
        for (int i = 0; i < geneStr.length(); i += 3) {
//            from every 3 symbols in string create codon
            codons.add(new Codon(geneStr.substring(i, i + 3)));
        }
    }

    /*
    just for demonstration. Methods of Collections class might be more efficient
     */
    public boolean linearContains(Codon key) {
        for (Codon codon : codons) {
            if (codon.compareTo(key) == 0) {
                return true;
            }
        }
        return false;
    }

    public boolean binaryContains(Codon key) {
        ArrayList<Codon> sortedCodons = new ArrayList<>(codons);
        Collections.sort(sortedCodons);
        int low = 0;
        int high = sortedCodons.size() - 1;
        while (low <= high) { //while there is still a search space
            int middle = (low + high) / 2;
            int comparison = sortedCodons.get(middle).compareTo(key);
            if (comparison < 0) { //средний кодон меньше искомого
                low = middle + 1;
            } else if (comparison > 0) { // средний кодон больше искомого
                high = middle - 1;
            } else { // средний кодон равен искомому
                return true;
            }

        }
        return false;
    }

}
