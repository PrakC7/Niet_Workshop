import java.awt.*;
import java.awt.event.*;

class Form extends Frame implements ActionLIstener
{
Checkbox cricket, badminton, male, female;
Form
CheckboxGroup cbg = new CheckboxGroup();
male = new Checkbox("Male", cbg, false);
female = new Checkbox("Female", cbg, false);
add(male);add(female);
cricket=new Checkbox("Cricket");
badminton = new Checkbox("Badminton");
b = new Button("Submit");
b.addActionListener(this);
setSize(500, 500);
setLayout(null);
cricket.setBounds(50, 50, 100, 50);
badminton.setBounds(50,200,100,50);
b.setBounds(50, 200, 100, 50);
add(cricket);
add(badminton);
setVisible(true);
add(b);
}
public void actionPerformed(ActionEvent e)
{
if(cricket.getState() == true)
{
System.out.println("Cricket");
}
if(badminton.getState() == true)
{
System.out.println("Badminton");
}
if(male.getState() == true)
{
System.out.println("Male");
}
if(female.getState() == true)
{
System.out.println("Female");
}
}
