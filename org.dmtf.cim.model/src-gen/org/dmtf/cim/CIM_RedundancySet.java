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

import org.eclipse.emf.common.util.EList;

import org.osgi.annotation.versioning.ProviderType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CIM Redundancy Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from SystemSpecificCollection that is a special collection of ManagedElements. This collection indicates that the aggregated elements together provide redundancy, or that redundancy is provided via sparing. All elements collected in a RedundancySet SHOULD be instantiations of the same object class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getRedundancyStatus <em>Redundancy Status</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getTypeOfSet <em>Type Of Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getMinNumberNeeded <em>Min Number Needed</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getMaxNumberSupported <em>Max Number Supported</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getVendorIdentifyingInfo <em>Vendor Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getOtherTypeOfSet <em>Other Type Of Set</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getLoadBalanceAlgorithm <em>Load Balance Algorithm</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancySet#getOtherLoadBalanceAlgorithm <em>Other Load Balance Algorithm</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.18.0' UMLPackagePath='CIM::Core::Redundancy' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_RedundancySet extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Redundancy Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RedundancyStatus provides information on the state of the RedundancyGroup. 'Fully Redundant' (value=2) means that all of the configured redundancy is still available; 'Degraded Redundancy' (3) means that some configured elements are degraded, missing or failed but that the number of elements in the set is still greater than the minimum required ('MinNumberNeeded'); 'Redundancy Lost' (4) means that sufficient configured elements are missing or failed that no redundancy is available and the next failure experienced will cause overall failure. 'Overall Failure' (5) means that there has been an overall failure of the RedundancySet.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redundancy Status</em>' attribute.
	 * @see #setRedundancyStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_RedundancyStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\"]' Values='[\"Unknown\",\"DMTF Reserved\",\"Fully Redundant\",\"Degraded Redundancy\",\"Redundancy Lost\",\"Overall Failure\"]' ModelCorrespondence='[\"CIM_RedundancySet.MinNumberNeeded\"]'"
	 * @generated
	 */
	Integer getRedundancyStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancySet#getRedundancyStatus <em>Redundancy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundancy Status</em>' attribute.
	 * @see #getRedundancyStatus()
	 * @generated
	 */
	void setRedundancyStatus(Integer value);

	/**
	 * Returns the value of the '<em><b>Type Of Set</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TypeOfSet provides information on the type of redundancy. N+1 (=2) indicates all members are active, are unaware and function independent of one another. However, there exist at least one extra member to achieve functionality. 'Sparing' is implied (i.e. each member can be a spare for the other(s). An example of N+1 is a system that has 2 power supplies, but needs only 1 power supply to functioning properly. N+1 is a special case of N+M redundancy where M=1. A value of N+1 (=2) shall be used for N+M redundancy. - Load Balanced (=3) indicates all members are active. However, there functionality is not independent of each other. Their functioning is determined by some sort of load balancing algrothim (implemented in hardware and/or software). 'Sparing' is implied (i.e. each member can be a spare for the other(s). 
	 * - Sparing (=4) indicates that all members are active and are aware of each others. However, their functionality is independent until failover. Each member can be a spare for the other(s). 
	 * - Limited Sparing (=5) indicates that all members are active, and they may or may not be aware of each and they are not spares for each other. Instead, their redundancy is indicated by the IsSpare relationship.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type Of Set</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_TypeOfSet()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16[]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"..\",\"0x8000..\"]' Values='[\"Unknown\",\"Other\",\"N+1\",\"Load Balanced\",\"Sparing\",\"Limited Sparing\",\"DMTF Reserved\",\"Vendor Reserved\"]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RedundancySet.OtherTypeOfSet\"]'"
	 * @generated
	 */
	EList<Integer> getTypeOfSet();

	/**
	 * Returns the value of the '<em><b>Min Number Needed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MinNumberNeeded indicates the smallest number of elements that MUST be operational in order to function. For example, in an N+1 redundancy relationship, the MinNumberNeeded property is set equal to N. In a 'LimitedSparing' environment, this property is meaningless and SHOULD be set to zero.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Number Needed</em>' attribute.
	 * @see #setMinNumberNeeded(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_MinNumberNeeded()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' MinValue='0'"
	 * @generated
	 */
	Long getMinNumberNeeded();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancySet#getMinNumberNeeded <em>Min Number Needed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Number Needed</em>' attribute.
	 * @see #getMinNumberNeeded()
	 * @generated
	 */
	void setMinNumberNeeded(Long value);

	/**
	 * Returns the value of the '<em><b>Max Number Supported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * MaxNumberSupported indicates the largest number of elements that can participate in the RedundancySet. A value of 0 indicates there is no limit on the number of elements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Max Number Supported</em>' attribute.
	 * @see #setMaxNumberSupported(Long)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_MaxNumberSupported()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32'"
	 * @generated
	 */
	Long getMaxNumberSupported();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancySet#getMaxNumberSupported <em>Max Number Supported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Number Supported</em>' attribute.
	 * @see #getMaxNumberSupported()
	 * @generated
	 */
	void setMaxNumberSupported(Long value);

	/**
	 * Returns the value of the '<em><b>Vendor Identifying Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * VendorIdentifyingInfo captures the vendor identifying data for the RedundancySet. One example is the product name for a cluster.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vendor Identifying Info</em>' attribute.
	 * @see #setVendorIdentifyingInfo(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_VendorIdentifyingInfo()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string'"
	 * @generated
	 */
	String getVendorIdentifyingInfo();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancySet#getVendorIdentifyingInfo <em>Vendor Identifying Info</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vendor Identifying Info</em>' attribute.
	 * @see #getVendorIdentifyingInfo()
	 * @generated
	 */
	void setVendorIdentifyingInfo(String value);

	/**
	 * Returns the value of the '<em><b>Other Type Of Set</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When the corresponding array entry in TypeOfSet[] is 'Other', this entry provides a string describing the type of set.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Type Of Set</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_OtherTypeOfSet()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_RedundancySet.TypeOfSet\"]'"
	 * @generated
	 */
	EList<String> getOtherTypeOfSet();

	/**
	 * Returns the value of the '<em><b>Load Balance Algorithm</b></em>' attribute.
	 * The default value is <code>"2"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The current load balance algorithm. 
	 * Least Blocks, Least IO, and Address Region are used in storage device path redundancy drivers to optimize load balancing by routing requests to a path with the least queued blocks or IO requests, or based on locality of reference. 
	 * 'Product Specific' indicates that the algorithm is optimized for a particular type of product. Information about that product SHOULD be provided in an associated CIM_Product instance.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Load Balance Algorithm</em>' attribute.
	 * @see #setLoadBalanceAlgorithm(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_LoadBalanceAlgorithm()
	 * @model default="2"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Write='true' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"No Load Balancing\",\"Round Robin\",\"Least Blocks\",\"Least IO\",\"Address Region\",\"Product Specific\"]' ModelCorrespondence='[\"CIM_RedundancySet.OtherLoadBalanceAlgorithm\"]'"
	 * @generated
	 */
	Integer getLoadBalanceAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancySet#getLoadBalanceAlgorithm <em>Load Balance Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Load Balance Algorithm</em>' attribute.
	 * @see #getLoadBalanceAlgorithm()
	 * @generated
	 */
	void setLoadBalanceAlgorithm(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Load Balance Algorithm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When LoadBalanceAlgorithm is Other, this property describes the algorithm.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Load Balance Algorithm</em>' attribute.
	 * @see #setOtherLoadBalanceAlgorithm(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancySet_OtherLoadBalanceAlgorithm()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' ModelCorrespondence='[\"CIM_RedundancySet.LoadBalanceAlgorithm\"]'"
	 * @generated
	 */
	String getOtherLoadBalanceAlgorithm();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancySet#getOtherLoadBalanceAlgorithm <em>Other Load Balance Algorithm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Load Balance Algorithm</em>' attribute.
	 * @see #getOtherLoadBalanceAlgorithm()
	 * @generated
	 */
	void setOtherLoadBalanceAlgorithm(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This method forces a failover from one ManagedElement to another. There are two parameters to the Failover method. 
	 * - FailoverFrom is a reference to an 'active' ManagedElement that will become inactive after the method. This element SHOULD be part of the RedundancySet via a MemberOfCollection relationship. 
	 * - FailoverTo is a reference to the ManagedElement that will take over for the FailoverFrom element. This element SHOULD either be a member of the RedundancySet or be associated with the RedundancySet via an IsSpare relationship. 
	 * 
	 * Upon sucessful completion: 
	 * - the FailoverTo element SHOULD be associated to the RedundancySet via MemberOfCollection. 
	 * - the FailFrom element SHOULD either still be associated to the RedundandySet via MemberOfCollection with a OperationalStatus or EnableState that indicates it not active, or it SHOULD be associated to the 'Spared' collection via the MemberOfCollection association.
	 * @param FailoverFrom The primary ManagedSystemElement that will become inactive after the method.
	 * @param FailoverTo The ManagedSystemElement that will take over from the primary MSE.
	 * <!-- end-model-doc -->
	 * @model FailoverFromAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'" FailoverToAnnotation="http://schemas.dmtf.org/wbem/cim cimType='CIM_ManagedElement REF' In='true'"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='uint32' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"..\",\"32768..65535\"]' Values='[\"Completed with No Error\",\"Not Supported\",\"Unknown/Unspecified Error\",\"Busy/In Use\",\"Paramter Error\",\"DMTF Reserved\",\"Vendor Reserved\"]'"
	 * @generated
	 */
	Long Failover(CIM_ManagedElement FailoverFrom, CIM_ManagedElement FailoverTo);

} // CIM_RedundancySet
