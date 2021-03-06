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

//电话磁卡类从无卡号电话卡继承
class magCard extends None_Number_PhoneCard
{
	String usefulArea;   //使用地域
	
	boolean performDial()
	{
		if (balance > 0.9) 
		{
			balance -= 0.9;
			return true;
		} else {
			return false;
		}
	}

}

//IC卡从无卡号电话卡继承
class IC_Card extends None_Number_PhoneCard
{
	boolean performDial()
	{
		if (balance > 0.5) 
		{
			balance -= 0.5;
			return true;
		} else {
			return false;
		}
	}
}

//IP电话卡从有卡号电话卡继承
class IP_Card extends Number_PhoneCard
{
	Date expireDate;  //失效日期
	
	boolean performDial()
	{
		if (balance > 0.3 && expireDate.after(new Date())) {
			balance -= 0.3;
			return true;
		} else {
			return false;
		}
	}
}

//200卡从有卡号电话卡继承
class D200_Card extends Number_PhoneCard
{
	double additoryFee;
	
	boolean performDial()
	{
		if (balance > (0.5 + additoryFee)) 
		{
			balance -= (0.5 + additoryFee);
			return true;
		} else {
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
