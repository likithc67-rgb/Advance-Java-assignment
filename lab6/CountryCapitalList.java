package lab6;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class CountryCapitalList extends JFrame {

    private JList<String> countryList;
    private HashMap<String, String> capitalMap;

    public CountryCapitalList() {
        // Create country-capital mapping
        capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Addis Ababa");
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create list model
        DefaultListModel<String> model = new DefaultListModel<>();
        for (String country : capitalMap.keySet()) {
            model.addElement(country);
        }

        // Create JList
        countryList = new JList<>(model);

        // Add selection listener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedCountry = countryList.getSelectedValue();
                    if (selectedCountry != null) {
                        String capital = capitalMap.get(selectedCountry);
                        System.out.println("Capital of " + selectedCountry + " is: " + capital);
                    }
                }
            }
        });

        // Add to frame
        add(new JScrollPane(countryList));

        // Frame settings
        setTitle("Country Capital List");
        setSize(250, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CountryCapitalList();
    }
}