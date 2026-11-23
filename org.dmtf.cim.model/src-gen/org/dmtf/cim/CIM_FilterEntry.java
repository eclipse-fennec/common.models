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
 * A representation of the model object '<em><b>CIM Filter Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FilterEntry is used by network devices to identify traffic and either forward it (with possibly further processing) to its destination, or to deny its forwarding. It is one of the building block of FilterLists. 
 * 
 * This class is oriented towards packet filtering. Other subclasses of FilterEntryBase can be defined to do other types of filtering. 
 * 
 * A FilterEntry is weak to the network device (i.e., the ComputerSystem) that contains it. Hence, the ComputerSystem keys are propagated to this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getTrafficType <em>Traffic Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getOtherTrafficType <em>Other Traffic Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getOtherMatchConditionType <em>Other Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getMatchConditionValue <em>Match Condition Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getAction <em>Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getDefaultFilter <em>Default Filter</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_FilterEntry#getTrafficClass <em>Traffic Class</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::Filtering' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_FilterEntry extends CIM_FilterEntryBase {
	/**
	 * Returns the value of the '<em><b>Traffic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the type of traffic that is being filtered. This will affect the filtering rules in the MatchCondition property of this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traffic Type</em>' attribute.
	 * @see #setTrafficType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_TrafficType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"IPv4\",\"IPX\",\"IPv6\",\"Any\",\"Other\"]' ModelCorrespondence='[\"CIM_FilterEntry.OtherTrafficType\"]'"
	 * @generated
	 */
	Integer getTrafficType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getTrafficType <em>Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Type</em>' attribute.
	 * @see #getTrafficType()
	 * @generated
	 */
	void setTrafficType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Traffic Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value of the TrafficType property in this class is 5 (i.e., "Other"), then the specific type of traffic is specified in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Traffic Type</em>' attribute.
	 * @see #setOtherTrafficType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_OtherTrafficType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FilterEntry.TrafficType\"]'"
	 * @generated
	 */
	String getOtherTrafficType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getOtherTrafficType <em>Other Traffic Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Traffic Type</em>' attribute.
	 * @see #getOtherTrafficType()
	 * @generated
	 */
	void setOtherTrafficType(String value);

	/**
	 * Returns the value of the '<em><b>Match Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies one of a set of ways to identify traffic. If the value is 1 (i.e., "Other"), then the specific type of filtering is specified in the OtherMatchConditionType property of this class.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Condition Type</em>' attribute.
	 * @see #setMatchConditionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_MatchConditionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\",\"11\",\"12\",\"13\"]' Values='[\"Other\",\"Source Address and Mask\",\"Destination Address and Mask\",\"Source Port\",\"Source Port Range\",\"Destination Port\",\"Destination Port Range\",\"Protocol Type\",\"Protocol Type and Option\",\"DSCP\",\"ToS Value\",\"802.1P Priority Value\",\"Any\"]' ModelCorrespondence='[\"CIM_FilterEntry.OtherMatchConditionType\"]'"
	 * @generated
	 */
	Integer getMatchConditionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getMatchConditionType <em>Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Condition Type</em>' attribute.
	 * @see #getMatchConditionType()
	 * @generated
	 */
	void setMatchConditionType(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Match Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value of the MatchConditionType property in this class is 1 (i.e., "Other"), then the specific type of filtering is specified in this property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Match Condition Type</em>' attribute.
	 * @see #setOtherMatchConditionType(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_OtherMatchConditionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_FilterEntry.MatchConditionType\"]'"
	 * @generated
	 */
	String getOtherMatchConditionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getOtherMatchConditionType <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Match Condition Type</em>' attribute.
	 * @see #getOtherMatchConditionType()
	 * @generated
	 */
	void setOtherMatchConditionType(String value);

	/**
	 * Returns the value of the '<em><b>Match Condition Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the value of the condition that filters the traffic. It corresponds to the condition specified in the MatchConditionType property. If, however, the value of the MatchConditionProperty is 1, then it corresponds to the condition specified in the OtherMatchConditionType property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Condition Value</em>' attribute.
	 * @see #setMatchConditionValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_MatchConditionValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getMatchConditionValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getMatchConditionValue <em>Match Condition Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match Condition Value</em>' attribute.
	 * @see #getMatchConditionValue()
	 * @generated
	 */
	void setMatchConditionValue(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines whether the action should be to forward or deny traffic meeting the match condition specified in this filter.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_Action()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Permit\",\"Deny\"]'"
	 * @generated
	 */
	Integer getAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Default Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines whether this FilterEntry is the default entry to use by its FilterList.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Default Filter</em>' attribute.
	 * @see #setDefaultFilter(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_DefaultFilter()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getDefaultFilter();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getDefaultFilter <em>Default Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Filter</em>' attribute.
	 * @see #getDefaultFilter()
	 * @generated
	 */
	void setDefaultFilter(Boolean value);

	/**
	 * Returns the value of the '<em><b>Traffic Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the traffic class that is being matched by this FilterEntry. Note that FilterEntries are aggregated into FilterLists by the EntriesInFilterList relationship. If the EntrySequence property of the aggregation is set to 0, this means that all the Filter Entries should be ANDed together. Consequently, the TrafficClass property of each of the aggregated Entries should be set to the same value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Traffic Class</em>' attribute.
	 * @see #setTrafficClass(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_FilterEntry_TrafficClass()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getTrafficClass();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_FilterEntry#getTrafficClass <em>Traffic Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Traffic Class</em>' attribute.
	 * @see #getTrafficClass()
	 * @generated
	 */
	void setTrafficClass(String value);

} // CIM_FilterEntry
