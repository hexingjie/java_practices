import java.util.Date;

//电话卡抽象类
abstract class PhoneCard
{
	double balance;
	
	//抽象方法
	abstract boolean performDial();
	double getBalance()
	{
		return balance;
	}
	
}

//无号码电话卡抽象类
abstract class None_Number_PhoneCard extends PhoneCard
{
	String phoneSetType;   //电话机类型
	
	String getSetType()
	{
		return phoneSetType;
	}
	
}

//有号码电话卡抽象类
abstract class Number_PhoneCard extends PhoneCard
{
	long cardNumber;
	int password;
	String connectNumber;  //接入号码
	boolean connected;    //接通状态
	
	boolean performConnection(long cn, int pw)
	{
		if (cn == cardNumber && pw == password) {
			connected = true;
			return true;
		}
		else {
			return false;
		}
	}
}

public class test_exends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
