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
 * A representation of the model object '<em><b>CIM Print SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ServiceAccessPoint for a printing Service.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_PrintSAP#getPrintProtocol <em>Print Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_PrintSAP#getPrintProtocolInfo <em>Print Protocol Info</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_PrintSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.14.0' UMLPackagePath='CIM::Device::Printing' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_PrintSAP extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>Print Protocol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies the print procotols that this AccessPoint uses. Note, each entry of this array is related to the entry in the PrintProtocolInfo array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Protocol</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSAP_PrintProtocol()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"SMB\",\"BSD\",\"SYSV\",\"HPNP\",\"IPP\",\"Local\"]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|IANA-PRINTER-MIB.PrtChannelInformation\",\"MIB.IETF|Printer-MIB.prtChannelType\"]' ModelCorrespondence='[\"CIM_PrintSAP.PrintProtocolInfo\"]'"
	 * @generated
	 */
	EList<Integer> getPrintProtocol();

	/**
	 * Returns the value of the '<em><b>Print Protocol Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Provides clarifying or additional information about the protocols that are supported by this AccessPoint. Note, each entry of this array is related to the entry in the PrintProtocol array that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Print Protocol Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_PrintSAP_PrintProtocolInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MappingStrings='[\"MIB.IETF|IANA-PRINTER-MIB.PrtChannelInformation\",\"MIB.IETF|Printer-MIB.prtChannelType\"]' ModelCorrespondence='[\"CIM_PrintSAP.PrintProtocol\"]'"
	 * @generated
	 */
	EList<String> getPrintProtocolInfo();

} // CIM_PrintSAP
