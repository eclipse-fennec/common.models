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
 * A representation of the model object '<em><b>CIM System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * CIM_System represents an entity made up of component parts (defined by the SystemComponent relationship), that operates as a 'functional whole'. Systems are top-level objects in the CIM hierarchy, requiring no scoping or weak relationships in order to exist and have context. It should be reasonable to uniquely name and manage a System at an enterprise level. For example, a ComputerSystem is a kind of System that can be uniquely named and independently managed in an enterprise. However, these qualities are not true for the power supply (or the power supply sub-'system') within the computer. 
 * 
 * Although a System can be viewed as a Collection, this view is not the correct model. A Collection is simply a 'bag' that 'holds' its members. A System is a higher-level abstraction, built out of its individual components. It is more than the sum of its parts. Note that System is a subclass of EnabledLogicalElement which allows the entire abstraction to be functionally enabled or disabled at a higher level than enabling or disabling its component parts.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.dmtf.cim.CIM_System#getCreationClassName <em>Creation Class Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_System#getNameFormat <em>Name Format</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_System#getPrimaryOwnerName <em>Primary Owner Name</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_System#getPrimaryOwnerContact <em>Primary Owner Contact</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_System#getRoles <em>Roles</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_System#getOtherIdentifyingInfo <em>Other Identifying Info</em>}</li>
 *   <li>{@link org.dmtf.cim.CIM_System#getIdentifyingDescriptions <em>Identifying Descriptions</em>}</li>
 * </ul>
 *
 * @see org.dmtf.cim.CimPackage#getCIM_System()
 * @model abstract="true"
 *        annotation="http://schemas.dmtf.org/wbem/cim Abstract='true' Version='2.45.0' UMLPackagePath='CIM::Core::CoreElements' override.Name='string' override.Name.Key='true' override.Name.Description='The inherited Name serves as the key of a System instance in an enterprise environment.' override.Name.MaxLen='256' keys='CreationClassName,Name'"
 * @generated
 */
@ProviderType
public interface CIM_System extends CIM_AllocatedLogicalElement {
	/**
	 * Returns the value of the '<em><b>Creation Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CreationClassName indicates the name of the class or the subclass used in the creation of an instance. When used with the other key properties of this class, this property allows all instances of this class and its subclasses to be uniquely identified.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Creation Class Name</em>' attribute.
	 * @see #setCreationClassName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_System_CreationClassName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Key='true' MaxLen='256'"
	 * @generated
	 */
	String getCreationClassName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_System#getCreationClassName <em>Creation Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Creation Class Name</em>' attribute.
	 * @see #getCreationClassName()
	 * @generated
	 */
	void setCreationClassName(String value);

	/**
	 * Returns the value of the '<em><b>Name Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The System object and its derivatives are top-level objects of CIM. They provide the scope for numerous components. Having unique System keys is required. A heuristic can be defined in individual System subclasses to attempt to always generate the same System Name Key. The NameFormat property identifies how the System name was generated, using the heuristic of the subclass.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name Format</em>' attribute.
	 * @see #setNameFormat(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_System_NameFormat()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' MaxLen='64'"
	 * @generated
	 */
	String getNameFormat();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_System#getNameFormat <em>Name Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Format</em>' attribute.
	 * @see #getNameFormat()
	 * @generated
	 */
	void setNameFormat(String value);

	/**
	 * Returns the value of the '<em><b>Primary Owner Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The name of the primary system owner. The system owner is the primary user of the system.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Owner Name</em>' attribute.
	 * @see #setPrimaryOwnerName(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_System_PrimaryOwnerName()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MaxLen='64' MappingStrings='[\"MIF.DMTF|General Information|001.3\"]'"
	 * @generated
	 */
	String getPrimaryOwnerName();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_System#getPrimaryOwnerName <em>Primary Owner Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Name</em>' attribute.
	 * @see #getPrimaryOwnerName()
	 * @generated
	 */
	void setPrimaryOwnerName(String value);

	/**
	 * Returns the value of the '<em><b>Primary Owner Contact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * A string that provides information on how the primary system owner can be reached (for example, phone number, e-mail address, and so on).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #setPrimaryOwnerContact(String)
	 * @see org.dmtf.cim.CimPackage#getCIM_System_PrimaryOwnerContact()
	 * @model annotation="http://schemas.dmtf.org/wbem/cim cimType='string' Write='true' MaxLen='256' MappingStrings='[\"MIF.DMTF|General Information|001.4\"]'"
	 * @generated
	 */
	String getPrimaryOwnerContact();

	/**
	 * Sets the value of the '{@link org.dmtf.cim.CIM_System#getPrimaryOwnerContact <em>Primary Owner Contact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Primary Owner Contact</em>' attribute.
	 * @see #getPrimaryOwnerContact()
	 * @generated
	 */
	void setPrimaryOwnerContact(String value);

	/**
	 * Returns the value of the '<em><b>Roles</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array (bag) of strings that specifies the administrator -defined roles this System plays in the managed environment. Examples might be 'Building 8 print server' or 'Boise user directories'. A single system may perform multiple roles. 
	 * Note that the instrumentation view of the 'roles' of a System is defined by instantiating a specific subclass of System, or by properties in a subclass, or both. For example, the purpose of a ComputerSystem is defined using the Dedicated and OtherDedicatedDescription properties.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Roles</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_System_Roles()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' Write='true'"
	 * @generated
	 */
	EList<String> getRoles();

	/**
	 * Returns the value of the '<em><b>Other Identifying Info</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * OtherIdentifyingInfo captures additional data, beyond System Name information, that could be used to identify a ComputerSystem. One example would be to hold the Fibre Channel World-Wide Name (WWN) of a node. Note that if only the Fibre Channel name is available and is unique (able to be used as the System key), then this property would be NULL and the WWN would become the System key, its data placed in the Name property.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other Identifying Info</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_System_OtherIdentifyingInfo()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' MaxLen='256' ModelCorrespondence='[\"CIM_System.IdentifyingDescriptions\"]'"
	 * @generated
	 */
	EList<String> getOtherIdentifyingInfo();

	/**
	 * Returns the value of the '<em><b>Identifying Descriptions</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An array of free-form strings providing explanations and details behind the entries in the OtherIdentifying Info array. Note, each entry of this array is related to the entry in OtherIdentifyingInfo that is located at the same index.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Identifying Descriptions</em>' attribute list.
	 * @see org.dmtf.cim.CimPackage#getCIM_System_IdentifyingDescriptions()
	 * @model unique="false"
	 *        annotation="http://schemas.dmtf.org/wbem/cim cimType='string[]' ArrayType='Indexed' ModelCorrespondence='[\"CIM_System.OtherIdentifyingInfo\"]'"
	 * @generated
	 */
	EList<String> getIdentifyingDescriptions();

} // CIM_System
