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
 * A representation of the model object '<em><b>CIM SAP Available For Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_SAPAvailableForElement conveys the semantics of a Service Access Point that is available for a ManagedElement. When CIM_SAPAvailableForElement is not instantiated, then the SAP is assumed to be generally available. If instantiated, the SAP is available only for the associated ManagedElements. For example, a device might provide management access through a URL. This association allows the URL to be advertised for the device.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_SAPAvailableForElement#getAvailableSAP <em>Available SAP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_SAPAvailableForElement#getManagedElement <em>Managed Element</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_SAPAvailableForElement()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Version='2.10.0' UMLPackagePath='CIM::Core::Service' keys='AvailableSAP,ManagedElement'"
 * @generated
 */
@ProviderType
public interface CIM_SAPAvailableForElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Available SAP</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Service Access Point that is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available SAP</em>' reference.
	 * @see #setAvailableSAP(CIM_ServiceAccessPoint)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAPAvailableForElement_AvailableSAP()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ServiceAccessPoint REF' Key='true'"
	 * @generated
	 */
	CIM_ServiceAccessPoint getAvailableSAP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAPAvailableForElement#getAvailableSAP <em>Available SAP</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Available SAP</em>' reference.
	 * @see #getAvailableSAP()
	 * @generated
	 */
	void setAvailableSAP(CIM_ServiceAccessPoint value);

	/**
	 * Returns the value of the '<em><b>Managed Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The ManagedElement for which the SAP is available.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Managed Element</em>' reference.
	 * @see #setManagedElement(CIM_ManagedElement)
	 * @see org.dmtf.cim.CimPackage#getCIM_SAPAvailableForElement_ManagedElement()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' Key='true'"
	 * @generated
	 */
	CIM_ManagedElement getManagedElement();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_SAPAvailableForElement#getManagedElement <em>Managed Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Managed Element</em>' reference.
	 * @see #getManagedElement()
	 * @generated
	 */
	void setManagedElement(CIM_ManagedElement value);

} // CIM_SAPAvailableForElement
