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
 * A representation of the model object '<em><b>CIM BGP Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to represent the basic operation of BGP. It is derived from RouteCalculationService, the superclass of all routing protocols.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPService#getBGPVersion <em>BGP Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPService#getLastErrorCode <em>Last Error Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPService#getLastMessageErrorSubCode <em>Last Message Error Sub Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPService#getLastOpenErrorSubCode <em>Last Open Error Sub Code</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPService#getLastUpdateErrorSubCode <em>Last Update Error Sub Code</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::BGP' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BGPService extends CIM_RouteCalculationService {
	/**
	 * Returns the value of the '<em><b>BGP Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The BGPVersion property defines the version of BGP that this router is using. This is part of the BGP peer negotiation process).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BGP Version</em>' attribute.
	 * @see #setBGPVersion(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPService_BGPVersion()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgpVersion\"]'"
	 * @generated
	 */
	Integer getBGPVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPService#getBGPVersion <em>BGP Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Version</em>' attribute.
	 * @see #getBGPVersion()
	 * @generated
	 */
	void setBGPVersion(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * BGP sends errors using a NOTIFICATION message. This message contains an error code, an error subcode, and error data. The error code defines the type of the notification. The 'Cease' error is for all fatal errors that are not one of the other five types of errors. For several of the errors, subcode information is also enumerated in other properties of this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Error Code</em>' attribute.
	 * @see #setLastErrorCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPService_LastErrorCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"None\",\"Message Header Error\",\"OPEN Message Error\",\"UPDATE Message Error\",\"Hold Timer Expired\",\"Finite State Machine Error\",\"Cease\"]'"
	 * @generated
	 */
	Integer getLastErrorCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPService#getLastErrorCode <em>Last Error Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Error Code</em>' attribute.
	 * @see #getLastErrorCode()
	 * @generated
	 */
	void setLastErrorCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Message Error Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the BGP error subcode for message header errors (LastErrorCode = 1). If LastErrorCode is any other value, then this property should be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Message Error Sub Code</em>' attribute.
	 * @see #setLastMessageErrorSubCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPService_LastMessageErrorSubCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\"]' Values='[\"None\",\"Connection Not Synchronized\",\"Bad Message Length\",\"Bad Message Type\"]'"
	 * @generated
	 */
	Integer getLastMessageErrorSubCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPService#getLastMessageErrorSubCode <em>Last Message Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Message Error Sub Code</em>' attribute.
	 * @see #getLastMessageErrorSubCode()
	 * @generated
	 */
	void setLastMessageErrorSubCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Open Error Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the BGP error subcode for OPEN message errors (LastErrorCode = 2). If LastErrorCode is any other value, then this property should be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Open Error Sub Code</em>' attribute.
	 * @see #setLastOpenErrorSubCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPService_LastOpenErrorSubCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\"]' Values='[\"None\",\"Unsupported Version Number\",\"Bad Peer AS\",\"Bad BGP Identifier\",\"Unsupported Optional Parameter\",\"Authentication Failure\",\"Unacceptable Hold Time\"]'"
	 * @generated
	 */
	Integer getLastOpenErrorSubCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPService#getLastOpenErrorSubCode <em>Last Open Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Open Error Sub Code</em>' attribute.
	 * @see #getLastOpenErrorSubCode()
	 * @generated
	 */
	void setLastOpenErrorSubCode(Integer value);

	/**
	 * Returns the value of the '<em><b>Last Update Error Sub Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the BGP error subcode for UPDATE message errors (LastErrorCode = 3). If LastErrorCode is any other value, then this property should be set to NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Last Update Error Sub Code</em>' attribute.
	 * @see #setLastUpdateErrorSubCode(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPService_LastUpdateErrorSubCode()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\"]' Values='[\"None\",\"Malformed Attribute List\",\"Unrecognized Well-Known Attribute\",\"Missing Well-Known Attribute\",\"Attribute Flags Error\",\"Attribute Length Error\",\"Invalid Origin Attribute\",\"AS Routing Loop\",\"Invalid NEXT_HOP Attribute\",\"Optional Attribute Error\",\"Invalid Network Field\",\"Malformed AS_path\"]'"
	 * @generated
	 */
	Integer getLastUpdateErrorSubCode();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPService#getLastUpdateErrorSubCode <em>Last Update Error Sub Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Update Error Sub Code</em>' attribute.
	 * @see #getLastUpdateErrorSubCode()
	 * @generated
	 */
	void setLastUpdateErrorSubCode(Integer value);

} // CIM_BGPService
