/*
 * Copyright (c) 2026 Contributors to the Eclipse Foundation.
 * 
 * This program and the accompanying materials are made available under the terms of the Eclipse Public License 2.0 which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *   Data In Motion Consulting - initial implementation
 */
package org.dmtf.cim;

import org.eclipse.emf.ecore.EObject;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Installed Software Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InstalledSoftwareElement association allows the identification of the ComputerSystem on which a particular SoftwareElement is installed.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstalledSoftwareElement#getSoftware <em>Software</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledSoftwareElement#getSystem <em>System</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstalledSoftwareElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.6.0' UMLPackagePath='CIM::Application::SystemSoftware' keys='Software,System'"
 * @generated
 */
@ProviderType
public interface CIM_InstalledSoftwareElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the Software Element that is installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Software</em>' reference.
	 * @see #setSoftware(CIM_SoftwareElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledSoftwareElement_Software()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareElement REF' Key='true'"
	 * @generated
	 */
	CIM_SoftwareElement getSoftware();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledSoftwareElement#getSoftware <em>Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software</em>' reference.
	 * @see #getSoftware()
	 * @generated
	 */
	void setSoftware(CIM_SoftwareElement value);

	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Reference to the ComputerSystem hosting a particular SoftwareElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(CIM_ComputerSystem)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledSoftwareElement_System()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ComputerSystem REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_ComputerSystem getSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledSoftwareElement#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(CIM_ComputerSystem value);

} // CIM_InstalledSoftwareElement
