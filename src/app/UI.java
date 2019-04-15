package app;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;

/**
 * UI
 */
public class UI extends JFrame{

    public UI() {
        super("EInwohnermeldeamt");
        this.setLayout(new BorderLayout());

        JLabel header = new JLabel("Einwohner hinzufügen");
        
        JPanel topPart = new JPanel(new FlowLayout(FlowLayout.LEFT));
        topPart.add(header);
        
// -----------------------
        JPanel middlePart = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel bottomPart = new JPanel(new FlowLayout(FlowLayout.CENTER));

        Border mainBorder = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        middlePart.setBorder(mainBorder);

        JPanel kontaktdaten = new JPanel(new FlowLayout());
        JPanel familienstand = new JPanel(new FlowLayout());

        JPanel kGrid = new JPanel(new GridLayout(0, 2));
        JPanel fGrid = new JPanel(new GridLayout(0, 1));

        kontaktdaten.add(kGrid);
        middlePart.add(kontaktdaten);

        familienstand.add(fGrid);
        middlePart.add(familienstand);

        JComboBox<String> anrede = new JComboBox<>();
        anrede.addItem("Mann");
        anrede.addItem("Frau");
        anrede.addItem("Divers");
        JTextField name = new JTextField("Mustermann");
        JTextField vorname = new JTextField("Inge");
        JTextField geburtname = new JTextField("Igel");
        JTextField email = new JTextField("a.b@c.d");

        kGrid.add(new JLabel("Anrede"));
        kGrid.add(anrede);
        kGrid.add(new JLabel("Name"));
        kGrid.add(name);
        kGrid.add(new JLabel("Vorname"));
        kGrid.add(vorname);
        kGrid.add(new JLabel("Geburtsname"));
        kGrid.add(geburtname);
        kGrid.add(new JLabel("E-Mail"));
        kGrid.add(email);

        kGrid.setBorder(BorderFactory.createTitledBorder("Kontakdaten"));

        JRadioButton ledig = new JRadioButton("ledig");
        JRadioButton verheiratet = new JRadioButton("verheiretet");
        JRadioButton verwitwet = new JRadioButton("verwitwet");
        JRadioButton geschieden = new JRadioButton("geschieden");

        ButtonGroup group = new ButtonGroup();
        group.add(ledig);
        group.add(verheiratet);
        group.add(verwitwet);
        group.add(geschieden);

        fGrid.add(ledig);
        fGrid.add(verheiratet);
        fGrid.add(verwitwet);
        fGrid.add(geschieden);

        fGrid.setBorder(BorderFactory.createTitledBorder("Familienstand"));

        JButton hinzufuegen = new JButton("Hinzufügen");
        JButton anzeigen = new JButton("Anzeigen");
        JButton suchen = new JButton("Suchen");
        JButton loeschen = new JButton("Löschen");
        JButton liste_anzeigen = new JButton("Liste Anzeigen");

        bottomPart.add(hinzufuegen);
        bottomPart.add(anzeigen);
        bottomPart.add(suchen);
        bottomPart.add(loeschen);
        bottomPart.add(liste_anzeigen);

        this.add(topPart, BorderLayout.NORTH);
        this.add(middlePart, BorderLayout.CENTER);
        this.add(bottomPart, BorderLayout.SOUTH);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
    }
}