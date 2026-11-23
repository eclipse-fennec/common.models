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
 * A representation of the model object '<em><b>CIM BGP Route Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A route map is used to control and modify routing information as well as to define when a route is redistributed between routing domains. Route maps are placed in router configuration files, and several instances of the same route map may be used to implement different actions. RouteMaps MAY use FilterLists to identify the route. 
 * 
 * A BGPRouteMap is specific to a given AutonomousSystem that contains it. Hence, the keys of the AutonomousSystem are propagated to this class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getAction <em>Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getMatchConditionType <em>Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getOtherMatchConditionType <em>Other Match Condition Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getSetMetricType <em>Set Metric Type</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_BGPRouteMap#getSetMetricValue <em>Set Metric Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::BGP' override.Name='string' override.Name.Key='true' override.Name.Description='This is the name of the RouteMap class.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_BGPRouteMap extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping AutonomousSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AutonomousSystem.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_AutonomousSystem.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getSystemName <em>System Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Name</em>' attribute.
	 * @see #getSystemName()
	 * @generated
	 */
	void setSystemName(String value);

	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines whether this RouteMap is used for input, output, or both input and output filtering.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see #setDirection(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_Direction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Input\",\"Output\",\"Both\"]'"
	 * @generated
	 */
	Integer getDirection();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(Integer value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines whether the action should be to forward or deny traffic meeting the match condition specified in this RouteMap.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_Action()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\"]' Values='[\"Permit\",\"Deny\"]'"
	 * @generated
	 */
	Integer getAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Match Condition Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This specifies the criteria that must be matched in order for the corresponding MatchAction to take effect. The matching of the criteria may be specified by using a FilterList. For example, the command 'match ip address foo' uses the FilterList named 'foo' to do the matching of IP addresses.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Match Condition Type</em>' attribute.
	 * @see #setMatchConditionType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_MatchConditionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Other\",\"Source Address and Mask\",\"Destination Address and Mask\",\"Source Port\",\"Source Port Range\",\"Destination Port\",\"Destination Port Range\",\"Protocol Type\",\"Protocol Type and Option\"]' ModelCorrespondence='[\"CIM_BGPRouteMap.OtherMatchConditionType\"]'"
	 * @generated
	 */
	Integer getMatchConditionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getMatchConditionType <em>Match Condition Type</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_OtherMatchConditionType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_BGPRouteMap.MatchConditionType\"]'"
	 * @generated
	 */
	String getOtherMatchConditionType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getOtherMatchConditionType <em>Other Match Condition Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Match Condition Type</em>' attribute.
	 * @see #getOtherMatchConditionType()
	 * @generated
	 */
	void setOtherMatchConditionType(String value);

	/**
	 * Returns the value of the '<em><b>Set Metric Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines an additional action to take if the MatchCondition is satisfied. This definition is specifically limited to BGP filtering at this time. The actual value of the metric is specified in the SetMetricValue property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Metric Type</em>' attribute.
	 * @see #setSetMetricType(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_SetMetricType()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Origin\",\"AS_Path\",\"NEXT_HOP\",\"Multi_Exit_Disc\",\"Local_Pref\",\"Atomic_Aggregate\",\"Aggregator\",\"Community\",\"Originator_ID\"]' ModelCorrespondence='[\"CIM_BGPRouteMap.SetMetricValue\"]'"
	 * @generated
	 */
	Integer getSetMetricType();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getSetMetricType <em>Set Metric Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Metric Type</em>' attribute.
	 * @see #getSetMetricType()
	 * @generated
	 */
	void setSetMetricType(Integer value);

	/**
	 * Returns the value of the '<em><b>Set Metric Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is the value of the metric that is being set for the BGP attribute defined in the SetMetricType property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Set Metric Value</em>' attribute.
	 * @see #setSetMetricValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_BGPRouteMap_SetMetricValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getSetMetricValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_BGPRouteMap#getSetMetricValue <em>Set Metric Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Metric Value</em>' attribute.
	 * @see #getSetMetricValue()
	 * @generated
	 */
	void setSetMetricValue(String value);

} // CIM_BGPRouteMap
