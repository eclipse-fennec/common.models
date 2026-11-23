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
 * A representation of the model object '<em><b>CIM Installed Software Identity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The InstalledSoftwareIdentity association identifies the System on which a SoftwareIdentity is installed. This class is a corollary to InstalledSoftwareElement, but deals with the asset aspects of software (as indicated by SoftwareIdentity), versus the deployment aspects (as indicated by SoftwareElement).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_InstalledSoftwareIdentity#getSystem <em>System</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_InstalledSoftwareIdentity#getInstalledSoftware <em>Installed Software</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_InstalledSoftwareIdentity()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.8.0' UMLPackagePath='CIM::Core::Software' keys='System,InstalledSoftware'"
 * @generated
 */
@ProviderType
public interface CIM_InstalledSoftwareIdentity extends EObject {
	/**
	 * Returns the value of the '<em><b>System</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The system on which the software is installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System</em>' reference.
	 * @see #setSystem(CIM_System)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledSoftwareIdentity_System()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_System REF' Key='true'"
	 * @generated
	 */
	CIM_System getSystem();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledSoftwareIdentity#getSystem <em>System</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System</em>' reference.
	 * @see #getSystem()
	 * @generated
	 */
	void setSystem(CIM_System value);

	/**
	 * Returns the value of the '<em><b>Installed Software</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The SoftwareIdentity that is installed.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Installed Software</em>' reference.
	 * @see #setInstalledSoftware(CIM_SoftwareIdentity)
	 * @see org.dmtf.cim.CimPackage#getCIM_InstalledSoftwareIdentity_InstalledSoftware()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_SoftwareIdentity REF' Key='true'"
	 * @generated
	 */
	CIM_SoftwareIdentity getInstalledSoftware();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_InstalledSoftwareIdentity#getInstalledSoftware <em>Installed Software</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Installed Software</em>' reference.
	 * @see #getInstalledSoftware()
	 * @generated
	 */
	void setInstalledSoftware(CIM_SoftwareIdentity value);

} // CIM_InstalledSoftwareIdentity
