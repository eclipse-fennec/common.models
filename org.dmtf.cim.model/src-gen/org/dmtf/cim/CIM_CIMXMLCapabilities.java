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

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM CIMXML Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The capabilities for the CIM-XML protocol. For more information, see DSP0200, DSP0201 and DSP0203.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCapabilities#getMultipleOperationsSupported <em>Multiple Operations Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_CIMXMLCapabilities#getValidated <em>Validated</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.38.0' UMLPackagePath='CIM::Interop::WBEMProtocol' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_CIMXMLCapabilities extends CIM_WBEMProtocolServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Multiple Operations Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Multiple operations conveniently allow multiple method invocations to be batched into a single HTTP message. This value shall be true if multiple operations are supported; false otherwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Multiple Operations Supported</em>' attribute.
	 * @see #setMultipleOperationsSupported(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCapabilities_MultipleOperationsSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getMultipleOperationsSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCapabilities#getMultipleOperationsSupported <em>Multiple Operations Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Operations Supported</em>' attribute.
	 * @see #getMultipleOperationsSupported()
	 * @generated
	 */
	void setMultipleOperationsSupported(Boolean value);

	/**
	 * Returns the value of the '<em><b>Validated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes whether the CIM Server is strictly validating (validates the XML document against the DTD) or not (loosely validating).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Validated</em>' attribute.
	 * @see #setValidated(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_CIMXMLCapabilities_Validated()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' Required='true'"
	 * @generated
	 */
	Boolean getValidated();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_CIMXMLCapabilities#getValidated <em>Validated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validated</em>' attribute.
	 * @see #getValidated()
	 * @generated
	 */
	void setValidated(Boolean value);

} // CIM_CIMXMLCapabilities
