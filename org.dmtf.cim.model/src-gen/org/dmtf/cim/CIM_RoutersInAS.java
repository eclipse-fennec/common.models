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
 * A representation of the model object '<em><b>CIM Routers In AS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This aggregation establishes 'whole-part' relationships between an AutonomousSystem and the routers that it contains. In addition, the routers in the AS share common configuration information, and are commonly administered.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RoutersInAS#getBGPSupportedAttributes <em>BGP Supported Attributes</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutersInAS#getAddCommunityValue <em>Add Community Value</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutersInAS#getRole <em>Role</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RoutersInAS#getOtherRoleDescription <em>Other Role Description</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RoutersInAS()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Association='true' Aggregation='true' Composition='true' Version='2.7.0' UMLPackagePath='CIM::Network::Systems' override.GroupComponent='CIM_AutonomousSystem REF' override.GroupComponent.Aggregate='true' override.GroupComponent.Max='1' override.GroupComponent.Description='The AutonomousSystem that aggregates the routers belonging to it and administers them.' override.PartComponent='CIM_ComputerSystem REF' override.PartComponent.Description='The Routers that are contained in the AS.' keys='GroupComponent,PartComponent'"
 * @generated
 */
@ProviderType
public interface CIM_RoutersInAS extends CIM_SystemComponent {
	/**
	 * Returns the value of the '<em><b>BGP Supported Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an array of strings that contain the BGP attributes supported by this router.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BGP Supported Attributes</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutersInAS_BGPSupportedAttributes()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]'"
	 * @generated
	 */
	EList<String> getBGPSupportedAttributes();

	/**
	 * Returns the value of the '<em><b>Add Community Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * TRUE means that the community value of this router is added to the existing community value, and FALSE means that the community value of this router replaces the existing community value.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Add Community Value</em>' attribute.
	 * @see #setAddCommunityValue(Boolean)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutersInAS_AddCommunityValue()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='boolean'"
	 * @generated
	 */
	Boolean getAddCommunityValue();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutersInAS#getAddCommunityValue <em>Add Community Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Add Community Value</em>' attribute.
	 * @see #getAddCommunityValue()
	 * @generated
	 */
	void setAddCommunityValue(Boolean value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * This is an enumeration that defines the function, from the point of view of BGP, of this router.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutersInAS_Role()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\",\"5\",\"6\",\"7\"]' Values='[\"Unknown\",\"Other\",\"Conventional BGP Speaker\",\"Route Reflector\",\"Router Reflector Client\",\"Route Reflector Non-Client\",\"Peer Group Member\",\"Confederation Member\"]'"
	 * @generated
	 */
	Integer getRole();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutersInAS#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(Integer value);

	/**
	 * Returns the value of the '<em><b>Other Role Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string describing the type of function that this router has in its AS when the value of the Role property of this class is set to 1 (i.e., "Other"). The format of the string inserted in this property should be similar in format to the values defined for the Role property. This property should be set to NULL when the Role property is any value other than 1.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Role Description</em>' attribute.
	 * @see #setOtherRoleDescription(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RoutersInAS_OtherRoleDescription()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getOtherRoleDescription();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RoutersInAS#getOtherRoleDescription <em>Other Role Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Role Description</em>' attribute.
	 * @see #getOtherRoleDescription()
	 * @generated
	 */
	void setOtherRoleDescription(String value);

} // CIM_RoutersInAS
