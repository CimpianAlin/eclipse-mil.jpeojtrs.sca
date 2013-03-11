/*******************************************************************************
 * This file is protected by Copyright. 
 * Please refer to the COPYRIGHT file distributed with this source distribution.
 *
 * This file is part of REDHAWK IDE.
 *
 * All rights reserved.  This program and the accompanying materials are made available under 
 * the terms of the Eclipse Public License v1.0 which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package mil.jpeojtrs.sca.dmd.tests;

import junit.framework.TestCase;
import junit.textui.TestRunner;
import mil.jpeojtrs.sca.dmd.DmdFactory;
import mil.jpeojtrs.sca.dmd.DomainManagerConfiguration;
import mil.jpeojtrs.sca.dmd.NamingService;

import org.junit.Assert;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Naming Service</b></em>'. <!-- end-user-doc -->
 * @generated
 */
public class NamingServiceTest extends TestCase {

	/**
	 * The fixture for this Naming Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingService fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(NamingServiceTest.class);
	}

	/**
	 * Constructs a new Naming Service test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamingServiceTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Naming Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(NamingService fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Naming Service test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamingService getFixture() {
		return fixture;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated NOT
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(DmdFactory.eINSTANCE.createNamingService());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated NOT
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void testParse() throws Exception {
		final DomainManagerConfiguration domainMgrConfig = DmdTests.getTestFileDomainManagerConfiguration();
		final NamingService namingService = domainMgrConfig.getServices().getService().get(0).getFindBy().getNameService();
		Assert.assertNotNull(namingService);
		Assert.assertEquals("testNamingService", namingService.getName());
	}

} // NamingServiceTest
