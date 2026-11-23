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
 * A representation of the model object '<em><b>CIM BGP Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class defines the BGP Attributes, that can be used to affect routing decisions. BGPAttributes are specific to a given AutonomousSystem that contains it. Hence, the keys of the AutonomousSystem are propagated to this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getVersion <em>Version</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getLocalPreference <em>Local Preference</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getASPath <em>AS Path</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getAsSet <em>As Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getNextHop <em>Next Hop</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getNextHopSelf <em>Next Hop Self</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getMED <em>MED</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getBGPCommunityValue <em>BGP Community Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getAtomicAggregate <em>Atomic Aggregate</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getOrigin <em>Origin</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPAttributes#getOriginatorID <em>Originator ID</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::BGP' keys='SystemCreationClassName,SystemName,Version'"
 * @generated
 */
@ProviderType
public interface CIM_BGPAttributes extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping AutonomousSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AutonomousSystem.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * The scoping AutonomousSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AutonomousSystem.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the version of the BGP protocol.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_Version()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Local Preference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the priority, or preference, of a route, in order to better compare it with other routes for the same destination. Higher values indicate a higher preference for a route.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Local Preference</em>' attribute.
	 * @see #setLocalPreference(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_LocalPreference()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrLocalPref\"]'"
	 * @generated
	 */
	Integer getLocalPreference();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getLocalPreference <em>Local Preference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Preference</em>' attribute.
	 * @see #getLocalPreference()
	 * @generated
	 */
	void setLocalPreference(Integer value);

	/**
	 * Returns the value of the '<em><b>AS Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute is a sequences of the AS numbers through which routing information carried in this UPDATE message has passed. The components of this list can be AS_SETs or AS_SEQUENCEs.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>AS Path</em>' attribute.
	 * @see #setASPath(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_ASPath()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrASPath\"]'"
	 * @generated
	 */
	String getASPath();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getASPath <em>AS Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AS Path</em>' attribute.
	 * @see #getASPath()
	 * @generated
	 */
	void setASPath(String value);

	/**
	 * Returns the value of the '<em><b>As Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the set of all elements contained in all specific paths that are being summarized, so that those attributes will remain available to the routing decision process.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>As Set</em>' attribute.
	 * @see #setAsSet(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_AsSet()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getAsSet();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getAsSet <em>As Set</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>As Set</em>' attribute.
	 * @see #getAsSet()
	 * @generated
	 */
	void setAsSet(String value);

	/**
	 * Returns the value of the '<em><b>Next Hop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This attribute defines the IP address of the border router that should be used as the next hop to the destinations listed in the UPDATE message.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Hop</em>' attribute.
	 * @see #setNextHop(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_NextHop()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrNextHop\"]'"
	 * @generated
	 */
	String getNextHop();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getNextHop <em>Next Hop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Hop</em>' attribute.
	 * @see #getNextHop()
	 * @generated
	 */
	void setNextHop(String value);

	/**
	 * Returns the value of the '<em><b>Next Hop Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the next hop to be the IP address of the border IBGP neighbor.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Next Hop Self</em>' attribute.
	 * @see #setNextHopSelf(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_NextHopSelf()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getNextHopSelf();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getNextHopSelf <em>Next Hop Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Hop Self</em>' attribute.
	 * @see #getNextHopSelf()
	 * @generated
	 */
	void setNextHopSelf(String value);

	/**
	 * Returns the value of the '<em><b>MED</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is used on external (e.g., inter-AS) links to indicate which is the preferred entry point into an AS, when that AS has multiple entry points. Lower MED values have preference.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MED</em>' attribute.
	 * @see #setMED(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_MED()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrMultiExitDisc\"]'"
	 * @generated
	 */
	Long getMED();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getMED <em>MED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MED</em>' attribute.
	 * @see #getMED()
	 * @generated
	 */
	void setMED(Long value);

	/**
	 * Returns the value of the '<em><b>BGP Community Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a group of destinations that share a similar property. Communities are not restricted to a single AS, and can span multiple ASs. This attribute is used to simplify routing policies by basing policies on a logical value, as opposed to an IP address or an AS number.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BGP Community Value</em>' attribute.
	 * @see #setBGPCommunityValue(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_BGPCommunityValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getBGPCommunityValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getBGPCommunityValue <em>BGP Community Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Community Value</em>' attribute.
	 * @see #getBGPCommunityValue()
	 * @generated
	 */
	void setBGPCommunityValue(Long value);

	/**
	 * Returns the value of the '<em><b>Atomic Aggregate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This property is set to TRUE if there are overlapping routes, and a less-specific route is selected instead of a more specific one (e.g., a system propagates an aggregate that causes loss of information). The value is set to FALSE if a less-specific route is NOT selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Atomic Aggregate</em>' attribute.
	 * @see #setAtomicAggregate(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_AtomicAggregate()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrAtomicAggregate\"]'"
	 * @generated
	 */
	Boolean getAtomicAggregate();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getAtomicAggregate <em>Atomic Aggregate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Atomic Aggregate</em>' attribute.
	 * @see #getAtomicAggregate()
	 * @generated
	 */
	void setAtomicAggregate(Boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies the AS and IP address of the router that has generated an aggregate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Aggregator</em>' attribute.
	 * @see #setAggregator(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_Aggregator()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrAggregatorAS\"]'"
	 * @generated
	 */
	String getAggregator();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getAggregator <em>Aggregator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregator</em>' attribute.
	 * @see #getAggregator()
	 * @generated
	 */
	void setAggregator(String value);

	/**
	 * Returns the value of the '<em><b>Origin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is generated by the AS that originates the routing information. There are three types of origins - IGP, EGP, and INCOMPLETE. These correspond to whether the information was learned internally in the AS, externally via an EGP, or by some other means.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Origin</em>' attribute.
	 * @see #setOrigin(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_Origin()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"IGP\",\"EGP\",\"INCOMPLETE\"]' MappingStrings='[\"MIB.IETF|BGP4-MIB.bgp4PathAttrOrigin\"]'"
	 * @generated
	 */
	Integer getOrigin();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getOrigin <em>Origin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Origin</em>' attribute.
	 * @see #getOrigin()
	 * @generated
	 */
	void setOrigin(Integer value);

	/**
	 * Returns the value of the '<em><b>Originator ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the router ID for the ORIGIN attribute.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Originator ID</em>' attribute.
	 * @see #setOriginatorID(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPAttributes_OriginatorID()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getOriginatorID();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPAttributes#getOriginatorID <em>Originator ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Originator ID</em>' attribute.
	 * @see #getOriginatorID()
	 * @generated
	 */
	void setOriginatorID(String value);

} // CIM_BGPAttributes
