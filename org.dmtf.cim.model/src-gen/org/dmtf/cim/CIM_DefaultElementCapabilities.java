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
 * A representation of the model object '<em><b>CIM Default Element Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An association between a CIM_ManagedElement and a CIM_Capabilities element that specifies that the managed element uses the other as a default. The CIM_Capabilities element MUST be associated to the CIM_ManagedElement by CIM_ElementCapabilities as well.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DefaultElementCapabilities#getManagedElement <em>Managed Element</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DefaultElementCapabilities#getCapabilities <em>Capabilities</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DefaultElementCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.45.0' UMLPackagePath='CIM::System::FilesystemServices' keys='ManagedElement,Capabilities'"
 * @generated
 */
@ProviderType
public interface CIM_DefaultElementCapabilities extends EObject {
	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_ManagedElement for which this Capabilities element is a default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_DefaultElementCapabilities_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DefaultElementCapabilities#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

	/**
	 * Returns the value of the '<em><b>Capabilities</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The CIM_Capabilities that is the default Capabilities element for the associated CIM_ManagedElement.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capabilities</em>' reference.
	 * @see #setCapabilities(CIM_Capabilities)
	 * @see org.dmtf.cim.CimPackage#getCIM_DefaultElementCapabilities_Capabilities()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_Capabilities REF' Key='true' Max='1'"
	 * @generated
	 */
	CIM_Capabilities getCapabilities();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DefaultElementCapabilities#getCapabilities <em>Capabilities</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capabilities</em>' reference.
	 * @see #getCapabilities()
	 * @generated
	 */
	void setCapabilities(CIM_Capabilities value);

} // CIM_DefaultElementCapabilities
