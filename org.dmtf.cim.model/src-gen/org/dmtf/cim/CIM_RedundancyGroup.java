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
 * A representation of the model object '<em><b>CIM Redundancy Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A class derived from LogicalElement that is a special collection of ManagedSystemElements. This collection indicates that the aggregated components together provide redundancy. All elements aggregated in a RedundancyGroup should be instantiations of the same object class. 
 * The use of this class is being deprecated in lieu of using the RedundancySet class.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_RedundancyGroup#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_RedundancyGroup#getRedundancyStatus <em>Redundancy Status</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_RedundancyGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Deprecated='[\"CIM_RedundancySet\"]' Version='2.13.0' UMLPackagePath='CIM::Core::Redundancy' override.Name='string' override.Name.Deprecated='[\"CIM_RedundancySet.InstanceID\"]' override.Name.Key='true' override.Name.Description='The RedundancyGroup Name serves as the key for the Group\'s instance in an enterprise environment.' override.Name.MaxLen='256' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_RedundancyGroup extends CIM_LogicalElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancyGroup_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Deprecated='[\"No value\"]' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancyGroup#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Redundancy Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RedundancyStatus provides information on the state of the RedundancyGroup. "Fully Redundant" (value=2) means that all of the configured redundancy is still available; "Degraded Redundancy" (3) means that some failures have been experienced but some reduced amount of redundancy is still available; "Redundancy Lost" (4) means that a sufficient number of failures have been experienced such that no redundancy is available and the next failure experienced will cause overall failure. Also, the values, "Other" (1) and "Unknown" (0), are defined.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Redundancy Status</em>' attribute.
	 * @see #setRedundancyStatus(Integer)
	 * @see org.dmtf.cim.CimPackage#getCIM_RedundancyGroup_RedundancyStatus()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='uint16' Deprecated='[\"CIM_RedundancySet.RedundancyStatus\"]' ValueMap='[\"0\",\"1\",\"2\",\"3\",\"4\"]' Values='[\"Unknown\",\"Other\",\"Fully Redundant\",\"Degraded Redundancy\",\"Redundancy Lost\"]'"
	 * @generated
	 */
	Integer getRedundancyStatus();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_RedundancyGroup#getRedundancyStatus <em>Redundancy Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Redundancy Status</em>' attribute.
	 * @see #getRedundancyStatus()
	 * @generated
	 */
	void setRedundancyStatus(Integer value);

} // CIM_RedundancyGroup
