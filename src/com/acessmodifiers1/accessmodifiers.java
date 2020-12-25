package com.acessmodifiers1;

import com.accessmodifiers2.modifiers;
import com.accessmodifiers2.modifiers.*;

//*******************************Access Modifiers--4 types
//private, public, protected, default
//private and protected cannot be used with class
//public--can be accessed from within class, outside class, within package and outside package
//private--can be accessed only from specific class ie only within class
//Default--can be accessed only within package. cannot be accessed outside package. If you donot
//specify any access level then it will be considered as default.
//protected--Access is with in package and outside package through child class. if you do not make child class
//it cannot be accessed from outside package.
//******************************Non-access modifiers--static, abstract etc
public class accessmodifiers {
	public static void main(String[] args) {
		modifiers s = new modifiers();
		s.rollnum=9;
//		s.marks=99;
	}

}
