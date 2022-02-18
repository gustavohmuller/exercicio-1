package exercicio1;

import java.text.*;
import java.util.*;

public class Action {
    
    public String Action(ArrayList<Double> valueList) {
        
        String text = "Remessa gerada: ";
        double total = 0;
        
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        
        for (int i = 0; i < valueList.size(); i++) {
            text += (i+1) + " cujo valor é " + (formatter.format(valueList.get(i)));
            if (i < valueList.size() - 1) {
                text += ", ";
            }
            total += valueList.get(i);
        }
             
        text += ". Total = " + (formatter.format(total)) + ".";
        
        return text;
    }
}
