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
 * A representation of the model object '<em><b>CIM KVM Redirection SAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from Service Access Point, that describes an access point to start the KVM redirection. One access point represents access to a single KVM redirection stream.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_KVMRedirectionSAP#getKVMProtocol <em>KVM Protocol</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_KVMRedirectionSAP#getOtherKVMProtocol <em>Other KVM Protocol</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_KVMRedirectionSAP()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.22.0' UMLPackagePath='CIM::Network::ConsoleProtocols' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_KVMRedirectionSAP extends CIM_ServiceAccessPoint {
	/**
	 * Returns the value of the '<em><b>KVM Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration specifying the type of the KVM stream supported on this SAP. In some cases this may be a raw video steam, with the characters having no special meaning. However, in other cases it may support a protocol where some messages have a predefined structure. 
	 * 0 "Unknown" shall indicate the protocol is unknown. 
	 * 1 "Other" shall indicate the protocol is specified in OtherKVMProtocol. 
	 * 2 "Raw" shall indicate the protocol is a raw and uncompressed data stream. 3 "RDP" shall indicate the protocol is the Remote Desktop Protocol. 
	 * 4 "VNC" shall indicate the protocol is the VNC Protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>KVM Protocol</em>' attribute.
	 * @see #setKVMProtocol(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_KVMRedirectionSAP_KVMProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5..32767\",\"32768..65535\"]' Values='[\"Unknown\",\"Other\",\"Raw\",\"RDP\",\"VNC-RFB\",\"DMTF Reserved\",\"Vendor Specified\"]' ModelCorrespondence='[\"CIM_KVMRedirectionSAP.OtherKVMProtocol\"]'"
	 * @generated
	 */
	Integer getKVMProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KVMRedirectionSAP#getKVMProtocol <em>KVM Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KVM Protocol</em>' attribute.
	 * @see #getKVMProtocol()
	 * @generated
	 */
	void setKVMProtocol(Integer value);

	/**
	 * Returns the value of the '<em><b>Other KVM Protocol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the KVMProtocol when the value of the KVMProtocol property is set to 1 = "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other KVM Protocol</em>' attribute.
	 * @see #setOtherKVMProtocol(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_KVMRedirectionSAP_OtherKVMProtocol()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_KVMRedirectionSAP.KVMProtocol\"]'"
	 * @generated
	 */
	String getOtherKVMProtocol();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_KVMRedirectionSAP#getOtherKVMProtocol <em>Other KVM Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other KVM Protocol</em>' attribute.
	 * @see #getOtherKVMProtocol()
	 * @generated
	 */
	void setOtherKVMProtocol(String value);

} // CIM_KVMRedirectionSAP
