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
 * A representation of the model object '<em><b>CIM Routing Policy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This class is used to implement routing policies. It aggregates a set of FilterLists, along with other appropriate constructs, into a unit. One of the most important uses of this class is to change the routing policy by changing values of various attributes in a consistent manner. 
 * 
 * A RoutingPolicy is weak to the network device (i.e., the ComputerSystem) that contains it. Hence, the ComputerSystem keys are propagated to this class. 
 * 
 * Note that this class was defined before the Policy Model and hence is not positioned in that hierarchy. The class will be repositioned in a later release of the Network Model.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getSystemCreationClassName <em>System Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getSystemName <em>System Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getAction <em>Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getAttributeAction <em>Attribute Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getBGPAction <em>BGP Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getBGPValue <em>BGP Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getRemarkAction <em>Remark Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getRemarkValue <em>Remark Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getConditioningAction <em>Conditioning Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getOtherConditioningAction <em>Other Conditioning Action</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutingPolicy#getConditioningValue <em>Conditioning Value</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.7.0' UMLPackagePath='CIM::Network::RoutingForwarding' override.Name='string' override.Name.Key='true' override.Name.Description='This is the name of the Routing Policy.' override.Name.MaxLen='256' keys='SystemCreationClassName,SystemName,CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RoutingPolicy extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>System Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The scoping ComputerSystem's CreationClassName.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Creation Class Name</em>' attribute.
	 * @see #setSystemCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_SystemCreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.CreationClassName'"
	 * @generated
	 */
	String getSystemCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getSystemCreationClassName <em>System Creation Class Name</em>}' attribute.
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
	 * The scoping ComputerSystem's Name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>System Name</em>' attribute.
	 * @see #setSystemName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_SystemName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256' Propagated='CIM_ComputerSystem.Name'"
	 * @generated
	 */
	String getSystemName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getSystemName <em>System Name</em>}' attribute.
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
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines the type of action that will be performed if the match conditions of the policy are met. The match conditions are defined by the associated ListsIn RoutingPolicy. There are essentially three choices: forward the traffic unmodified, forward the traffic but modify either the attributes describing the route and/or other attributes that define how to condition the traffic (e.g., its ToS byte settings), or prevent the traffic from being forwarded.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_Action()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\"]' Values='[\"Accept As Is\",\"Accept With Protocol Attribute Changes\",\"Accept and Remark Packet\",\"Accept With Protocol Attribute Changes and Remark\",\"Accept With Other Action\",\"Accept With Protocol Attribute Changes and Other Action\",\"Accept with Remark and Other Action\",\"Accept with Protocol Attribute Changes, Remark and Other Action\",\"Deny\"]'"
	 * @generated
	 */
	Integer getAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Attribute Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This controls whether protocol-specific attributes replace, get prepended, or get appended to their existing values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Attribute Action</em>' attribute.
	 * @see #setAttributeAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_AttributeAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\"]' Values='[\"Replace\",\"Prepend\",\"Append\"]' ModelCorrespondence='[\"CIM_RoutingPolicy.BGPAction\"]'"
	 * @generated
	 */
	Integer getAttributeAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getAttributeAction <em>Attribute Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Action</em>' attribute.
	 * @see #getAttributeAction()
	 * @generated
	 */
	void setAttributeAction(Integer value);

	/**
	 * Returns the value of the '<em><b>BGP Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines one or more BGP-specific attributes that should be used to modify this routing update.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BGP Action</em>' attribute.
	 * @see #setBGPAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_BGPAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\",\"8\",\"9\",\"10\"]' Values='[\"Origin\",\"AS_Path\",\"NEXT_HOP\",\"Multi_Exit_Disc\",\"Local_Pref\",\"Atomic_Aggregate\",\"Aggregator\",\"Community\",\"Originator_ID\",\"Cluster_List\"]' ModelCorrespondence='[\"CIM_RoutingPolicy.BGPValue\"]'"
	 * @generated
	 */
	Integer getBGPAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getBGPAction <em>BGP Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Action</em>' attribute.
	 * @see #getBGPAction()
	 * @generated
	 */
	void setBGPAction(Integer value);

	/**
	 * Returns the value of the '<em><b>BGP Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value for the corresponding BGPAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BGP Value</em>' attribute.
	 * @see #setBGPValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_BGPValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RoutingPolicy.BGPAction\"]'"
	 * @generated
	 */
	String getBGPValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getBGPValue <em>BGP Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BGP Value</em>' attribute.
	 * @see #getBGPValue()
	 * @generated
	 */
	void setBGPValue(String value);

	/**
	 * Returns the value of the '<em><b>Remark Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines a remarking action for this traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remark Action</em>' attribute.
	 * @see #setRemarkAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_RemarkAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Change DSCP\",\"Change ToS\",\"Change 802.1Q Value\",\"Change CIR\",\"Change CBR\",\"Change ABR\",\"Change VBR\"]' ModelCorrespondence='[\"CIM_RoutingPolicy.RemarkValue\"]'"
	 * @generated
	 */
	Integer getRemarkAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getRemarkAction <em>Remark Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark Action</em>' attribute.
	 * @see #getRemarkAction()
	 * @generated
	 */
	void setRemarkAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Remark Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value for the corresponding RemarkAction.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Remark Value</em>' attribute.
	 * @see #setRemarkValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_RemarkValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RoutingPolicy.RemarkAction\"]'"
	 * @generated
	 */
	String getRemarkValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getRemarkValue <em>Remark Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remark Value</em>' attribute.
	 * @see #getRemarkValue()
	 * @generated
	 */
	void setRemarkValue(String value);

	/**
	 * Returns the value of the '<em><b>Conditioning Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This defines another action to be taken for this traffic.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditioning Action</em>' attribute.
	 * @see #setConditioningAction(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_ConditioningAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Other\",\"Input Flow Policing\",\"Output Flow Policing\",\"Input Aggregate Policing\",\"Output Aggregate Policing\",\"Police By Marking Down\",\"Police By Dropping Down\"]' ModelCorrespondence='[\"CIM_RoutingPolicy.ConditioningValue\",\"CIM_RoutingPolicy.OtherConditioningAction\"]'"
	 * @generated
	 */
	Integer getConditioningAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getConditioningAction <em>Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditioning Action</em>' attribute.
	 * @see #getConditioningAction()
	 * @generated
	 */
	void setConditioningAction(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Conditioning Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * If the value of the ConditioningAction property of this class is 1, this contains an application-specific type of conditioning that is to be performed. Otherwise, if the ConditioningAction property is any other value, the value of this property should be NULL.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Conditioning Action</em>' attribute.
	 * @see #setOtherConditioningAction(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_OtherConditioningAction()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RoutingPolicy.ConditioningAction\"]'"
	 * @generated
	 */
	String getOtherConditioningAction();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getOtherConditioningAction <em>Other Conditioning Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Conditioning Action</em>' attribute.
	 * @see #getOtherConditioningAction()
	 * @generated
	 */
	void setOtherConditioningAction(String value);

	/**
	 * Returns the value of the '<em><b>Conditioning Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The value for the corresponding ConditioningAction, if appropriate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conditioning Value</em>' attribute.
	 * @see #setConditioningValue(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutingPolicy_ConditioningValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_RoutingPolicy.ConditioningAction\"]'"
	 * @generated
	 */
	String getConditioningValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutingPolicy#getConditioningValue <em>Conditioning Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conditioning Value</em>' attribute.
	 * @see #getConditioningValue()
	 * @generated
	 */
	void setConditioningValue(String value);

} // CIM_RoutingPolicy
