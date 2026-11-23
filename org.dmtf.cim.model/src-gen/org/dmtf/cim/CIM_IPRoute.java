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
 * A representation of the model object '<em><b>CIM IP Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An IPRoute relates a destination address to the address or interface through which the remote address may be reached. The destination address may be a specific IP endpoint or a subnet, dependent on the mask. An instance of this class represents either static or dynamic routing. Static routes are distinguished by setting the IsStatic boolean property to TRUE. 
 * 
 * Since many routes between endpoints can be defined (using different route calculation algorithms), the CIM_IPRoute class is defined as Abstract. This forces subclassing (for example, see CIM_BGPIPRoute) and allows the instances of its subclasses to be distinguished based on their CreationClassName key property. 
 * 
 * IPRoute is deprecated in lieu of the more general, concrete NextHopIPRoute class. NextHopIPRoute allows the definition of BOTH a next hop address and an interface for transmission of the traffic. Also, it does not mandate the instantiation of a ForwardingService class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getServiceCreationClassName <em>Service Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getServiceName <em>Service Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getIPDestinationAddress <em>IP Destination Address</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getIPDestinationMask <em>IP Destination Mask</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_IPRoute#getAddressType <em>Address Type</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_NextHopIPRoute\"]' Abstract='true' Version='2.7.0' UMLPackagePath='CIM::Network::Routes' override.DestinationAddress='string' override.DestinationAddress.Deprecated='[\"No value\"]' override.DestinationAddress.ModelCorrespondence='[\"CIM_IPRoute.IPDestinationAddress\"]' override.DestinationMask='string' override.DestinationMask.Deprecated='[\"No value\"]' override.DestinationMask.ModelCorrespondence='[\"CIM_IPRoute.IPDestinationMask\"]' keys='SystemCreationClassName,SystemName,ServiceCreationClassName,ServiceName,CreationClassName,IPDestinationAddress,IPDestinationMask,AddressType'"
 * @generated
 */
@ProviderType
public interface CIM_IPRoute extends CIM_NextHopRouting {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ForwardingService's SystemCreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_ForwardingService.SystemCreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #getSystemCreationClassName()
	 * @generated
	 */
	void setSystemCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>System Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ForwardingService's SystemName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_ForwardingService.SystemName'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Service Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ForwardingService's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Creation Class Name</em>' attribute.
	 * @see #setServiceCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_ServiceCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_ForwardingService.CreationClassName'"
	 * @generated
	 */
	String getServiceCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getServiceCreationClassName <em>Service Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Creation Class Name</em>' attribute.
	 * @see #getServiceCreationClassName()
	 * @generated
	 */
	void setServiceCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ForwardingService's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Name</em>' attribute.
	 * @see #setServiceName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_ServiceName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256' Propagated='CIM_ForwardingService.Name'"
	 * @generated
	 */
	String getServiceName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getServiceName <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Name</em>' attribute.
	 * @see #getServiceName()
	 * @generated
	 */
	void setServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>IP Destination Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The IP address which serves as the destination of the traffic, formatted according to the appropriate convention as defined in the AddressType property of this class. 
	 * 
	 * This property has the same semantics as DestinationAddress inherited from the NextHopRouting superclass, but a different property name. This is because this property and class were defined before NextHopRouting and are Key properties. They cannot be removed. ModelCorrespondence indicates that they should be set to equivalent values for consistency and ease of query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Destination Address</em>' attribute.
	 * @see #setIPDestinationAddress(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_IPDestinationAddress()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NextHopIPRoute.DestinationAddress\"]' Key='true' ModelCorrespondence='[\"CIM_IPRoute.DestinationAddress\"]'"
	 * @generated
	 */
	String getIPDestinationAddress();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getIPDestinationAddress <em>IP Destination Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Destination Address</em>' attribute.
	 * @see #getIPDestinationAddress()
	 * @generated
	 */
	void setIPDestinationAddress(String value);

	/**
	 * Returns the value of the '<em><b>IP Destination Mask</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The mask for the destination IP address, formatted according to the appropriate convention as defined in the AddressType property of this class. 
	 * 
	 * This property has the same semantics as DestinationMask inherited from the NextHopRouting superclass, but a different property name. This is because this property and class were defined before NextHopRouting and are Key properties. They cannot be removed. ModelCorrespondence indicates that they should be set to equivalent values for consistency and ease of query.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IP Destination Mask</em>' attribute.
	 * @see #setIPDestinationMask(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_IPDestinationMask()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"CIM_NextHopIPRoute.DestinationMask\"]' Key='true' ModelCorrespondence='[\"CIM_IPRoute.DestinationMask\"]'"
	 * @generated
	 */
	String getIPDestinationMask();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getIPDestinationMask <em>IP Destination Mask</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IP Destination Mask</em>' attribute.
	 * @see #getIPDestinationMask()
	 * @generated
	 */
	void setIPDestinationMask(String value);

	/**
	 * Returns the value of the '<em><b>Address Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An enumeration that describes the format of the address property. Addresses that can be formatted in IPv4 format, must be formatted that way to ensure mixed IPv4/IPv6 support. 
	 * 
	 * AddressType is part of the key so that an IPv4 and an IPv6 route to IP subnets with the same network number but different IP versions (v4/v6) can coexist.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Address Type</em>' attribute.
	 * @see #setAddressType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_IPRoute_AddressType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_NextHopIPRoute.AddressType\"]' Key='true' ValueMap='[\"0\",\"1\",\"2\"]' Values='[\"Unknown\",\"IPv4\",\"IPv6\"]'"
	 * @generated
	 */
	Integer getAddressType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_IPRoute#getAddressType <em>Address Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address Type</em>' attribute.
	 * @see #getAddressType()
	 * @generated
	 */
	void setAddressType(Integer value);

} // CIM_IPRoute
