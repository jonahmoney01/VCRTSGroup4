import javax.swing.*;
import java.awt.*;

public class RegistrationFrame {

    // This frame will display the car registration form which will ask the user to
    // input details such as car make, model and year. The inputs will then be
    // received by the backend and added to the registry.
    JFrame dashboard = new JFrame("Car Registration");

    JPanel titlePanel = new JPanel();

    JLabel registrationTitle = new JLabel("Car Registration");

    JPanel submitPanel = new JPanel();

    JPanel carModelPanel = new JPanel();

    JPanel carMakePanel = new JPanel();

    JPanel carYearPanel = new JPanel();

    JPanel ownerIdPanel = new JPanel();

    JPanel durationOfRegistryPanel = new JPanel();

    // Labels for each text box.
    JLabel ownerID = new JLabel("Owner ID");
    JLabel durationOfRegistry = new JLabel("Duration of registry input");
    JLabel carModel = new JLabel("Car Model");
    JLabel carMake = new JLabel("Car Make");
    JLabel carYear = new JLabel("Car Year");

    JTextField carModelInput, carMakeInput, carYearInput, ownerIdInput, durationOfRegistryInput;

    JButton submitButton = new JButton("Submit");

    public RegistrationFrame() {
        dashboard.setSize(1200, 800);
        dashboard.setLocationRelativeTo(null);
        dashboard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dashboard.setResizable(false);
        dashboard.getContentPane().setBackground(new Color(41, 55, 77));
        dashboard.setLayout(null);
        // Setting up the title of the frame.
        titlePanel.setBackground(new Color(249, 217, 126));
        titlePanel.setBounds(300, 20, 600, 150);

        registrationTitle.setForeground(Color.white);
        registrationTitle.setFont(new Font("Monospaced", Font.BOLD, 35));
        titlePanel.add(registrationTitle);
        dashboard.add(titlePanel);

        // Panels that are supposed to include all the labels.
        submitPanel.setBounds(400, 500, 100, 50);
        carModelPanel.setBackground(Color.LIGHT_GRAY);
        carModelPanel.setBounds(50, 300, 200, 50);

        carMakePanel.setBackground(Color.LIGHT_GRAY);
        carMakePanel.setBounds(50, 350, 200, 50);

        carYearPanel.setBackground(Color.LIGHT_GRAY);
        carYearPanel.setBounds(50, 400, 200, 50);
        ownerIdPanel.setBackground(Color.LIGHT_GRAY);
        ownerIdPanel.setBounds(50, 200, 200, 50);
        durationOfRegistryPanel.setBackground(Color.LIGHT_GRAY);
        durationOfRegistryPanel.setBounds(50, 250, 200, 50);

        carModel.setBounds(50, 300, 50, 50);
        ownerID.setBounds(50, 200, 50, 50);
        durationOfRegistry.setBounds(50, 250, 50, 50);
        carMake.setBounds(50, 350, 50, 50);
        carYear.setBounds(50, 400, 50, 50);
        carModelPanel.add(carModel);
        carMakePanel.add(carMake);
        carYearPanel.add(carYear);
        ownerIdPanel.add(ownerID);
        durationOfRegistryPanel.add(durationOfRegistry);

        // Setting up the text fields.
        ownerIdInput = new JTextField();
        ownerIdInput.setBounds(300, 200, 200, 50);
        durationOfRegistryInput = new JTextField();
        durationOfRegistryInput.setBounds(300, 250, 200, 50);
        carModelInput = new JTextField();
        carModelInput.setBounds(300, 300, 200, 50);
        carMakeInput = new JTextField();
        carMakeInput.setBounds(300, 350, 200, 50);
        carYearInput = new JTextField();
        carYearInput.setBounds(300, 400, 200, 50);

        // Submit button
        submitPanel.add(submitButton);
        dashboard.add(submitPanel);
        dashboard.add(carModelInput);
        dashboard.add(carMakeInput);
        dashboard.add(carYearInput);
        dashboard.add(ownerIdInput);
        dashboard.add(durationOfRegistryInput);
        dashboard.add(carModelPanel);
        dashboard.add(carMakePanel);
        dashboard.add(carYearPanel);
        dashboard.add(ownerIdPanel);
        dashboard.add(durationOfRegistryPanel);
        dashboard.setVisible(true);
    }

}
