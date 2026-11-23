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
 * A representation of the model object '<em><b>CIM Logical Port Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A collection of one or more ports that are logically grouped for administrative and discovery or topology purposes. LogicalPortGroups define port collections for access control, or for use in routing policy or other management tasks. For example, in Fibre Channel and Infiniband, a LogicalPortGroup represents the concept of a 'node'.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortGroup#getName <em>Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortGroup#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_LogicalPortGroup#getOtherNameFormat <em>Other Name Format</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortGroup()
 * @model annotation="http://schemas.dmtf.org/wbem/cim Version='2.10.0' UMLPackagePath='CIM::Device::Ports' keys='InstanceID'"
 * @generated
 */
@ProviderType
public interface CIM_LogicalPortGroup extends CIM_SystemSpecificCollection {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Name property defines the identity by which the LogicalPortGroup is known.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortGroup_Name()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='256' ModelCorrespondence='[\"CIM_LogicalPortGroup.NameFormat\"]'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The NameFormat property identifies how the Name of the LogicalPortGroup is generated.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see #setNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortGroup_NameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ValueMap='[\"Unknown\",\"Other\",\"WWN\",\"GUID\"]' MaxLen='64' ModelCorrespondence='[\"CIM_LogicalPortGroup.Name\",\"CIM_LogicalPortGroup.OtherNameFormat\"]'"
	 * @generated
	 */
	String getNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortGroup#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(String value);

	/**
	 * Returns the value of the '<em><b>Other Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that describes how the LogicalPortGroup is identified when the NameFormat is "Other".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Name Format</em>' attribute.
	 * @see #setOtherNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_LogicalPortGroup_OtherNameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' ModelCorrespondence='[\"CIM_LogicalPortGroup.Name\"]'"
	 * @generated
	 */
	String getOtherNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_LogicalPortGroup#getOtherNameFormat <em>Other Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other Name Format</em>' attribute.
	 * @see #getOtherNameFormat()
	 * @generated
	 */
	void setOtherNameFormat(String value);

} // CIM_LogicalPortGroup
