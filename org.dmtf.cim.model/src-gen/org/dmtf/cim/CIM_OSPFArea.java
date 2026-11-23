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
 * A representation of the model object '<em><b>CIM OSPF Area</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class represents an OSPF area. The definition of an OSPF area from RFC2328, is 'OSPF allows sets of networks to be grouped together. Such a grouping is called an area. The topology of an area is hidden from the rest of the Autonomous System. This information hiding enables a significant reduction in routing traffic. Also, routing within the area is determined only by the area's own topology, lending the area protection from bad routing data.' This class has a 'Type' propery, which distinguishes between the different area types. This approach was chosen, because it provides a simpler way to indicate the type of an area, and additional subclassing is not needed at this time.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_OSPFArea#getAreaID <em>Area ID</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFArea#getAreaType <em>Area Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_OSPFArea#getExtLsdbLimit <em>Ext Lsdb Limit</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_OSPFArea()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::OSPF' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_OSPFArea extends CIM_RoutingProtocolDomain {
	/**
	 * Returns the value of the '<em><b>Area ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The area ID of this OSPF area, see C.2 in RFC 2328.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area ID</em>' attribute.
	 * @see #setAreaID(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFArea_AreaID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfAreaId\"]'"
	 * @generated
	 */
	Long getAreaID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFArea#getAreaID <em>Area ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area ID</em>' attribute.
	 * @see #getAreaID()
	 * @generated
	 */
	void setAreaID(Long value);

	/**
	 * Returns the value of the '<em><b>Area Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of the OSPF area.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Area Type</em>' attribute.
	 * @see #setAreaType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFArea_AreaType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Required='true' ValueMap='[\"2\",\"3\",\"4\"]' Values='[\"Plain\",\"Stub\",\"NSSA\"]'"
	 * @generated
	 */
	Integer getAreaType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFArea#getAreaType <em>Area Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Area Type</em>' attribute.
	 * @see #getAreaType()
	 * @generated
	 */
	void setAreaType(Integer value);

	/**
	 * Returns the value of the '<em><b>Ext Lsdb Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the number of non-default AS-external-LSAs in a router's link-state database reaches this limit, the router enters OverflowState, see 2.1 in RFC 1765.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ext Lsdb Limit</em>' attribute.
	 * @see #setExtLsdbLimit(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_OSPFArea_ExtLsdbLimit()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|OSPF-MIB.ospfExtLsdbLimit\"]'"
	 * @generated
	 */
	Long getExtLsdbLimit();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_OSPFArea#getExtLsdbLimit <em>Ext Lsdb Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ext Lsdb Limit</em>' attribute.
	 * @see #getExtLsdbLimit()
	 * @generated
	 */
	void setExtLsdbLimit(Long value);

} // CIM_OSPFArea
