package project1;

import java.text.DecimalFormat;
import java.text.Format;

public class Test {

	public static void main(String[] args) {
		double a =15.256655;
		DecimalFormat cc=new DecimalFormat("0.00");
		System.out.println(cc.format(a));

	}

}
