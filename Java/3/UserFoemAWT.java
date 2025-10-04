import java.awt.*;
import java.awt.event.*;

public class UserFormAWT extends Frame implements ActionListener {
    Label nameLabel, qualificationLabel, genderLabel, hobbyLabel;
    TextField nameField;
    CheckboxGroup qualificationGroup, genderGroup;
    Checkbox qualHighSchool, qualBachelor, qualMaster;
    Checkbox genderMale, genderFemale, genderOther;
    Checkbox hobbyReading, hobbyTraveling, hobbySports;
    Button submitButton;
    TextArea outputArea;

    UserFormAWT() {
        setTitle("User Information Form");
        setSize(450, 500);
        setLayout(null);
        setVisible(true);

        // Close window properly
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });

        // Name
        nameLabel = new Label("Name:");
        nameLabel.setBounds(50, 50, 100, 20);
        add(nameLabel);

        nameField = new TextField();
        nameField.setBounds(160, 50, 200, 25);
        add(nameField);

        // Qualification (Radio buttons)
        qualificationLabel = new Label("Qualification:");
        qualificationLabel.setBounds(50, 90, 100, 20);
        add(qualificationLabel);

        qualificationGroup = new CheckboxGroup();

        qualHighSchool = new Checkbox("High School", qualificationGroup, false);
        qualHighSchool.setBounds(160, 90, 120, 20);
        add(qualHighSchool);

        qualBachelor = new Checkbox("Bachelor's", qualificationGroup, false);
        qualBachelor.setBounds(160, 115, 120, 20);
        add(qualBachelor);

        qualMaster = new Checkbox("Master's", qualificationGroup, false);
        qualMaster.setBounds(160, 140, 120, 20);
        add(qualMaster);

        // Gender (Radio buttons)
        genderLabel = new Label("Gender:");
        genderLabel.setBounds(50, 180, 100, 20);
        add(genderLabel);

        genderGroup = new CheckboxGroup();

        genderMale = new Checkbox("Male", genderGroup, false);
        genderMale.setBounds(160, 180, 80, 20);
        add(genderMale);

        genderFemale = new Checkbox("Female", genderGroup, false);
        genderFemale.setBounds(250, 180, 80, 20);
        add(genderFemale);

        genderOther = new Checkbox("Other", genderGroup, false);
        genderOther.setBounds(340, 180, 80, 20);
        add(genderOther);

        // Hobbies (Checkboxes multiple selection)
        hobbyLabel = new Label("Hobbies:");
        hobbyLabel.setBounds(50, 220, 100, 20);
        add(hobbyLabel);

        hobbyReading = new Checkbox("Reading");
        hobbyReading.setBounds(160, 220, 100, 20);
        add(hobbyReading);

        hobbyTraveling = new Checkbox("Traveling");
        hobbyTraveling.setBounds(270, 220, 100, 20);
        add(hobbyTraveling);

        hobbySports = new Checkbox("Sports");
        hobbySports.setBounds(380, 220, 100, 20);
        add(hobbySports);

        // Submit Button
        submitButton = new Button("Submit");
        submitButton.setBounds(180, 270, 80, 30);
        add(submitButton);

        // Output Area
        outputArea = new TextArea();
        outputArea.setBounds(50, 320, 350, 120);
        outputArea.setEditable(false);
        add(outputArea);

        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();

        Checkbox selectedQual = qualificationGroup.getSelectedCheckbox();
        String qualification = (selectedQual != null) ? selectedQual.getLabel() : "Not Selected";

        Checkbox selectedGender = genderGroup.getSelectedCheckbox();
        String gender = (selectedGender != null) ? selectedGender.getLabel() : "Not Selected";

        StringBuilder hobbies = new StringBuilder();
        if (hobbyReading.getState()) hobbies.append("Reading, ");
        if (hobbyTraveling.getState()) hobbies.append("Traveling, ");
        if (hobbySports.getState()) hobbies.append("Sports, ");
        String hobbyStr = hobbies.length() > 0 ? hobbies.substring(0, hobbies.length() - 2) : "None";

        // Display the collected info
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
