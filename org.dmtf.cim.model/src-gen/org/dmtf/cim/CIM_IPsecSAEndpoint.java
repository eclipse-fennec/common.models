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
 * A representation of the model object '<em><b>CIM IPsec SA Endpoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * IPsecSAEndpoints are types of SecurityAssociationEndpoints representing both negotiated and static SAs that correspond to AH, ESP, or IPCOMP transforms.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getSPI <em>SPI</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getInboundDirection <em>Inbound Direction</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getEncapsulationMode <em>Encapsulation Mode</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getDFHandling <em>DF Handling</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getPFSInUse <em>PFS In Use</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPsecSAEndpoint()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.8.0' UMLPackagePath='CIM::Network::IPsec' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_IPsecSAEndpoint extends CIM_SecurityAssociationEndpoint {
	/**
	 * Returns the value of the '<em><b>SPI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * SPI contains the Security Parameter Index of the SA. This value in string form may also be used in the key field 'Name' inherited from ServiceAccessPoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>SPI</em>' attribute.
	 * @see #setSPI(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecSAEndpoint_SPI()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getSPI();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getSPI <em>SPI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPI</em>' attribute.
	 * @see #getSPI()
	 * @generated
	 */
	void setSPI(Long value);

	/**
	 * Returns the value of the '<em><b>Inbound Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * InboundDirection specifies whether the SA applies to inbound (TRUE) or outbound (FALSE) traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Inbound Direction</em>' attribute.
	 * @see #setInboundDirection(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecSAEndpoint_InboundDirection()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getInboundDirection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getInboundDirection <em>Inbound Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Direction</em>' attribute.
	 * @see #getInboundDirection()
	 * @generated
	 */
	void setInboundDirection(Boolean value);

	/**
	 * Returns the value of the '<em><b>Encapsulation Mode</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * EncapsulationMode indicates whether the IPsecSAEndpoint uses transport or tunnel encapsulation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Encapsulation Mode</em>' attribute.
	 * @see #setEncapsulationMode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecSAEndpoint_EncapsulationMode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\"]' Values='[\"Unknown\",\"Tunnel\",\"Transport\"]'"
	 * @generated
	 */
	Integer getEncapsulationMode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getEncapsulationMode <em>Encapsulation Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Encapsulation Mode</em>' attribute.
	 * @see #getEncapsulationMode()
	 * @generated
	 */
	void setEncapsulationMode(Integer value);

	/**
	 * Returns the value of the '<em><b>DF Handling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * DFHandling controls how the 'Don't Fragment' bit is managed by the IPsecSAEndpoint.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DF Handling</em>' attribute.
	 * @see #setDFHandling(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecSAEndpoint_DFHandling()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Copy from Internal to External IP Header\",\"Set DF Bit in External Header to 1\",\"Set DF Bit in External Header to 0\"]'"
	 * @generated
	 */
	Integer getDFHandling();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getDFHandling <em>DF Handling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DF Handling</em>' attribute.
	 * @see #getDFHandling()
	 * @generated
	 */
	void setDFHandling(Integer value);

	/**
	 * Returns the value of the '<em><b>PFS In Use</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * PFSInUse indicates whether perfect forward secrecy is required when refreshing keys.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PFS In Use</em>' attribute.
	 * @see #setPFSInUse(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPsecSAEndpoint_PFSInUse()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getPFSInUse();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPsecSAEndpoint#getPFSInUse <em>PFS In Use</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PFS In Use</em>' attribute.
	 * @see #getPFSInUse()
	 * @generated
	 */
	void setPFSInUse(Boolean value);

} // CIM_IPsecSAEndpoint
