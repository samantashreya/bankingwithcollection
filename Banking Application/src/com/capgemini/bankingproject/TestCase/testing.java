package com.capgemini.bankingproject.TestCase;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.capgemini.bankingproject.bean.Customer;
import com.capgemini.bankingproject.dao.BankDaoImpl;
import com.capgemini.bankingproject.dao.IBankDao;
import com.capgemini.bankingproject.exception.BankException;
import com.capgemini.bankingproject.service.BankServiceImpl;
import com.capgemini.bankingproject.service.IBankService;

public class testing {

	static IBankService obj2=null;
	Customer customer=new Customer("ShreyaC","shreya@gmail","100","afdf");
	@BeforeClass
	public static void setUpBeforeClass() throws Exception  {
	 obj2=new BankServiceImpl();
	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	/*@Test(expected=BankException.class)
	void getCustomerList() throws BankException{
		obj2.custEmailValidation("Shhjhkjh@gmail.com");
		
	}*/
	/*@Test(expected=BankException.class)*/
	void testaddToCustomer() {
		try {
			assertNotNull(obj2.addToCustomer(customer));
			assertNotEquals(obj2.addToCustomer(customer),123);
		//	assertNotSame(obj2.addToCustomer(customer),123);
		} catch (BankException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}}
