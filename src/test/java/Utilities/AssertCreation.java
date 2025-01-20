package Utilities;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertCreation {

	private static final AssertCreation assertcreate = new AssertCreation();
	public SoftAssert softasr;
	// private Assert hardasr;

	private AssertCreation() {
		softasr = new SoftAssert();

	}

	public static AssertCreation getObject() {
		return assertcreate;

	}

}
