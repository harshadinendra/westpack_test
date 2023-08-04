package test.westpack.com.test;

import java.util.Set;

import test.westpack.com.PinGenerator;
import test.westpack.com.imp.PinGeneratorA;

public class TestPinGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PinGenerator pinGen = new PinGeneratorA();

		Set<String> batch1 = pinGen.getPINs(4, 1000);

		System.out.println(batch1.size());
		System.out.println(batch1);
		
		Set<String> batch2 = pinGen.getPINs(5, 100000);
		System.out.println(batch2.size());
		

		try {

			pinGen.getPINs(-1, 100);

		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

		try {

			pinGen.getPINs(-1, 100);

		} catch (Exception e) {
			System.out.println(e.getMessage());// TODO: handle exception
		}

	}

}
