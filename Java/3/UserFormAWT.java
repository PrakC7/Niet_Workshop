import java.awt.*;
import java.awt.event.*;

public class UserFormAWT extends Frame implements ActionListener {
    Label nameLabel, qualificationLabel, genderLabel, hobbyLabel;
    TextField nameField;
    Choice qualificationChoice;
    CheckboxGroup genderGroup;
    Checkbox genderMale, genderFemale, genderOther;
    Checkbox hobbyReading, hobbyTraveling, hobbySports;
    Button submitButton;
    TextArea outputArea;

    UserFormAWT() {
        setTitle("Interview Form");
        setSize(450, 500);
        setLayout(null);
        setVisible(true);

        // Close on window exit
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Name
        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 20);
        nameField = new TextField();
        nameField.setBounds(160, 50, 200, 25);
        add(nameLabel);
        add(nameField);

        // Qualification using Choice (dropdown)
        qualificationLabel = new Label("Qualification:");
        qualificationLabel.setBounds(50, 90, 100, 20);
        qualificationChoice = new Choice();
        qualificationChoice.add("Select");
        qualificationChoice.add("High School");
        qualificationChoice.add("Bachelor's");
        qualificationChoice.add("Master's");
        qualificationChoice.add("PhD");
        qualificationChoice.setBounds(160, 90, 200, 25);
        add(qualificationLabel);
        add(qualificationChoice);

        // Gender using radio buttons
        genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 130, 100, 20);
        genderGroup = new CheckboxGroup();
        genderMale = new Checkbox("Male", genderGroup, false);
        genderFemale = new Checkbox("Female", genderGroup, false);
        genderOther = new Checkbox("Other", genderGroup, false);
        genderMale.setBounds(160, 130, 60, 20);
        genderFemale.setBounds(230, 130, 70, 20);
        genderOther.setBounds(310, 130, 70, 20);
        add(genderLabel);
        add(genderMale);
        add(genderFemale);
        add(genderOther);

        // Hobbies
        hobbyLabel = new Label("Hobbies:");
        hobbyLabel.setBounds(50, 170, 100, 20);
        hobbyReading = new Checkbox("Reading");
        hobbyTraveling = new Checkbox("Traveling");
        hobbySports = new Checkbox("Sports");
        hobbyReading.setBounds(160, 170, 100, 20);
        hobbyTraveling.setBounds(270, 170, 100, 20);
        hobbySports.setBounds(160, 200, 100, 20);
        add(hobbyLabel);
        add(hobbyReading);
        add(hobbyTraveling);
        add(hobbySports);

        // Submit Button
        submitButton = new Button("Submit");
        submitButton.setBounds(180, 240, 80, 30);
        submitButton.addActionListener(this);
        add(submitButton);

        // Output area
        outputArea = new TextArea();
        outputArea.setBounds(50, 290, 350, 150);
        outputArea.setEditable(false);
        add(outputArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();

        String qualification = qualificationChoice.getSelectedItem();
        if (qualification.equals("Select")) {
            qualification = "Not selected";
        }

        Checkbox selectedGender = genderGroup.getSelectedCheckbox();
        String gender = (selectedGender != null) ? selectedGender.getLabel() : "Not selected";

        StringBuilder hobbies = new StringBuilder();
        if (hobbyReading.getState()) hobbies.append("Reading, ");
        if (hobbyTraveling.getState()) hobbies.append("Traveling, ");
        if (hobbySports.getState()) hobbies.append("Sports, ");
        String hobbyStr = hobbies.length() > 0 ? hobbies.substring(0, hobbies.length() - 2) : "None";

        // Display result
        outputArea.setText(
            "Name: " + name + "\n" +
            "Qualification: " + qualification + "\n" +
            "Gender: " + gender + "\n" +
            "Hobbies: " + hobbyStr
        );
    }

    public static void main(String[] args) {
        new UserFormAWT();
    }
}
