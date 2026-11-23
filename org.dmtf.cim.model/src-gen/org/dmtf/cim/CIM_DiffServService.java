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
 * A representation of the model object '<em><b>CIM Diff Serv Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * DiffServService represents the use of standard or custom DiffServ services (associated with particular Per Hop Behaviors, PHBs) to implement a (higher-level) QoSService. Note that the DiffServService may be just one of a set of coordinated QoSSubServices that together implement a higher-level QoSService. The relationship between the QoSServices is described using the association, QoSSubService.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_DiffServService#getDSCP <em>DSCP</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_DiffServService#getPHBID <em>PHBID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_DiffServService()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::QoS' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_DiffServService extends CIM_QoSService {
	/**
	 * Returns the value of the '<em><b>DSCP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is an unsigned 8-bit integer, and defines the Differentiated Services Code Point (DSCP) that this link uses to represent various types of differentiated services through device-specific configuration commands. It is deprecated since this information is conveyed via filter lists, associated with ClassifierElements. The DiffServService is better represented as a Per Hop Behavior.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DSCP</em>' attribute.
	 * @see #setDSCP(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiffServService_DSCP()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint8' Deprecated='[\"CIM_DiffServService.PHBID\"]'"
	 * @generated
	 */
	Integer getDSCP();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiffServService#getDSCP <em>DSCP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DSCP</em>' attribute.
	 * @see #getDSCP()
	 * @generated
	 */
	void setDSCP(Integer value);

	/**
	 * Returns the value of the '<em><b>PHBID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A 16-bit unsigned integer which identifies a particular per hop behavior, or family of per hop behaviors. The value is a Per Hop Behavior Identification Code, as defined in [R3140]. Note that as defined, these identification codes use the default, recommended, code points for PHBs as part of their structure. These values may well be different from the actual value used in the marker, as the marked value is domain-dependent. The ability to indicate the PHB Identification Code associated with a DiffServService is helpful when tying the QoSService to reference documents, and for inter-domain coordination and operation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PHBID</em>' attribute.
	 * @see #setPHBID(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_DiffServService_PHBID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16'"
	 * @generated
	 */
	Integer getPHBID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_DiffServService#getPHBID <em>PHBID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PHBID</em>' attribute.
	 * @see #getPHBID()
	 * @generated
	 */
	void setPHBID(Integer value);

} // CIM_DiffServService
