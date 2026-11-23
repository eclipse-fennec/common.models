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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM FCHBA Diagnostic Service Capabilities</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the permissible settings that can be used for FC HBA diagnostic tests.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticServiceCapabilities#getBufferSizesSupported <em>Buffer Sizes Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FCHBADiagnosticServiceCapabilities#getMaxPatternSizeSupported <em>Max Pattern Size Supported</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticServiceCapabilities()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.45.0' UMLPackagePath='CIM::System::Diagnostics' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_FCHBADiagnosticServiceCapabilities extends CIM_DiagnosticServiceCapabilities {
	/**
	 * Returns the value of the '<em><b>Buffer Sizes Supported</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Long}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This array property is used by a provider to specify the list of buffer sizes supported by the test. The client should only select one of these values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Buffer Sizes Supported</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticServiceCapabilities_BufferSizesSupported()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32[]' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.BufferPattern\"]'"
	 * @generated
	 */
	EList<Long> getBufferSizesSupported();

	/**
	 * Returns the value of the '<em><b>Max Pattern Size Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is used by a provider to specify the size of the largest pattern a client may specify in octets (8 bits). If the buffer pattern is smaller than the size of the data buffer, the pattern will be repeated as necessary to fill the buffer. If the buffer pattern is larger than the data buffer size, then the pattern will be truncated
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Pattern Size Supported</em>' attribute.
	 * @see #setMaxPatternSizeSupported(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FCHBADiagnosticServiceCapabilities_MaxPatternSizeSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ModelCorrespondence='[\"CIM_FCHBADiagnosticSettingData.BufferPattern\"]' PUnit='Octet'"
	 * @generated
	 */
	Integer getMaxPatternSizeSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FCHBADiagnosticServiceCapabilities#getMaxPatternSizeSupported <em>Max Pattern Size Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Pattern Size Supported</em>' attribute.
	 * @see #getMaxPatternSizeSupported()
	 * @generated
	 */
	void setMaxPatternSizeSupported(Integer value);

} // CIM_FCHBADiagnosticServiceCapabilities
