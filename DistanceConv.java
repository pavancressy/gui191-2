import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;

public class DistanceConv extends JFrame implements ActionListener {
    private JButton convButton;
    private JLabel mileInputLabel;
    private JFormattedTextField mileInputField;
    private JLabel kilometerLabel;
    private JTextField kilometerField;
    private JLabel meterLabel;
    private JTextField meterField;
    private JLabel feetLabel;
    private JTextField feetField;

    DistanceConv() {
        GridBagConstraints layoutConst = null;

        setTitle("Distance Converter");

        convButton = new JButton("Convert");
        convButton.addActionListener(this);

        mileInputLabel = new JLabel("Distance (miles):");
        kilometerLabel = new JLabel("Distance (km):");
        meterLabel = new JLabel("Distance (meters):");
        feetLabel = new JLabel("Distance (feet): ");

        mileInputField = new JFormattedTextField(NumberFormat.getNumberInstance());
        mileInputField.setEditable(true);
        mileInputField.setColumns(15);
        kilometerField = new JTextField(15);
        kilometerField.setEditable(false);
        meterField = new JTextField(15);
        meterField.setEditable(false);
        feetField = new JTextField(15);
        feetField.setEditable(false);

        setLayout(new GridBagLayout());

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        add(mileInputLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        add(mileInputField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 1;
        layoutConst.gridy = 0;
        add(kilometerLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        add(kilometerField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 2;
        layoutConst.gridy = 0;
        add(meterLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 2;
        layoutConst.gridy = 1;
        add(meterField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 3;
        layoutConst.gridy = 0;
        add(feetLabel, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 3;
        layoutConst.gridy = 1;
        add(feetField, layoutConst);

        layoutConst = new GridBagConstraints();
        layoutConst.insets = new Insets(10, 10, 10, 1);
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        add(convButton, layoutConst);
    }

    @Override
    public void actionPerformed(ActionEvent event) {
        double mileInput;
        double convKm;
        double convMeters;
        double convFeet;

        mileInput = ((Number) mileInputField.getValue()).doubleValue();

        convKm = mileInput * 1.6;
        convMeters = convKm * 1000;
        convFeet = mileInput * 5280;

        kilometerField.setText(Double.toString(convKm));
        meterField.setText(Double.toString(convMeters));
        feetField.setText(Double.toString(convFeet));

    }
    public static void main(String[] args) {
        DistanceConv myFrame = new DistanceConv();

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
}