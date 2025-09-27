import java.io.Serializable;
class Customer implements Serializable{
	String userid = "Niet";
	transient String pwd = "College";
}